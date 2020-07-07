package project.common.authorisation;

public class Authorisation {
    public static void login(String login, String password) {
        // choosePlugin();
        AuthorisationActions.buttonEnterClick(); // Нажали кнопку вход, открылось окно для ввода логина пароля
        AuthorisationActions.switchIFrame(); // Перешли в окно
        AuthorisationActions.clickLogin(); // Кликнули по полю email
        AuthorisationActions.sendLogin(login); // Ввели login пользователя
        AuthorisationActions.clickPassword(); // Кликнули по полю пароль
        AuthorisationActions.sendPassword(password); // Ввели password пользователя
        AuthorisationActions.enterLogin(); // Нажали кнопку вход
        AuthorisationActions.confirm();
    }
}

