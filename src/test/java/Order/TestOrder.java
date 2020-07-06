package Order;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.Test;
import project.common.authorisation.Authorisation;
import project.common.authorisation.AuthorisationLogin;
import project.setup.TestBase;

public class TestOrder extends TestBase {

    @Test
    @Feature("Юридическое лицо РФ")
    @Description("Авторизация, создание заказа")
    @Owner("Федоров И.В.")
    public void main() {

        Authorisation.login(AuthorisationLogin.getUserEmailM2(), AuthorisationLogin.getUserPassword());

    }
}
