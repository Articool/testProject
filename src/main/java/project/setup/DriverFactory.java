package project.setup;

import org.junit.runner.Description;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import project.Global;
//import project.Global;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class DriverFactory {


    private WebDriver driver;
    private String procedureNumber;

    /**
     * Номер процедуры
     * @param number    Номер процедуры
     */
    public void setProcedureNumber(String number) {
        procedureNumber = number;
    }

    /**
     * Возвращает номер процедуры
     * @return
     */
    public String getProcedureNumber() {
        return procedureNumber;
    }

    /**
     * Возвращает драйвер
     * @return
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Инициализация драйвера
     * @param description
     */
    public void instantiateWebDriver(Description description) {
      //  Dimension d = new Dimension(1920, 1080);
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("safebrowsing.enabled", "true");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("prefs", chromePrefs);
        options.addExtensions(new File("File/1.2.7.crx"));

        System.setProperty("webdriver.chrome.driver", "E:/Programmer/chrome/chromedriver.exe");
        driver = new ChromeDriver(options);
/*
        //для паралельных тестов
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true); // Для включения просмотра по VNC client через веб-часть.
        capabilities.setCapability("screenResolution", "1920x1080x24"); // Ширина, высота, глубина цвета
        capabilities.setCapability("enableVideo", false);
        capabilities.setCapability("name", description.toString()); // Кастомное название теста.
        capabilities.setBrowserName("chrome"); //Браузер в котором нужно проверять.
        capabilities.setVersion(System.getenv("remoteGOS")); //Версия браузера.
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);


        try {
            driver = new RemoteWebDriver(URI.create("http://" + Global.selenoid + ":4444/wd/hub").toURL(), capabilities); // Урл для запуска где стоит хост-машина, а так же надстройки определенные выше.
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        ((RemoteWebDriver) driver).setFileDetector(new LocalFileDetector()); //Необходимо использовать если загружаете файлы.

 */
      //  driver.manage().window().setSize(d);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Global.homePage);
    }
}
