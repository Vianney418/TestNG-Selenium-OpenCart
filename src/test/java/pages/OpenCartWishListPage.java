package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

public class OpenCartWishListPage extends SeleniumUtility {

    @FindBy(xpath = "//span[@class='d-none d-md-inline'][contains(.,'My Account')]")
    WebElement myAccountBtn;
    @FindBy(xpath = "//a[contains(.,'Login')]")
    WebElement loginBtn;
    @FindBy(id = "input-email")
    WebElement emailInput;
    @FindBy(id = "input-password")
    WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
    WebElement submitBtn;
    @FindBy(xpath = "//img[contains(@title,'Your Store')]")
    WebElement homeBtn;
    @FindBy(xpath = "(//button[contains(@type,'submit')])[2]")
    WebElement product1;
    @FindBy(xpath = "(//button[contains(@type,'submit')])[5]")
    WebElement product2;
    @FindBy(xpath = "(//button[contains(@type,'submit')])[8]")
    WebElement product3;
    @FindBy(xpath = "//button[contains(@class,'btn-close')]")
    WebElement inputCloset;
   @FindBy(id = "wishlist-total")
   WebElement wishListBtn;
   @FindBy(xpath = "//p[contains(.,'Powered By OpenCart Your Store © 2024')]")
   WebElement scrollBtn;



    public void starBrowser(String url){driver.get(url);}

    public void userLogin(){
        waitForVisibleElement(myAccountBtn);
        myAccountBtn.click();
        loginBtn.click();
        emailInput.click();
        emailInput.sendKeys("medicenney13@gmail.com");
        passwordInput.click();
        passwordInput.sendKeys("22333418Vian");
        submitBtn.click();
    }

    public void goToHome(){
        homeBtn.click();
    }

    public void selectProducts(){
        //scrollToPosition(0, 80);  //  desplazar 50 píxeles hacia abajo
        scrollForVariableHeight();
        product1.click();
        product2.click();
        product3.click();
        waitForVisibleElement(inputCloset);
        inputCloset.click();
    }

    public void getWishList(){
        waitForVisibleElement(wishListBtn);
        scrollToElementOnVariableHeight(wishListBtn);
        wishListBtn.click();
    }

}
