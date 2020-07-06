package project.setup;


import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import project.ElementAction;
//import project.Global;
//import project.system.AllureScreenshot;
//import project.system.DateFormat;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public abstract class TestBase {

    /**
     * Цветная командная строка
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    /**
     * Настройка TestWatcher
     */
    public class MyRule extends TestWatcher {

        //переменная позволяющая определить упал тест или удачно прошел
        boolean fail;
        boolean enableVideo = false;

        /**
         * Правило выполняется при удачном прохождении теста
         * @param description
         */
        @Override
        protected void succeeded(Description description) {

        }

        /**
         * Правило выполняется в случае если тест прошел не удачно
         * @param e
         * @param description
         */
        @Override
        protected void failed(Throwable e, Description description) {
        //    System.out.println(DateFormat.plusDay(0,"yyyy-MM-dd'T'HH:mm:ssZ"));

            System.out.println(ANSI_RED + "Тест упал: " + description.toString() + ANSI_RED);
            System.out.println(ANSI_RED + "С ошибкой: " + e.toString() + ANSI_RESET);
            if (DriverBase.getDriver() != null) {
                File scrFile = ((TakesScreenshot) DriverBase.getDriver()).getScreenshotAs(OutputType.FILE);
                String imgName = ".\\target\\screenshots\\FAIL-screenshot" + System.currentTimeMillis() + "__" + description.toString() + ".png";     //объявление имени скриншота
                try {
                    FileUtils.copyFile(scrFile, new File(imgName));    //копирование скриншота
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
           //     AllureScreenshot.makeScreenshot(e.toString());
            } else {
                throw new IllegalArgumentException("Метод для получения скриншота не вызывается. " +
                        "По причине driver= " + DriverBase.getDriver());
            }
            fail = true;
        }

        /**
         * Правило выполняется после завершения теста
         * @param description
         */
        @Override
        protected void finished(Description description) {
            String sessionID = ((RemoteWebDriver) DriverBase.getDriver()).getSessionId().toString();
            if (DriverBase.getDriver() != null) {
                DriverBase.getDriver().quit();
            }

            if(fail & enableVideo) {
                ElementAction.sleep(10000);
               // attachVideo(sessionID,description.getClassName() + "#" + description.getMethodName());
            } else {
                if (enableVideo){
                    ElementAction.sleep(10000);
                    //удаляем видео чтобы не копилось
                //    String videoUrl = "http://" + Global.selenoid + ":4444/video/" + sessionID + ".mp4";
                  //  deleteSelenoidVideo(videoUrl);
                }

            }
        }

        /**
         * Правило выполняется при старте теста
         * @param description
         */
        @Override
        protected void starting(Description description) {
            System.out.println(ANSI_GREEN + "Начало теста: " + description.toString() + ANSI_RESET);
            DriverBase.initDriver(description);
        }

    }

    @Rule
    public MyRule myRule = new MyRule();

    /**
     * Аттачит видео из selenoid в allure
     * @param sessionId id сессии
     * @param fileName  новое наименование файла, которое попадет в /target/video/
     */

    /*
    public static void attachVideo(String sessionId,String fileName) {
        try {
            String videoUrl = "http://" + Global.selenoid + ":4444/video/" + sessionId + ".mp4";
            URL url = new URL(videoUrl);

            String path = new File("").getAbsolutePath() + "/target/video/" + fileName + ".mp4";
            File f = new File(path);

            f.getParentFile().mkdirs();
            f.createNewFile();

            InputStream in = url.openStream();
            java.nio.file.Files.copy(in, Paths.get(path), StandardCopyOption.REPLACE_EXISTING);

            deleteSelenoidVideo(videoUrl);
        } catch (Exception e) {
            System.out.println("attachVideo");
            e.printStackTrace();
        }
    }


     */
    /**
     * Удаление curl'ом видео на хосте selenoid
     * @param url   url по которому хранится видео
     */
    public static void deleteSelenoidVideo(String url) {
        try {
            String command  = "curl -X DELETE " + url;
            Process process = Runtime.getRuntime().exec(command);
            process.getInputStream();
        } catch (IOException e) {
            System.out.println("deleteSelenoidVideo");
            e.printStackTrace();
        }
    }

    /**
     * Передаем запускаемый класс и наименование теста
     * @param nameTest
     * @return
     */
    private boolean failedTest(String nameTest){
        String failedTest = System.getenv("FailedTest");
            if(failedTest!=null) {
                if (failedTest.contains(nameTest)) {
                    //если есть то записываем
                    System.out.println("video: true");
                    return true;
                } else {
                    //если нету то не записываем
                    System.out.println("video: false");
                    return false;
                }
            }
        return false;
    }
}
