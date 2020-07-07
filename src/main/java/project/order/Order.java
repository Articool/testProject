package project.order;

public class Order {
    public static void newOrder(){
        OrderActions.buttonNewOrderClick();
        OrderActions.searchCategoryClick();
        OrderActions.clearSendCategorySearch();
        OrderActions.clickTopCategory();
        OrderActions.clickNextButton();
        OrderActions.clearRegionSearch();
        OrderActions.clickRegionSearch();
        OrderActions.clickRegionMoscow();
        OrderActions.clickSendPriceMin();
        OrderActions.clickSendPriceMax();
        OrderActions.clickPlusCount();
    }
}
