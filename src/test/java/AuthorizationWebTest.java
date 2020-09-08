import base.BaseSettingTest;
import org.junit.jupiter.api.Test;
import ru.puzzle.main.site.at.page.AuthorizationPage;

public class AuthorizationWebTest extends BaseSettingTest {
    @Test
    void authorizationTest(){
        driver.get("https://1001puzzle.ru");
        new AuthorizationPage(driver)
                .singIn("hbs38224@bcaoo.com","Testtest")
                .checkNamePage("Личный кабинет");
    }
}
