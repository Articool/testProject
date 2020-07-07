package project.order.elements;

public class OrderElementsCalendar {

    /**
     * Кнопка календаря Дата завершения приема заявок
     *
     * @return
     */

    public static String calendarDateApplication() {
        return "//input[@name='replyUntil']/../../div[@class='common-input-box__wrapper']";
    }

    /**
     * Кнопка календаря Дата выбора победителя
     *
     * @return
     */

    public static String calendarDateWin() {
        return "//input[@name='acceptAt']/../../div[@class='common-input-box__wrapper']";
    }

    /**
     * Кнопка календаря Дата поставки
     *
     * @return
     */

    public static String calendarDateDelivery() {
        return "//input[@name='deliveryAt']/../../div[@class='common-input-box__wrapper']";
    }

    /**
     * Выбор следующего месяца в календаре
     *
     * @return
     */

    public static String calendarNextMoth() {
        return "//div[@class='common-calendar__month-selector common-calendar__month-selector_type_days ']/div[2]";
    }

    /**
     * Выбор прошлого месяца в календаре
     *
     * @return
     */

    public static String calendarLastMoth() {
        return "//div[@class='common-calendar__month-selector common-calendar__month-selector_type_days ']/div[1]";
    }

    /**
     * Выбор дня в календаре 27
     *
     * @return
     */

    public static String calendarSelectDay() {
        return "//span[text()='27']";
    }

    /**
     * Кнопка применить изменения в календаре
     *
     * @return
     */

    public static String calendarApply() {
        return "//span[text()='Применить']";
    }

    /**
     * Кнопка сбросить изменения в календаре
     *
     * @return
     */

    public static String calendarReset() {
        return "//span[text()='Сбросить']";
    }


}
