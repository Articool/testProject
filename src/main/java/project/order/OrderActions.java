package project.order;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import project.ElementAction;
import project.order.elements.OrderElements;
import project.order.elements.OrderElementsRegion;


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
     */

    @Step("Очистка поисковой строки наименования категории, Ввод искомой категории")
    public static void clearSendCategorySearch() {

        ElementAction.clearSendKeys(OrderElements.searchCategory(), "Механизмы исполнительные");
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
     * Клик по полю поиска Выбрать регион
     */

    @Step("Клик по полю Выбрать регион")
    public static void clickRegionMoscow() {
        ElementAction.isVisibilityIsClickable(OrderElementsRegion.regionMoscow());
    }

    /**
     * Клик по полю Цена без НДС мин. и ввод значения
     */

    @Step("Клик по полю Выбрать регион")
    public static void clickSendPriceMin() {
        ElementAction.clearSendKeys(OrderElements.selectPriceMin(), "500");
    }
    /**
     * Клик по полю Цена без НДС макс. и ввод значения
     */

    @Step("Клик по полю Выбрать регион")
    public static void clickSendPriceMax() {
        ElementAction.clearSendKeys(OrderElements.selectPriceMin(), "600");
    }
    /**
     * Клик по Прибавлению количества
     */

    @Step("Клик по полю Выбрать регион")
    public static void clickPlusCount() {
        for(int i = 0; i<90; i++){
            ElementAction.click(OrderElements.plusCount());
        }

    }
}
