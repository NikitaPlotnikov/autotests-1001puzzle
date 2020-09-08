package ru.puzzle.main.site.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.puzzle.main.site.at.BasePage;
import ru.puzzle.main.site.at.block.HeaderBlock;

public class AuthorizationPage extends BasePage {
    @FindBy(css = "[name=\"LOGIN\"]")
    private WebElement inputLogin;
    @FindBy(css = "[name=\"PASSWORD\"]")
    private WebElement inputPassword;
    @FindBy(css = "[type=\"button\"]")
    private WebElement buttonSingIn;

    private HeaderBlock headerBlock;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
    }

    public PersonalAccountPage singIn(String login, String password){
        headerBlock.clickButton(HeaderBlock.NameButton.LOGIN);
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingIn.click();
        return new PersonalAccountPage(driver);
    }
}
