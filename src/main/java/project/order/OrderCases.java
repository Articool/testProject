package project.order;

import project.ElementAction;
import project.directory.DirectoryRegion;
import project.order.elements.OrderElements;
import project.order.elements.OrderElementsCalendar;
import project.order.elements.OrderElementsUnit;

public class OrderCases {
    public static void newOrder(){
        OrderActions.buttonNewOrderClick();
        OrderActions.searchCategoryClick();
        OrderActions.clearSendCategorySearch("Операционные системы");
        OrderActions.clickTopCategory();
        OrderActions.clickNextButton();
        OrderActions.clearRegionSearch();
        OrderActions.clickRegionSearch();
       // OrderActions.clickRegion(OrderElementsRegion.regionMoscow());
        OrderActions.clickRegion(OrderElements.optionRegion(DirectoryRegion.getMoscow()));
        OrderActions.clickSendPriceMin("450");
        OrderActions.clickSendPriceMax("600");
        OrderActions.clickPlusCount(52);
        OrderActions.clickUnit();
        OrderActions.clickSelectUnit(OrderElementsUnit.unitMillimeter());
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
        ElementAction.sleep(25);




    }
}
