package project.common.authorisation;

import project.ElementXpath;

public class AuthorisationElements {

    /**
     * enterButton()
     * Кнопка для открытия iFrame ввода логина и пароля
     *
     */

    public static String enterButton() {
        return ElementXpath.spanText("Войти");
    }

    /**
     * iFrameHP()
     * Работа с iFrame с всплывающим окном
     *
     */

    public static String iFrameHP() {
        return ElementXpath.iFrame("login-dialog__iframe");
    }

    /**
     * login()
     * Поле ввода логина
     *
     */

    public static String login() {
        return ElementXpath.inputName("email");
    }

    /**
     * password()
     * Поле ввода пароля
     *
     */

    public static String password() {
        return ElementXpath.inputName("password");
    }

    /**
     * enterLoginButton()
     * Кнопка Вход по паролю
     *
     */

    public static String enterLoginButton() {
        return ElementXpath.divClass("cc-card__actions']/button[@type='button");
    }

    /**
     * enterLoginButton()
     * Кнопка Подтвердить вход
     *
     */

    public static String confirmLogin() {
        return ElementXpath.spanText("Подтвердить вход");
    }

    /**
     * logoutLogin()
     * Кнопка Выход из аккаунта
     *
     */

    public static String logoutLogin() {
        return ElementXpath.spanText("Выход из аккаунта");
    }

}
