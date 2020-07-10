package project.order;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import project.ElementAction;
import project.ElementXpath;
import project.order.elements.OrderElements;
import project.order.elements.OrderElementsCalendar;
import project.order.elements.OrderElements;


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
     * Очистка поля поиска Выбрать регион.
     * Клик по полю поиска Выбрать регион.
     * Выбор региона из выпадающего списка
     */
    @Step("Клик по полю Выбрать регион")
    public static void clickRegion(String xpath) {
        ElementAction.clear(OrderElements.selectRegion());
        ElementAction.click(OrderElements.selectRegion());
        ElementAction.isVisibilityIsClickableClick(xpath);
    }

    /**
     * Клик по полю Цена без НДС мин. и ввод значения
     * Добавить String значение, минимальную цену
     * Добавить String значение, максимальную цену
     */

    @Step("Клик по полю Цена без НДС мин. и ввод значения")
    public static void clickSendPrice(String priceMin, String priceMax) {
        ElementAction.clearSendKeys(OrderElements.selectPriceMin(), priceMin);
        ElementAction.clearSendKeys(OrderElements.selectPriceMax(), priceMax);
    }


    /**
     * clickCount(int type, int count)
     * Поле по редактированию количества
     * Требуется передать два значения
     * 1) В int type - 1 = MINUS Уменьшает количество товара,
     * 2 = PLUS Прибавляет количество товара
     *
     * 2) В int count - передаем колиство прибавлений либо уменьшений
     * Передать количество кликов по прибавлению количества 1 до 100
     */

    @Step("Клик по Прибавлению количества")
    public static void clickCount(int type, int count) {
        for (int i = 0; i < count; i++) {
            ElementAction.click(OrderElements.amountOfGoods(type));
        }
    }

    /**
     * Клик по полю Ед.Измерения
     */

    @Step("Клик по полю Ед.Измерения")
    public static void clickUnit() {
        ElementAction.click(OrderElements.typeUnit());
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
     * +1 месяц к текущему месяцу в календаре
     */

    @Step("+1 месяц к текущему даты завершения приема заявок")
    public static void clickSelectMoth() {
        try {
            ElementAction.sleep(1000);
            ElementAction.isVisibilityIsClickableClick(OrderElementsCalendar.calendarNextMoth());
        } catch (Exception e) {
            Allure.step(e.getMessage());
        }
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
     * Клик по полю добавить описание
     * Заполнение описание Тест + текущая локальная дата и время
     */

    @Step("Клик по полю добавить описание, ввод описания")
    public static void clickSpecification() {
        ElementAction.isVisibilityIsClickableSendKeysXpath(OrderElements.specification(),
                "UI Autotest. event time: " + ElementAction.getDate());
    }

    /**
     * Выбор Условия оплаты
     * Вставить значение int от 1 до 4
     * 1 = По предоплате
     * 2 = По факту получения
     * 3 = С отсрочкой платежа
     * 4 = Другое
     * В переменную type передать знаечние int c типом условия оплаты
     * Ввести в payPrepayment размер предоплаты от 1 до 100 значение String
     * @return ElementXpath.divText(typeUnit)
     */

    @Step("Выбор Условия оплаты")
    public static String typePay(int type) {
        String typeUnit = "";
        switch (type){
            case 1:
                typeUnit = "По предоплате";
                ElementAction.isVisibilityIsClickableClick(OrderElements.pay());
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePay(type));
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePayAmount(type));
                ElementAction.sendKeysXpath(OrderElements.typePayAmount(type), "52"); // Тут можно ввести размер предоплаты от 1 до 100
                break;
            case 2:
                typeUnit = "По факту получения";
                ElementAction.isVisibilityIsClickableClick(OrderElements.pay());
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePay(type));
                break;
            case 3:
                typeUnit = "С отсрочкой платежа";
                ElementAction.isVisibilityIsClickableClick(OrderElements.pay());
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePay(type));
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePayAmount(type));
                ElementAction.sendKeysXpath(OrderElements.typePayAmount(type), "33"); // Тут можно ввести срок отсрочки платежа кал.дн
                break;
            case 4:
                typeUnit = "Другое";
                ElementAction.isVisibilityIsClickableClick(OrderElements.pay());
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePay(type));
                ElementAction.isVisibilityIsClickableClick(OrderElements.typePayAmount(type));
                ElementAction.sendKeysXpath(OrderElements.typePayAmount(type), "Тест описания условий оплаты"); // Тут можно ввести Описание условий оплаты

                break;
        }
        return ElementXpath.divText(typeUnit);
    }
    //------------------------------------------------------------------------------------------

    /**
     * Клик добавить дополнительные требования
     */

    @Step("Клик по полю условие оплаты,Выбор условия С отсрочкой платежа")
    public static void clickAddNewRequirements() {
        ElementAction.isVisibilityIsClickableClick(OrderElements.addRequirements());
    }

    /**
     * Ввод наименования дополнительного требования
     */

    @Step("Ввод наименования дополнительного требования")
    public static void addNameRequirements(String text) {
        ElementAction.isVisibilityIsClickableClickSendKeysXpath(OrderElements.addRequirementsName(), text);
    }

    /**
     * Ввод описания дополнительного требования
     */

    @Step("Ввод описания дополнительного требования")
    public static void addSpecificationRequirements(String text) {
        ElementAction.isVisibilityIsClickableClickSendKeysXpath(OrderElements.addRequirementsSpecification(), text);
    }

    /**
     * Удаление дополнительного требования
     */

    @Step("Ввод описания дополнительного требования")
    public static void deleteRequirements() {
        ElementAction.isVisibilityIsClickableClick(OrderElements.buttonDeleteRequirements());
    }

    /**
     * Выбор получения предложения: По факту появления
     * Ожидание выставлено специально для ожидания окончания загрузки документов
     * В переменную type передать знаечние int c типом функции где:
     * 1 = По факту появлени
     * 2 = Прибавляет количество товара
     */

    @Step("Выбор получения предложения")
    public static void receivingOffer(int type) {

        try {
            ElementAction.sleep(1000);
            ElementAction.isVisibilityIsClickableClick(OrderElements.receiveOffers(type));
        } catch (Exception e) {
            Allure.step(e.getMessage());
        }
    }

    /**
     * Клик по кнопке Отправить заказ
     */

    @Step("Клик по кнопке Отправить заказ")
    public static void sendOffer() {
        ElementAction.isVisibilityIsClickableClick(OrderElements.buttonSendOffer());
    }

    /**
     * Клик по кнопке перейти к заказу
     */

    @Step("Ввод описания дополнительного требования")
    public static void clickGoToOrder() {
        ElementAction.isVisibilityIsClickableClick(OrderElements.buttonGoToOrder());
    }

    /**
     * Клик по кнопке добавить файл
     * Загрузка документа
     */

    @Step("Ввод описания дополнительного требования")
    public static void clickUploadDoc(String text) {

        try {
            ElementAction.sleep(2000);
            ElementAction.sendKeysXpath(OrderElements.buttonUploadFile(), text);
        } catch (Exception e) {
            Allure.step(e.getMessage());
        }
    }

}


