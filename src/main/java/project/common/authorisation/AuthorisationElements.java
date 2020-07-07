package project.common.authorisation;

public class AuthorisationElements {

    /**
     * enterButton()
     * Кнопка для открытия iFrame ввода логина и пароля
     *
     * @return
     */

    public static String enterButton() {
        return "//span[text()='Войти']/..";
    }

    /**
     * iFrameHP()
     * Работа с iFrame с всплывающим окном
     *
     * @return
     */

    public static String iFrameHP() {
        return "//iframe[@class='login-dialog__iframe']";
    }

    /**
     * login()
     * Поле ввода логина
     *
     * @return
     */

    public static String login() {
        return "//input[@name='email']";
    }

    /**
     * password()
     * Поле ввода пароля
     *
     * @return
     */

    public static String password() {
        return "//input[@name='password']";
    }

    /**
     * enterLoginButton()
     * Кнопка Вход по паролю
     *
     * @return
     */

    public static String enterLoginButton() {
        return "//div[@class='cc-card__actions']/button[@type='button']";
    }
    /**
     * enterLoginButton()
     * Кнопка Подтвердить вход
     *
     * @return
     */

    public static String confirmLogin() {
        return "//span[text()='Подтвердить вход']";
    }

    /**
     * enterLoginButton()
     * Кнопка Выход из аккаунта
     *
     * @return
     */

    public static String logoutLogin() {
        return "//span[text()='Выход из аккаунта']";
    }

}
