package project.order.elements;

import project.ElementXpath;

public class OrderElementsCalendar {

    /**
     * Кнопка календаря Дата завершения приема заявок
     */

    public static String calendarDateApplication() {
        return ElementXpath.inputName("replyUntil']/../../div[@class='common-input-box__wrapper");
    }

    /**
     * Кнопка календаря Дата выбора победителя
     */

    public static String calendarDateWin() {
        return "//input[@name='acceptAt']/../../div[@class='common-input-box__wrapper']";
    }

    /**
     * Кнопка календаря Дата поставки
     */

    public static String calendarDateDelivery() {
        return "//input[@name='deliveryAt']/../../div[@class='common-input-box__wrapper']";
    }

    /**
     * Выбор следующего месяца в календаре
     */

    public static String calendarNextMoth() {
        return "//div[@class='common-calendar__month-selector common-calendar__month-selector_type_days ']/div[2]";
    }

    /**
     * Выбор прошлого месяца в календаре
     */

    public static String calendarLastMoth() {
        return "//div[@class='common-calendar__month-selector common-calendar__month-selector_type_days ']/div[1]";
    }

    /**
     * Выбор дня в календаре
     * В day передать дату 1-31 в зависимости от месяца в формате String
     */

    public static String calendarSelectDay(String day) {
        return ElementXpath.spanText(day);
    }

    /**
     * Кнопка применить изменения в календаре
     */

    public static String calendarApply() {
        return ElementXpath.spanText("Применить");
    }

    /**
     * Кнопка сбросить изменения в календаре
     */

    public static String calendarReset() {
        return ElementXpath.spanText("Сбросить");
    }
}
