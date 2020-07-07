package project;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.concurrent.TimeUnit;

import static project.setup.DriverBase.getDriver;

public class ElementAction {
    public static void getUrl(String url) {
        getDriver().get(url);
    }

    public static String getAttribute(String xpath, String nameAttribute) {
        return getDriver().findElement(By.xpath(xpath)).getAttribute(nameAttribute);
    }

    public static int getCountElements(String xpath) {
        return getDriver().findElements(By.xpath(xpath)).size();
    }

    public static void clear(String xpath){
        getDriver().findElement(By.xpath(xpath)).clear();
    }

    public static void click(String xpath) {
        try {
            getDriver().findElement(By.xpath(xpath)).click();
        }catch (StaleElementReferenceException e) {
            //если вдруг элемент обновился то попробуем его повторно кликнуть
            getDriver().findElement(By.xpath(xpath)).click();
        }
    }

    public static void isClickable(String xpath){
        try {
            new WebDriverWait(getDriver(), Global.wait).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        } catch (Exception e) {
            throw new AssertionError("Не прошел. Ошибка " + e.toString());
        }
    }

    public static void isVisibility(String xpath){
        try {
            new WebDriverWait(getDriver(), Global.wait).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (Exception e){
            throw new AssertionError("Не прошел. Ошибка " + e.toString());
        }
    }

    public static void isVisibility(String xpath,String errorText){
        try {
            new WebDriverWait(getDriver(), Global.wait).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        }catch (Exception e){
            throw new AssertionError(errorText);
        }
    }

    public static void isVisibility(String xpath,int waitSeconds){
        getDriver().manage().timeouts().implicitlyWait(waitSeconds,TimeUnit.SECONDS);
        new WebDriverWait(getDriver(), waitSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        getDriver().manage().timeouts().implicitlyWait(Global.wait,TimeUnit.SECONDS);
    }

    public static void isInVisibility(String xpath){
        new WebDriverWait(getDriver(), Global.wait).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    public static void isInVisibility(String xpath,int waitSeconds){
        getDriver().manage().timeouts().implicitlyWait(waitSeconds,TimeUnit.SECONDS);
        new WebDriverWait(getDriver(), waitSeconds).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
        getDriver().manage().timeouts().implicitlyWait(Global.wait,TimeUnit.SECONDS);
    }

    public static void isClickable(WebElement element){
        new WebDriverWait(getDriver(), Global.wait).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement element(String xpath){
        return getDriver().findElement(By.xpath(xpath));
    }

    public static WebElement element(String xpath,int waitSeconds){
        getDriver().manage().timeouts().implicitlyWait(waitSeconds,TimeUnit.SECONDS);
        WebElement element = getDriver().findElement(By.xpath(xpath));
        getDriver().manage().timeouts().implicitlyWait(Global.wait,TimeUnit.SECONDS);
        return element;
    }

    public static void isVisibility(WebElement element){
        new WebDriverWait(getDriver(), Global.wait).until(ExpectedConditions.visibilityOf(element));
    }

    public static void isVisibility(WebElement element,int waitSeconds){
        getDriver().manage().timeouts().implicitlyWait(waitSeconds,TimeUnit.SECONDS);
        new WebDriverWait(getDriver(), waitSeconds).until(ExpectedConditions.visibilityOf(element));
        getDriver().manage().timeouts().implicitlyWait(Global.wait,TimeUnit.SECONDS);
    }

    public static void isVisibilityIsClickableClick(String xpath){
        isVisibilityIsClickable(xpath);
        click(xpath);
    }

    public static void isVisibilityIsClickableClick(WebElement element){
        isVisibilityIsClickable(element);
        element.click();
    }

    public static void isVisibilityIsClickable(WebElement element){
        isClickable(element);
        isVisibility(element);
    }

    public static void isVisibilityIsClickable(String xpath){
        isClickable(xpath);
        isVisibility(xpath);
    }

    public static void isVisibilityIsClickableClick(String xpath, String waitXpath){
        isVisibilityIsClickable(xpath);
        click(xpath);
        isVisibility(waitXpath);
    }

    public static void isVisibilityIsClickableClick(WebElement element , String waitXpath){
        isVisibilityIsClickable(element);
        element.click();
        isVisibility(waitXpath);
    }

    /**
     * Переход в IFrame
     */

    public static void isVisibilitySwitchToIFrame(String xpath){
        getDriver().switchTo().frame(getDriver().findElement(By.xpath(xpath)));
    }

    public static void clearSendKeys(String xpath, String text){
        System.out.println("Вводимый текст: " + text);
        getDriver().findElement(By.xpath(xpath)).clear();
        getDriver().findElement(By.xpath(xpath)).sendKeys(text);
        String textNow = getDriver().findElement(By.xpath(xpath)).getAttribute("value");
        System.out.println("Введенный текст: " + textNow);
    }


    public static void clearSendKeys(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public static void sendKeysFile(String xpath, String text) {
        getDriver().findElement(By.xpath("//input[@name='" + xpath + "']")).sendKeys(text);
    }

    public static String getAttribute(String xpath) {
        return getDriver().findElement(By.xpath(xpath)).getAttribute("class");
    }

    public static String getText(String xpath) {
        return getDriver().findElement(By.xpath(xpath)).getText();
    }

    public static List<WebElement> listElements(String xpath, int countSecondWait) {
        getDriver().manage().timeouts().implicitlyWait(countSecondWait,TimeUnit.SECONDS);
        return getDriver().findElements(By.xpath(xpath));
    }

    /**
     * Вывод в консоль сообщения (чтобы вывод был в одном классе)
     * @param text  выводимый текст
     */
    public static void print(String text) {
        System.out.println(text);
    }

    /**
     * неявное ожидание
     * @param sleep указывается в миллисекундах
     */
    public static void sleep(int sleep){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param turnOn true или false, в зависимости от того, включить или отключить функционал
     * @param xpath тут проверяется наличие атрибута checked
     * @param element по этому елементу производиться клик для включения или отключения
     */
    public static void turnOn( Boolean turnOn, String xpath, String element){
        if (turnOn) {
            try {
                getDriver().findElement(By.xpath(xpath)).getAttribute("checked").contains("");
            } catch (Exception e) {
                System.out.println("checked = false");
                ElementAction.isVisibilityIsClickableClick(element);
            }
        } else{
            if (!turnOn){
                try {
                    getDriver().findElement(By.xpath(xpath)).getAttribute("checked").contains("");
                    ElementAction.isVisibilityIsClickableClick(element);
                } catch (Exception e) {

                }
            }
        }
    }

    public static Boolean isElelementExist(String xpath) {
        try {
            getDriver().findElement(By.xpath(xpath));
            return true;
        } catch (Exception e) {
            return  false;
        }
    }
}
