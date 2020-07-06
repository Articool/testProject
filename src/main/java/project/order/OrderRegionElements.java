package project.order;

public class OrderRegionElements {

    /**
     * Регион Москва
     * @return
     */
    public static String regionMoscow() {
        return "//div[text()='Москва г., Россия']";
    }

    /**
     * Регион Санкт-Петербург
     * @return
     */
    public static String regionStPetersburg() {
        return "//div[text()='Санкт-Петербург г., Россия']";
    }

    /**
     * Регион Екатеринбург
     * @return
     */
    public static String regionYekaterinburg() {
        return "//div[text()='г. Екатеринбург, Свердловская обл., Россия']";
    }

    /**
     * Регион Казань
     * @return
     */
    public static String regionKazan() {
        return "//div[text()='г. Казань, Татарстан Респ., Россия']";
    }

    /**
     * Регион Челябинск
     * @return
     */
    public static String regionChelyabinsk() {
        return "//div[text()='г. Челябинск, Челябинская обл., Россия']";
    }

    /**
     * Регион Самара
     * @return
     */
    public static String regionSamara() {
        return "//div[text()='г. Самара, Самарская обл., Россия']";
    }
}
