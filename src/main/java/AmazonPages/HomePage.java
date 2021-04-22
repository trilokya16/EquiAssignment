package AmazonPages;

import Configuration.Config;
import com.oracle.jrockit.jfr.EventDefinition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Config{

    final WebDriver driver;


    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id='search']/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/span/a/div")
    WebElement firstAvailableLink;

    @FindBy(xpath = "//*[@id='usedAccordionRow_263333']/div/div[1]/a")
    WebElement radioButtonForBuyUsed;

    @FindBy(xpath = "//*[@id='olp_263333_feature_div']/div/div/span/span/span")
    WebElement getPrice;

    @FindBy(id = "add-to-cart-button-ubb")
    WebElement addToCart;

    @FindBy(id = "hlb-ptc-btn-native")
    WebElement proceedToCheckout;


    // Initializing the Page Objects:
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getSearchButton() {
         return searchButton;
    }

    public WebElement clickFirstAvailableLinkonUI(){
        return firstAvailableLink;
    }

    public WebElement selectRadioButtonForBuyUsedBooks() {
        return radioButtonForBuyUsed;
    }

    public WebElement getPriceForValidation() {
        return getPrice;
    }

    public WebElement clickAddToCart() {
        return addToCart;
    }

    public WebElement clickProceedToCheckOutButton(){
        return proceedToCheckout;
    }
}
