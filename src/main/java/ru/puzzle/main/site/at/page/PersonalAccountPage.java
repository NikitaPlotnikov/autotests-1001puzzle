package ru.puzzle.main.site.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.puzzle.main.site.at.BasePage;
import ru.puzzle.main.site.at.block.HeaderBlock;

public class PersonalAccountPage extends BasePage {
    @FindBy(xpath = "//h1[text()='Личный кабинет']")
    private WebElement titlePage;

    private HeaderBlock headerBlock;


    public PersonalAccountPage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
    }

    public PersonalAccountPage checkNamePage(String exampleNamePage){
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(titlePage,exampleNamePage));
        return this;
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }
}
