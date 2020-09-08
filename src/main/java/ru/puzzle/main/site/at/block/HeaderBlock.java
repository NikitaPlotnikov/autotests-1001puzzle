package ru.puzzle.main.site.at.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.puzzle.main.site.at.BasePage;
import ru.puzzle.main.site.at.page.HomePage;
import ru.puzzle.main.site.at.utils.ButtonNotFoundException;

public class HeaderBlock extends BasePage {
    @FindBy(css = "[href=\"/login/\"]")
    protected WebElement loginButton;

    @FindBy(css = "[class=\"ru\"]")
    protected WebElement ruLanguageButton;

    @FindBy(css = "[class=\"eng\"]")
    protected WebElement engLanguageButton;

    @FindBy(css = "[class=\"link-delivery\"]")
    protected WebElement deliveryButton;

    @FindBy(css = "[class=\"link-about active\"]")
    protected WebElement aboutUsButton;

    @FindBy(css = "[class=\"link-contacts\"]")
    protected WebElement contactsButton;

    @FindBy(css = "[class=\"link-login\"]")
    protected WebElement accountButton;

    @FindBy(xpath = "//li/a[text()='Выход']")
    protected WebElement exitButton;

    @FindBy(css = "[class=\"logo\"]")
    protected WebElement homeButton;

    @FindBy(css = "[id=\"bx_basket1\"]")
    protected WebElement basketButton;

    public HeaderBlock(WebDriver driver) {
        super(driver);
    }

    public HomePage clickButton(NameButton nameButton){
        switch (nameButton) {
            case LOGIN: {
                this.loginButton.click();
                break;
            }
            case RU_LANGUAGE:{
                this.ruLanguageButton.click();
                break;
            }
            case ENG_LANGUAGE: {
                this.engLanguageButton.click();
                break;
            }
            case ABOUT_US: {
                this.aboutUsButton.click();
                break;
            }
            case CONTACTS: {
                this.contactsButton.click();
                break;
            }
            case DELIVERY: {
                this.deliveryButton.click();
                break;
            }
            case ACCOUNT: {
                this.accountButton.click();
                break;
            }
            case EXIT: {
                this.exitButton.click();
                break;
            }
            case HOME: {
                this.homeButton.click();
                break;
            }
            case BASKET: {
                this.basketButton.click();
                break;
            }
            default: {
                throw new ButtonNotFoundException("Кнопки " + nameButton + " нет на странице.\n" +
                        "Или условие не описанно в switch");
            }
        }
        return new HomePage(driver);
    }

    public enum NameButton {
        LOGIN("Вход"),
        RU_LANGUAGE("Русский"),
        ENG_LANGUAGE("Английский"),
        ABOUT_US("О нас"),
        CONTACTS("Контакты"),
        DELIVERY("Доставка"),
        ACCOUNT("Карьера"),
        EXIT("Выход"),
        HOME("Главная"),
        BASKET("Корзина");

        private String text;

        NameButton(String text) {
            this.text = text;
        }
        public String getText() {
            return text;
        }
    }
}
