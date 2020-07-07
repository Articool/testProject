package project.order.elements;

public class OrderElementsPayment {

    /**
     * Кнопка выбора способа оплаты
     *
     * @return
     */

    public static String pay() {
        return "//input[@placeholder='Выберите из списка']";
    }

    /**
     * Способ оплаты: По предоплате
     *
     * @return
     */

    public static String payPrepayment() {
        return "//div[text()='По предоплате']";
    }

    /**
     * Способ оплаты: По факту
     *
     * @return
     */

    public static String payPostpaid() {
        return "//div[text()='По факту получения']";
    }

    /**
     * Способ оплаты: С отсрочкой платежа
     *
     * @return
     */

    public static String payDelay() {
        return "//div[text()='С отсрочкой платежа']";
    }
    /**
     * Способ оплаты: Другое
     *
     * @return
     */

    public static String payOther() {
        return "//div[text()='Другое']";
    }
}
