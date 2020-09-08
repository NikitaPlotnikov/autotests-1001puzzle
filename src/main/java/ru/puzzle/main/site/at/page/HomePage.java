package ru.puzzle.main.site.at.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.puzzle.main.site.at.BasePage;
import ru.puzzle.main.site.at.block.HeaderBlock;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@class =\"all-puzzles\"]/a")
    private WebElement allPuzzleButton;

    private HeaderBlock headerBlock;

    public HomePage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
    }

    public AllPuzzlePage clickButtonAllPuzzle(){
        allPuzzleButton.click();
        return new AllPuzzlePage(driver);
    }

    public HeaderBlock getHeaderBlock() {
        return headerBlock;
    }
}
