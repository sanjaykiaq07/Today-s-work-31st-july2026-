package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	 public static WebDriver driver;
	

	    public void launchBrowser() {

	        System.out.println("Launching Browser...");

	        WebDriverManager.chromedriver().setup();

	        driver = new ChromeDriver();

	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.flipkart.com/");
	        System.out.println("Browser Launched Successfully");
	    }

		
	public void button(WebElement element) {
		element.click();
	}
	public void setText(WebElement element, String value) {

	    element.sendKeys(value);
	
		}
		public void waitimplict(WebElement element,String value) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
			
		}
		public String retriveText(WebElement element ) {
			String text =element.getText();
			return text;
		}

		 // Scroll Down
	    public void scrollDown() {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("window.scrollBy(0,1000)");
	    }

	    // Scroll Up
	    public void scrollUp() {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("window.scrollBy(0,-1000)");
	    }

	    // Scroll to Element
	    public void scrollToElement(WebElement element) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("arguments[0].scrollIntoView(true)", element);
	    }

	    // Click using JavaScript
	    public void clickByJS(WebElement element) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("arguments[0].click()", element);
	    }

	    // Send Text using JavaScript
	    public void sendTextByJS(WebElement element, String value) {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("arguments[0].value=arguments[1]", element, value);
	    }

	    // Mouse Hover
	    public void mouseHover(WebElement element) {

	        Actions ac = new Actions(driver);

	        ac.moveToElement(element).perform();
	    }

	    // Drag and Drop
	    public void dragAndDrop(WebElement source, WebElement destination) {

	        Actions ac = new Actions(driver);

	        ac.dragAndDrop(source, destination).perform();
	    }

	    // Double Click
	    public void doubleClick(WebElement element) {

	        Actions ac = new Actions(driver);

	        ac.doubleClick(element).perform();
	    }

	    // Right Click
	    public void rightClick(WebElement element) {

	        Actions ac = new Actions(driver);

	        ac.contextClick(element).perform();
	    }

	    // Accept Alert
	    public void acceptAlert() {

	        Alert al = driver.switchTo().alert();

	        al.accept();
	    }

	    // Dismiss Alert
	    public void dismissAlert() {

	        Alert al = driver.switchTo().alert();

	        al.dismiss();
	    }

	    // Get Alert Text
	    public String getAlertText() {

	        Alert al = driver.switchTo().alert();

	        return al.getText();
	    }

	    // Screenshot
	    public void takeScreenshot(String fileName) throws IOException {

	        TakesScreenshot ts = (TakesScreenshot) driver;

	        File src = ts.getScreenshotAs(OutputType.FILE);

	        File dest = new File("./Screenshots/" + fileName + ".png");

	        FileUtils.copyFile(src, dest);
	    }
	}


		
		
			
		

		
		
	
	
	

