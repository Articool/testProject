package project.order;

import project.ElementAction;
import project.Feature;
import project.Files;
import project.order.elements.OrderElements;
import project.order.elements.OrderElementsCalendar;

public class OrderCases {
    public static void newOrder() {
        ElementAction.sleep(4);
        OrderActions.buttonNewOrderClick();
        OrderActions.searchCategoryClick();
        OrderActions.clearSendCategorySearch("Операционные системы");
        OrderActions.clickTopCategory();
        OrderActions.clickNextButton();
        OrderActions.clickRegion(OrderElements.optionRegion(Feature.band(1, 6)));
        OrderActions.clickSendPrice("450", "600");
        OrderActions.clickCount(2, Feature.band(1, 15));
        OrderActions.clickUnit();
        OrderActions.clickSelectUnit(OrderElements.typeUnit(Feature.band(1, 5)));
        OrderActions.clickDateEndApplication();
        OrderActions.clickSelectMoth();
        OrderActions.clickSelectDate(OrderElementsCalendar.calendarSelectDay("14"));
        OrderActions.clickApplyDate();
        OrderActions.clickDateWin();
        OrderActions.clickSelectMoth();
        OrderActions.clickSelectDate(OrderElementsCalendar.calendarSelectDay("15"));
        OrderActions.clickDateDelivery();
        OrderActions.clickSelectMoth();
        OrderActions.clickSelectDate(OrderElementsCalendar.calendarSelectDay("16"));
        OrderActions.clickSpecification();
        OrderActions.typePay(4);
        OrderActions.clickAddNewRequirements();
        OrderActions.addNameRequirements("Тестовое наименование 00001");
        OrderActions.addSpecificationRequirements("Описание тестового требования");
        OrderActions.deleteRequirements();
        OrderActions.clickAddNewRequirements();
        OrderActions.addNameRequirements("Тестовое наименование 00002");
        OrderActions.addSpecificationRequirements("Описание тестового требования");
        OrderActions.clickUploadDoc(Files.getFileOnePdf());
        OrderActions.clickUploadDoc(Files.getFileTwoXlsx());
        OrderActions.clickUploadDoc(Files.getFileThreeTxt());
        OrderActions.clickUploadDoc(Files.getFileFourJpg());
        OrderActions.receivingOffer(1);
        OrderActions.sendOffer();
        OrderActions.clickGoToOrder();
        ElementAction.sleep(5);

    }
}
