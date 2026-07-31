package pom;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Baseclass;

public class flipkartpage extends Baseclass {

    WebDriver driver;

    public flipkartpage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Search Box
    @FindBy(name = "q")
    WebElement txtSearch;

    // Search Button
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSearch;

    // First Product
    @FindBy(xpath = "(//a[contains(@href,'/p/')])[1]")
    WebElement firstProduct;

    // Add To Cart
    @FindBy(xpath = "//button[contains(.,'Add to cart')]")
    WebElement btnAddCart;

    // Place Order
    @FindBy(xpath = "//span[text()='Place Order']/ancestor::button")
    WebElement btnPlaceOrder;

    // Login Popup Close Button
    @FindBy(xpath = "//button[contains(@class,'QqFHMw')]")
    WebElement btnClosePopup;

    // Close Login Popup
    public void closeLoginPopup() {

        try {
            button(btnClosePopup);
            System.out.println("Popup Closed");
        } catch (Exception e) {
            System.out.println("Popup not present");
        }
    }

    // Search Product
    public void searchProduct(String product) {

        setText(txtSearch, product);

        button(btnSearch);
    }

    // Click First Product
    public void clickFirstProduct() {

        scrollToElement(firstProduct);

        button(firstProduct);
    }

    // Switch Window
    public void switchWindow() {

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        if (tabs.size() > 1) {
            driver.switchTo().window(tabs.get(1));
        }
    }

    // Add To Cart
    public void addToCart() {

        scrollDown();

        clickByJS(btnAddCart);
    }

    // Place Order
    public void placeOrder() {

        button(btnPlaceOrder);
    }

    // Verify Checkout
    public void verifyCheckoutPage() {

        System.out.println("Current Page Title:");
        System.out.println(driver.getTitle());
    }

    // Screenshot
    public void captureScreenshot() throws IOException {

        takeScreenshot("Flipkart");
    }
}
