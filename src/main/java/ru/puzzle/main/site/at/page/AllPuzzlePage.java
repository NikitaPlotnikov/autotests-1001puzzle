package ru.puzzle.main.site.at.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.puzzle.main.site.at.BasePage;
import ru.puzzle.main.site.at.block.HeaderBlock;

public class AllPuzzlePage extends BasePage {
    private HeaderBlock headerBlock;


    public AllPuzzlePage(WebDriver driver) {
        super(driver);
        this.headerBlock = new HeaderBlock(driver);
    }

    public void clickPuzzle(String text){
        driver.findElement(By.xpath("//div/a[text()='" + text + "']")).click();
    }


}
