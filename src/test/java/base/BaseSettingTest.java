package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class BaseSettingTest {
    protected WebDriver driver;
    protected WebDriverWait wait15second;

    @BeforeEach
    public void beforeAllTest(){
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("-incognito");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://1001puzzle.ru");
        wait15second = new WebDriverWait(driver, 15);
    }
    @AfterEach
    public void afterAllTest(){
        driver.quit();
    }
}
