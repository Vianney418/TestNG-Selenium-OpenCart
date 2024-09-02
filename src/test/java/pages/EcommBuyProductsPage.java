package pages;


import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;
import java.util.List;
import java.util.Map;

public class EcommBuyProductsPage extends SeleniumUtility {

    @FindBy(xpath = "//a[@ng-reflect-router-link='product-details/6']")
    WebElement productBtn1;
    @FindBy(xpath = "//a[@ng-reflect-router-link='product-details/7']")
    WebElement productBtn2;
    @FindBy(xpath = "//a[@ng-reflect-router-link='product-details/9']")
    WebElement product3Btn;
    @FindBy(xpath = "//button[@class='form-button'][contains(.,'Add To Cart')]")
    WebElement addToCartBtn;
    @FindBy(xpath = "//a[@routerlink='/'][contains(.,'E-comm')]")
    WebElement ecommHomeBtn;
    @FindBy(xpath = "//a[@ng-reflect-router-link='/cart-page'][contains(.,'Cart(3)')]")
    WebElement cartBtn;
    @FindBy(xpath = "//a[contains(.,'Click here')]")
    WebElement clickHereBtn;
    @FindBy(name = "email")
    WebElement emailInput;
    @FindBy(name = "password")
    WebElement passwordInput;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Login')]")
    WebElement loginBtn;
    @FindBy(xpath = "//button[@class='form-button'][contains(.,'Checkout')]")
    WebElement checkoutBnt;
    @FindBy(name = "address")
    WebElement addressinput;
    @FindBy(name = "contact")
    WebElement numberaddressinput;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Order Now')]")
    WebElement orderNowBtn;
    @FindBy(xpath = "//h1[contains(.,'My Orders')]")
    WebElement myOrdersTxt;





    public void starBrowser(String url) {driver.get(url);}

    public void selectedProductsXCart(){
        scrollToElementOnVariableHeight(productBtn1);
        productBtn1.click();
        addToCartBtn.click();
        ecommHomeBtn.click();
        scrollToElementOnVariableHeight(productBtn2);
        productBtn2.click();
        scrollToElementOnVariableHeight(addToCartBtn);
        addToCartBtn.click();
        scrollToElementOnVariableHeight(ecommHomeBtn);
        ecommHomeBtn.click();
        scrollToElementOnVariableHeight(product3Btn);
        product3Btn.click();
        scrollToElementOnVariableHeight(addToCartBtn);
        addToCartBtn.click();
        scrollToElementOnVariableHeight(ecommHomeBtn);
        ecommHomeBtn.click();
    }

    public void cartBtn(){
        cartBtn.click();
    }

    public void clickHere(){
        clickHereBtn.click();
    }

    public void userLoginForm(DataTable dataTable) {
        List<Map<String, String>> loginData = dataTable.asMaps(String.class, String.class);
        for (Map<String,String> data : loginData){
            emailInput.sendKeys(data.get("Enter email"));
            passwordInput.sendKeys(data.get("Enter password"));
        }
        loginBtn.click();

    }

    public void verifyPayment() {
        checkoutBnt.click();
    }

    public void addShippingAddress(DataTable dataTable) {
        List<Map<String, String>> addressData = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> data : addressData){
            emailInput.sendKeys(data.get("Enter email"));
            addressinput.sendKeys(data.get("Address"));
            numberaddressinput.sendKeys(data.get("Number"));
            orderNowBtn.click();
        }
    }

    public String validateMyOrderTxt() {
        waitForVisibleElement(myOrdersTxt);
        return myOrdersTxt.getText();
    }

}
