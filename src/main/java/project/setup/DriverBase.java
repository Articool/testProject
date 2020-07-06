package project.setup;

import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;

public class DriverBase {

    //хранение класса в созданном потоке
    private static ThreadLocal<DriverFactory> driverFactory;

    /**
     * Для данного потока создается новый класс DriverFactory
     */
    static {
        driverFactory=ThreadLocal.withInitial(DriverFactory::new);
    }

    /**
     * Возвращает драйвер
     * @return
     */
    public static WebDriver getDriver() {
        return driverFactory.get().getDriver();
    }

    /**
     * Инициализация драйвера
     * @param description
     */
    public static void initDriver(Description description) {
        driverFactory.get().instantiateWebDriver(description);
    }

    /**
     * Возвращает Номер процедуры
     * @return
     */
    public static String getProcedureNumber() {
        return driverFactory.get().getProcedureNumber();
    }

    /**
     * Номер процедуры
     * @param number    Номер процедуры
     */
    public static void setProcedureNumber (String number) {
        driverFactory.get().setProcedureNumber(number);
    }
}
