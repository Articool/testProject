package project.order.elements;

import project.ElementXpath;

public class OrderElements {

    //TODO Удалить 1

    /**
     * Кнопка "Создать заказ"
     */
    public static String newOrder() {
        return ElementXpath.divText("Создать заказ");
    }

    /**
     * Поиск выбора категории Заказов
     */

    public static String searchCategory() {
        return ElementXpath.inputPlaceholder("Наименование категории");
    }

    /**
     * Выбор самой верхней категории после поиска
     */

    public static String topCategory() {
        return ElementXpath.spanClass("step-one__search");
    }

    /**
     * Кнопка Далее на форме выбора категории
     */

    public static String buttonNext() {
        return ElementXpath.spanText("Далее");
    }

    /**
     * Выбор региона доставки
     */

    public static String selectRegion() {
        return ElementXpath.inputPlaceholder("Выбрать регион");
    }

    /**
     * Выбор региона
     * Передать значение String из справочника DirectoryRegion
     */

    public static String optionRegion(String text) {
        return ElementXpath.divText(text);
    }

    /**
     * Выбор цены мин.
     */

    public static String selectPriceMin() {
        return ElementXpath.inputPlaceholder("Мин.");
    }

    /**
     * Выбор цены макс.
     */


    public static String selectPriceMax() {
        return ElementXpath.inputPlaceholder("Макс.");
    }

    /**
     * Выбор количества товара
     */

    public static String selectCount() {
        return ElementXpath.inputValue("1");
    }

    /**
     * Прибавление количества товара
     */

    public static String plusCount() {
        return ElementXpath.buttonClass("counter__button counter__button_position_right");
    }

    /**
     * Уменьшение количества товара
     */

    public static String minusCount() {
        return ElementXpath.buttonClass("counter__button counter__button_position_left");
    }

    /**
     * Выбор единицы измерения
     */

    public static String unit() {
        return ElementXpath.inputPlaceholder("Введите данные");
    }

    /**
     * Поле добавить описание
     */

    public static String specification1() {
        return "//span[@class='step-two__element-input step-two__element-input_description']";
    }

    public static String specification() {
        return ElementXpath.spanClass("step-two__element-input step-two__element-input_description");
    }

    /**
     * Поле Когда получать предложения: По факту
     */

    public static String receiveOffers1() {
        return "//p[text()='По факту появления']";
    }

    public static String receiveOffers() {
        return ElementXpath.pText("По факту появления");
    }

    /**
     * Поле Когда получать предложения: По дате завершения приема заявок
     */

    public static String endOffers1() {
        return "//p[text()='По дате завершения приема заявок']";
    }

    public static String endOffers() {
        return ElementXpath.pText("По дате завершения приема заявок");
    }
}
