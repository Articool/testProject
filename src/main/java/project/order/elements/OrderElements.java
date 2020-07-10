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
    //------------------------------------------------------------------------------------------
    /**
     * Выбор региона доставки
     */

    public static String selectRegion() {
        return ElementXpath.inputPlaceholder("Выбрать регион");
    }


    /**
     * Выбор региона
     * amountOfGoods(int type)
     * В переменную type передать знаечние int c типом функции где:
     * 1 = Moscow
     * 2 = StPetersburg
     * 3 = Yekaterinburg
     * 4 = Kazan
     * 5 = Chelyabinsk
     * 6 = Samara
     */
    public static String optionRegion(int type) {
        String typeUnit = "";
        switch (type) {
            case 1:
                typeUnit = "Москва г., Россия";
                break;
            case 2:
                typeUnit = "Санкт-Петербург г., Россия";
                break;
            case 3:
                typeUnit = "г. Екатеринбург, Свердловская обл., Россия";
                break;
            case 4:
                typeUnit = "г. Казань, Татарстан Респ., Россия";
                break;
            case 5:
                typeUnit = "г. Челябинск, Челябинская обл., Россия";
                break;
            case 6:
                typeUnit = "г. Самара, Самарская обл., Россия";
                break;
        }
        return ElementXpath.divText(typeUnit);
    }
    //------------------------------------------------------------------------------------------
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
    //------------------------------------------------------------------------------------------
    /**
     * Выбор количества товара
     */

    public static String selectCount() {
        return ElementXpath.inputValue("1");
    }

    /**
     * Прибавление количества товара
     * amountOfGoods(int type)
     * В переменную type передать знаечние int c типом функции где:
     * 1 = Уменьшает количество товара
     * 2 = Прибавляет количество товара
     */
    public static String amountOfGoods(int type) {
        String typeUnit = "";
        switch (type) {
            case 1:
                typeUnit = "counter__button counter__button_position_left";
                break;
            case 2:
                typeUnit = "counter__button counter__button_position_right";
                break;
        }
        return ElementXpath.buttonClass(typeUnit);
    }

    /**
     * Поле единицы измерения
     */
    //------------------------------------------------------------------------------------------
    public static String typeUnit() {
        return ElementXpath.inputPlaceholder("Введите данные");
    }

    /**
     * Выбор единицы измерения
     * 1 Миллиметр
     * 2 Сантиметр
     * 3 Дециметр
     * 4 Метр
     * 5 Километр;^тысяча метров
     * В переменную type передать знаечние int c типом единицы измерения
     */
    public static String typeUnit(int type) {
        String typeUnit = "";
        switch (type) {
            case 1:
                typeUnit = "Миллиметр";
                break;
            case 2:
                typeUnit = "Сантиметр";
                break;
            case 3:
                typeUnit = "Дециметр";
                break;
            case 4:
                typeUnit = "Метр";
                break;
            case 5:
                typeUnit = "Километр;^тысяча метров";
                break;
        }
        return ElementXpath.divText(typeUnit);
    }
    //------------------------------------------------------------------------------------------
    /**
     * Поле добавить описание
     */

    public static String specification() {
        return ElementXpath.textareaPlaceholder("Добавить описание");
    }
    //------------------------------------------------------------------------------------------
    /**
     * Выбор получения предложения
     * receiveOffers1(int type)
     * В переменную type передать знаечние int c типом функции где:
     * 1 = По факту появления
     * 2 = По дате завершения приема заявок
     */
    public static String receiveOffers(int type) {
        String typeUnit = "";
        switch (type) {
            case 1:
                typeUnit = "По факту появления";
                break;
            case 2:
                typeUnit = "По дате завершения приема заявок";
                break;
        }
        return ElementXpath.pText(typeUnit);
    }

    //------------------------------------------------------------------------------------------

    /**
     * Поле Выбора условия оплаты
     */
    public static String pay() {
        return ElementXpath.divClass("cc-select-box__click-wrapper");
    }

    /**
     * Выбор Условия оплаты
     * Вставить значение int от 1 до 4
     * 1 = По предоплате
     * 2 = По факту получения
     * 3 = С отсрочкой платежа
     * 4 = Другое
     * В переменную type передать знаечние int c типом условия оплаты
     */
    public static String typePay(int type) {
        String typeUnit = "";
        switch (type) {
            case 1:
                typeUnit = "По предоплате";
                break;
            case 2:
                typeUnit = "По факту получения";
                break;
            case 3:
                typeUnit = "С отсрочкой платежа";
                break;
            case 4:
                typeUnit = "Другое";
                break;
        }
        return ElementXpath.divText(typeUnit);
    }

    /**
     * Блок ввода описания условий оплаты
     * 1 = Ввод размера предоплаты (По предоплате)
     * 3 = Указание количества дней (С отсрочкой платежа)
     * 4 = Ввод Описания условий оплаты (Другое)
     * В переменную type передать знаечние int c типом условия оплаты
     */
    public static String typePayAmount(int type) {
        String typeUnit = "";
        if (type != 4) {
            switch (type) {
                case 1:
                    typeUnit = "от 1 до 100";
                    break;
                case 3:
                    typeUnit = "Заполните поле";
                    break;
            }
            return ElementXpath.inputPlaceholder(typeUnit);
        } else {
            typeUnit = "Заполните поле";
            return ElementXpath.textareaPlaceholder(typeUnit);
        }
    }
    //------------------------------------------------------------------------------------------


    /**
     * Поле Дополнительные требования: Кнопка добавить
     */
    public static String addRequirements() {
        return ElementXpath.buttonClass("cc-button cc-button_color_secondary cc-button_size_middle");
    }

    /**
     * Поле Дополнительные требования: Поле ввода наименования доп. требования
     */
    public static String addRequirementsName() {
        return ElementXpath.inputClass("step-two__text-input step-two__text-input_req-name");
    }

    /**
     * Поле Дополнительные требования: Поле ввода описания доп. требования
     */
    public static String addRequirementsSpecification() {
        return ElementXpath.textareaClass("step-two__text-input step-two__text-input_req-description");
    }

    /**
     * Кнопка удаления дополнительного требования
     */
    public static String buttonDeleteRequirements() {
        return ElementXpath.buttonClass("step-two__delete-button");
    }

    /**
     * Кнопка отправить заказ
     */
    public static String buttonSendOffer() {
        return ElementXpath.spanText("Отправить заказ");
    }

    /**
     * Кнопка Перейти к заказу
     */
    public static String buttonGoToOrder() {
        return ElementXpath.spanText("Перейти к заказу");
    }

    /**
     * Кнопка загрузки документа
     */
    public static String buttonUploadFile() {
        return ElementXpath.inputClass("cc-file-input__input");
    }

}
