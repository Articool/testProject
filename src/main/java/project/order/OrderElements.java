package project.order;

public class OrderElements {
    /**
     * Кнопка "Создать заказ"
     *
     * @return
     */

    public static String newOrder() {
        return "//div[text()='Создать заказ']";
    }

    /**
     * Поиск выбора категории
     *
     * @return
     */

    public static String searchCategory() {
        return "//input[@placeholder='Наименование категории']";
    }

    /**
     * Верхняя категория
     *
     * @return
     */

    public static String topCategory() {
        return "//span[@class='step-one__search']";
    }

    /**
     * Кнопка Далее на форме выбора категории
     *
     * @return
     */

    public static String buttonNext() {
        return "//span[text()='Далее']";
    }

    /**
     * Выбор региона доставки
     *
     * @return
     */

    public static String selectRegion() {
        return "//input[@placeholder='Выбрать регион']";
    }

    /**
     * Выбор цены мин.
     *
     * @return
     */

    public static String selectPriceMin() {
        return "//input[@placeholder='Мин.']";
    }

    /**
     * Выбор цены макс.
     *
     * @return
     */

    public static String selectPriceMax() {
        return "//input[@placeholder='Макс.']";
    }

    /**
     * Выбор количества
     *
     * @return
     */

    public static String selectCount() {
        return "//input[@value='1']";
    }

    /**
     * Прибавление количества
     *
     * @return
     */

    public static String plusCount() {
        return "//button[@class='counter__button counter__button_position_right']";
    }

    /**
     * Уменьшение количества
     *
     * @return
     */

    public static String minusCount() {
        return "//button[@class='counter__button counter__button_position_left']";
    }

    /**
     * Выбор единицы измерения
     *
     * @return
     */

    public static String unit() {
        return "//input[@placeholder='Введите данные']";
    }

}
