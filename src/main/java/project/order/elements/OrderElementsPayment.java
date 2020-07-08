package project.order.elements;

import project.ElementXpath;

public class OrderElementsPayment {

    /**
     * Кнопка выбора способа оплаты
     */
//TODO Удалить 1
    public static String pay1() {
        return "//input[@placeholder='Выберите из списка']";
    }

    public static String pay() {
        return ElementXpath.inputPlaceholder("Выберите из списка");
    }

    /**
     * Способ оплаты: По предоплате
     */

    public static String payPrepayment1() {
        return "//div[text()='По предоплате']";
    }

    public static String payPrepayment() {
        return ElementXpath.divText("По предоплате");
    }

    /**
     * Способ оплаты: По факту
     */

    public static String payPostpaid1() {
        return "//div[text()='По факту получения']";
    }

    public static String payPostpaid() {
        return ElementXpath.divText("По факту получения");
    }

    /**
     * Способ оплаты: С отсрочкой платежа
     */

    public static String payDelay1() {
        return "//div[text()='С отсрочкой платежа']";
    }

    public static String payDelay() {
        return ElementXpath.divText("С отсрочкой платежа");
    }

    /**
     * Способ оплаты: Другое
     */

    public static String payOther1() {
        return "//div[text()='Другое']";
    }

    public static String payOther() {
        return ElementXpath.divText("Другое");
    }
}
