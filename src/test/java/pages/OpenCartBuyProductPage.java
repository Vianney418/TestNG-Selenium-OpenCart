package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.SeleniumUtility;

import java.util.List;
import java.util.Map;

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
    @FindBy(xpath = "(//i[@class='fa-solid fa-shopping-cart'])[1]")
    WebElement product1Btn;

    @FindBy(xpath = "(//i[contains(@class,'fa-solid fa-shopping-cart')])[2]")
    WebElement product2Btn;
    @FindBy(xpath = "(//button[contains(@type,'button')])[8]")
    WebElement btnTermsConditions;
    @FindBy(xpath = "//button[@data-bs-toggle='dropdown']")
    WebElement shoppingCartBtn;
    @FindBy(xpath = "//strong[contains(.,'View Cart')]")
    WebElement viewCartBtn;
    @FindBy(xpath = "//button[contains(@class,'btn-close')]")
    WebElement inputCloseBtn;
    @FindBy(xpath = "//button[@type='button'][contains(.,'Estimate Shipping & Taxes')]")
    WebElement taxesBtn;
    @FindBy(id = "input-country")
    WebElement inputCountry;
    @FindBy(xpath = "//option[@value='43'][contains(.,'Chile')]")
    WebElement selectCountryChile;
    @FindBy(xpath = "//select[contains(@name,'zone_id')]")
    WebElement inputRegion;
    @FindBy(xpath = "//option[@value='678'][contains(.,'Los Lagos')]")
    WebElement selectRegionLosLagos;
    @FindBy(id = "input-postcode")
    WebElement inputPostCode;
    @FindBy(id = "button-quote")
    WebElement getQuotesBtn;
    @FindBy(id = "input-shipping-method-flat-flat")
    WebElement inputShippingFlat;
    @FindBy(id = "button-shipping-method")
    WebElement applyShippingBtn;
    @FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
    WebElement getCheckoutBtn;
    @FindBy(id = "input-shipping-firstname")
    WebElement getInputFirstName;
    @FindBy(id = "input-shipping-lastname")
    WebElement getInputLastName;
    @FindBy(id = "input-shipping-address-1")
    WebElement getInputAddress1;
    @FindBy(id = "input-shipping-city")
    WebElement getInputCity;
    @FindBy(id = "button-shipping-address")
    WebElement shippingAddressBtn;


    @FindBy(name = "search")
    WebElement searchBtn;
    @FindBy(xpath = "//button[contains(@data-lang,'en-gb')]")
    WebElement buscarBtn;
    @FindBy(xpath = "//button[contains(@aria-label,'Add to Cart')]")
    WebElement producto1;
    @FindBy(css= "footer:nth-child(5) div.container div.row:nth-child(1) div.col-sm-3:nth-child(3) > ul.list-unstyled:nth-child(2)")
    WebElement productListscrool;



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
    public void submitLogin(){
        submitBtn.click();}


    public void retunsHomePage() {

        openCartBtn.click();
    }

    public void searchProduct(){
        searchBtn.click();
        searchBtn.sendKeys("Nikon D300");
        buscarBtn.click();
        scrollToElement(productListscrool,-500);
        product1Btn.click();
        waitForClickeableElement(inputCloseBtn);
        inputCloseBtn.click();

    }

   /* public void sendProductsToCart(){
        scrollToElement(btnTermsConditions, -200);
        waitForVisibleElement(product1Btn);
        waitForClickeableElement(product2Btn);
        product1Btn.click();
        product2Btn.click();
        waitForClickeableElement(inputCloseBtn);
        inputCloseBtn.click();
    }*/

    public void browseShoppingCart(){
        waitForVisibleElement(shoppingCartBtn);
        scrollToElement(shoppingCartBtn, 100);
        waitForClickeableElement(shoppingCartBtn);
        shoppingCartBtn.click();
        viewCartBtn.click();
    }

    public void estimateShippingTaxes(){
        scrollToElement(taxesBtn,-100);
        taxesBtn.click();
        inputCountry.click();
        selectCountryChile.click();
        inputRegion.click();
        selectRegionLosLagos.click();
        scrollToElement(inputPostCode,20);
        inputPostCode.click();
        inputPostCode.sendKeys("30001");
        getQuotesBtn.click();
        waitForClickeableElement(inputShippingFlat);
        inputShippingFlat.click();
        applyShippingBtn.click();

    }

    public void continueWithCheckout(){

        getCheckoutBtn.click();
    }

    public void formShippingAddress(DataTable dataTable){
        List<Map<String,String>> formAddressDetails = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> details : formAddressDetails){
            getInputFirstName.sendKeys(details.get("First Name"));
            getInputLastName.sendKeys(details.get("Last Name"));
            getInputAddress1.sendKeys(details.get("Address 1"));
            getInputCity.sendKeys(details.get("City"));

        }
    }


}
