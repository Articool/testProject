package project.common.authorisation;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import project.ElementAction;


public class AuthorisationActions {

    /**
     * Клик по кнопке Вход домашней страницы
     */

    @Step("Кликаем по кнопке Вход")
    public static void buttonEnterClick() {

        ElementAction.isVisibilityIsClickableClick(AuthorisationElements.enterButton());
        try {
            ElementAction.sleep(2000);
            ElementAction.isVisibilityIsClickableClick(AuthorisationElements.enterButton());
        } catch (Exception e) {
            Allure.step(e.getMessage());
        }
    }

    /**
     * Переключаемся в всплывающее окно (IFrame)
     */

    @Step("Переключаемся в IFrame")
    public static void switchIFrame() {
        ElementAction.isVisibilitySwitchToIFrame(AuthorisationElements.iFrameHP());
    }

    /**
     * Клик по полю логин
     */

    @Step("Клик по полю логин")
    public static void clickLogin() {
        ElementAction.isVisibilityIsClickable(AuthorisationElements.login());
    }

    /**
     * Указываем логин
     *
     * @param login логин
     */

    @Step("Логин: {login}")
    public static void sendLogin(String login) {
        ElementAction.clearSendKeys(AuthorisationElements.login(), login);
        ElementAction.print("Авторизация под: " + login);
    }

    /**
     * Клик по полю пароль
     */

    @Step("Клик по полю пароль")
    public static void clickPassword() {
        ElementAction.isVisibilityIsClickable(AuthorisationElements.password());
    }

    /**
     * Указываем логин
     */

    @Step("Пароль: {password}")
    public static void sendPassword(String password) {
        ElementAction.clearSendKeys(AuthorisationElements.password(), password);
        ElementAction.print("Введенный пароль: " + password);
    }

    /**
     * Нажимаем Вход
     */

    @Step("Нажимаем Вход")
    public static void enterLogin() {
        ElementAction.click(AuthorisationElements.enterLoginButton());
        System.out.println("Нажимаем Вход");
    }

    /**
     * Нажимаем Подтвердить вход
     */

    @Step("Нажимаем Вход")
    public static void confirm() {
        ElementAction.click(AuthorisationElements.confirmLogin());
        System.out.println("Нажимаем Вход");
    }

}

    


