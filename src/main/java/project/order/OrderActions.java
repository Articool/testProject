package project.order;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import project.ElementAction;
import project.order.elements.OrderElements;
import project.order.elements.OrderElementsCalendar;
import project.order.elements.OrderElementsUnit;


public class OrderActions {

    /**
     * Клик по кнопке создать заказ
     */

    @Step("Клик по кнопке создать заказ")
    public static void buttonNewOrderClick() {

        ElementAction.isVisibilityIsClickableClick(OrderElements.newOrder());
        try {
            ElementAction.sleep(2000);
            ElementAction.isVisibilityIsClickableClick(OrderElements.newOrder());
        } catch (Exception e) {
            Allure.step(e.getMessage());
        }
    }

    /**
     * Клик по поисковой строке наименования категории
     */

    @Step("Клик по поисковой строке наименования категории")
    public static void searchCategoryClick() {

        ElementAction.isVisibilityIsClickableClick(OrderElements.searchCategory());
        try {
            ElementAction.sleep(2000);
            ElementAction.isVisibilityIsClickableClick(OrderElements.searchCategory());
        } catch (Exception e) {
            Allure.step(e.getMessage());
        }
        ElementAction.clear(OrderElements.searchCategory());
    }

    /**
     * Очистка поисковой строки наименования категории
     * Ввод искомой категории
     * Добавить текст
     */

    @Step("Очистка поисковой строки наименования категории, Ввод искомой категории")
    public static void clearSendCategorySearch(String text) {

        ElementAction.clearSendKeys(OrderElements.searchCategory(), text);
    }

    /**
     * Клик по 1 найденной категории
     */

    @Step("Клик по 1 найденной категории")
    public static void clickTopCategory() {

        ElementAction.click(OrderElements.topCategory());
    }

    /**
     * Клик по кнопке Далее
     */

    @Step("Клик по кнопке Далее")
    public static void clickNextButton() {

        ElementAction.click(OrderElements.buttonNext());
    }

    /**
     * Очистка поля Выбрать регион
     */

    @Step("Очистка поля Выбрать регион")
    public static void clearRegionSearch() {

        ElementAction.clear(OrderElements.selectRegion());
    }

    /**
     * Клик по полю поиска Выбрать регион
     */

    @Step("Клик по полю Выбрать регион")
    public static void clickRegionSearch() {

        ElementAction.click(OrderElements.selectRegion());
    }

    /**
     * Клик по полю поиска Выбрать регион.
     * Вставить xpath из класса OrderElementsRegion
     */

    @Step("Клик по выподающему списку и выбора значения из него")
    public static void clickRegion(String xpath) {
        ElementAction.isVisibilityIsClickableClick(xpath);
    }

    /**
     * Клик по полю Цена без НДС мин. и ввод значения
     * Добавить String значение, минимальную цену
     */

    @Step("Клик по полю Цена без НДС мин. и ввод значения")
    public static void clickSendPriceMin(String priceMin) {
        ElementAction.clearSendKeys(OrderElements.selectPriceMin(), priceMin);
    }

    /**
     * Клик по полю Цена без НДС макс. и ввод значения
     * Добавить String значение, максимальную цену
     */

    @Step("Клик по полю Цена без НДС макс. и ввод значения")
    public static void clickSendPriceMax(String priceMax) {
        ElementAction.clearSendKeys(OrderElements.selectPriceMax(), priceMax);
    }

    /**
     * Клик по Прибавлению количества
     * Передать количество кликов по прибавлению количества 1 до 100
     */

    @Step("Клик по Прибавлению количества")
    public static void clickPlusCount(int count) {
        for (int i = 0; i < count; i++) {
            ElementAction.click(OrderElements.plusCount());
        }

    }

    /**
     * Клик по полю Ед.Измерения
     */

    @Step("Клик по полю Ед.Измерения")
    public static void clickUnit() {
        ElementAction.click(OrderElements.unit());
    }

    /**
     * Выбор единицы измерения из выпадающего справочника
     * Передать xpath из Класса OrderElementsUnit
     */

    @Step("Выбор единицы измерения из выпадающего справочника")
    public static void clickSelectUnit(String xpath) {
        ElementAction.isVisibilityIsClickableClick(xpath);
    }

    /**
     * Клик по выбору даты завершения приема заявок
     */

    @Step("Клик по выбору даты завершения приема заявок")
    public static void clickDateEndApplication() {
        ElementAction.isVisibilityIsClickableClick(OrderElementsCalendar.calendarDateApplication());
    }

    /**
     * +1 месяц к текущему месяцу
     */

    @Step("+1 месяц к текущему даты завершения приема заявок")
    public static void clickSelectMoth() {
        ElementAction.isVisibilityIsClickableClick(OrderElementsCalendar.calendarNextMoth());
    }

    /**
     * Выбор конечной даты
     * Передать xpath из класса OrderElementCalendar метод calendarSelectDay
     */

    @Step("Выбор даты завершения приема заявок.")
    public static void clickSelectDate(String xpath) {
        ElementAction.isVisibilityIsClickableClick(xpath);
    }

    /**
     * Клик по кнопке применить изменения в дате
     */

    @Step("Клик по кнопке применить изменения в дате")
    public static void clickApplyDate() {
        ElementAction.click(OrderElementsCalendar.calendarApply());
    }


    /**
     * Клик по выбору даты выбора победителя
     */

    @Step("Клик по выбору даты выбора победителя")
    public static void clickDateWin() {
        ElementAction.isVisibilityIsClickableClick(OrderElementsCalendar.calendarDateWin());
    }

    /**
     * Клик по выбору даты доставки
     */

    @Step("Клик по выбору даты доставки")
    public static void clickDateDelivery() {
        ElementAction.isVisibilityIsClickableClick(OrderElementsCalendar.calendarDateDelivery());
    }
    /**
     * Клик по выбору даты доставки
     */

    @Step("Клик по выбору даты доставки")
    public static void clickSpecification() {
        ElementAction.click(OrderElements.specification());
    }
    /**
     * Клик по выбору даты доставки
     */

    @Step("Клик по выбору даты доставки")
    public static void sendSpecification() {
        ElementAction.sendKeysXpath(OrderElements.specification(),"Тест 64346");
    }
}


