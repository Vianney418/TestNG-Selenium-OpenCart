package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

public class OpenCartBuyProductPage extends SeleniumUtility {


    @FindBy(xpath = "//span[contains(.,'My Account')]")
    WebElement accountBtn;
    @FindBy(xpath = "//a[contains(.,'Login')]")
    WebElement loginBtn;
    @FindBy(id = "input-email")
    WebElement inputEmail;
    @FindBy(id = "input-password")
    WebElement inputPassword;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
    WebElement submitBtn;

    @FindBy(xpath = "//img[contains(@title,'Your Store')]")
    WebElement openCartBtn;
    @FindBy(xpath = "(//button[contains(@type,'submit')])[1]")
    WebElement product1Btn;

    @FindBy(xpath = "(//button[contains(@type,'submit')])[4]")
    WebElement product2Btn;
    @FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
    WebElement shoppingCartBtn;
    @FindBy(xpath = "//strong[contains(.,'View Cart')]")
    WebElement viewCartBtn;
    @FindBy(xpath = "//button[contains(@class,'btn-close')]")
    WebElement inputCloseBtn;



    public void starBrowser(String url) {driver.get(url);}

    public void userLoginTest(){
        waitForVisibleElement(accountBtn);
        accountBtn.click();
        loginBtn.click();
        inputEmail.click();
        inputEmail.sendKeys("medicenney13@gmail.com");
        inputPassword.click();
        inputPassword.sendKeys("22333418Vian");
    }
    public void submitLogin(){submitBtn.click();}


    public void retunsHomePage() {
        openCartBtn.click();
    }

    public void sendProductsToCart(){
        scrollToElement(product2Btn, -100);
        waitForVisibleElement(product2Btn);
        product1Btn.click();
        product2Btn.click();
        waitForClickeableElement(inputCloseBtn);
        inputCloseBtn.click();
    }

    public void browseShoppingCart(){
        waitForVisibleElement(shoppingCartBtn);
        scrollToElement(shoppingCartBtn, 100);
        waitForClickeableElement(shoppingCartBtn);
        shoppingCartBtn.click();
        viewCartBtn.click();
    }


}
