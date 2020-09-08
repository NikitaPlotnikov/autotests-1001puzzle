import base.BaseSettingTest;
import org.junit.jupiter.api.Test;
import ru.puzzle.main.site.at.block.HeaderBlock;
import ru.puzzle.main.site.at.page.AuthorizationPage;

public class AddBasketWebTest extends BaseSettingTest {

    @Test
    void addBasketTest(){
        driver.get("https://1001puzzle.ru");
        new AuthorizationPage(driver)
                .singIn("hbs38224@bcaoo.com","Testtest")
                .checkNamePage("Личный кабинет")
                .getHeaderBlock().clickButton(HeaderBlock.NameButton.HOME)
                .clickButtonAllPuzzle()
                .clickPuzzle("Пазл Hatber 1000 деталей: Огни города");

    }
}
