package AmazonStepDefinations;

import AmazonPages.HomePage;
import Configuration.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by JG on 4/19/21.
 */
public class HomePageTest extends HomePage {

    HomePage homePage;
    String price = null;


    @Test(priority=1)
    public void SelectQABooks() {
        String Search = homePage.getSearchButton().click();
        Search.sendkeys("qa testing for beginners");
        Actions builder = new Actions(driver);
        Search.sendKeys(Keys.ENTER);

        //Select First Available book from list
        homePage.clickFirstAvailableLinkonUI().click();
    }

    @Test(priority=2)
    public void getPriceOfTheBook() {

        if(homePage.selectRadioButtonForBuyUsedBooks().isSelected()) {
            System.out.print("Radio Button is already selected");
        } else {
            homePage.selectRadioButtonForBuyUsedBooks().click();
        }

        price = homePage.getPriceForValidation().getText();
        assert.assertEquals("$42.93", price);
    }

    @Test(priority=3)
    public void selectAddToCart() {
        homePage.clickAddToCart().click();
        homePage.clickProceedToCheckOutButton().click();
        assert.assertEquals("$42.93", price);
    }




}
