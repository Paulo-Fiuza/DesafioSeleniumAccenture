package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActions {

	private WebDriver driver;
	
	public WebActions(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
		
	public void clickComumSeleniumAndEnter(WebElement element, Keys enter) {
		element.click();

	}
	
		
	public void clickComumSelenium(WebElement element) {
		element.click();
		
	}
	
	public String getText(WebElement element) {
		return this.elementIsVisible(element, 20).getText();
	}
	
	public void insertText(String value, WebElement element) {
		element.sendKeys(value);
	}
	
	public void insertTextEnter(String value, WebElement element, Keys Enter) {
		element.sendKeys(value);
		
	}
	
	public void insertTextandEnter(String value, WebElement element) {
		element.sendKeys(value + Keys.ENTER);
		
	}	

	
	public void assertEquals(String element) {
	}

	@SuppressWarnings("deprecation")
	public WebElement elementIsVisible(WebElement element, int seconds) {
		return new WebDriverWait(driver, seconds)
				.ignoring(StaleElementReferenceException.class)
				.ignoring(NoSuchElementException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
	
	
	}
	
	
	
	public void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds * 1000);
	}

	public Object executeJS(String cmd, Object... param) {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		return js.executeAsyncScript(cmd,  param);
			
}
	public void click(WebElement webElement) throws InterruptedException {
		try {
			executeJS("arguments[0].click();", webElement);
		}catch (StaleElementReferenceException ex) {
			webElement.click();
		}catch (WebDriverException ex) {
			this.sleep(3);
			webElement.click();
			System.out.println(ex.getMessage());
			
		}
	}
	
	public void moveToElementAndClick(WebElement element) {
		new Actions(driver).moveToElement(element).click();
	}
	
	public void selectByText(WebElement element, String text){
		Select combo = new Select(element);
		combo.selectByVisibleText(text);

		}
	
	public void obterValorCampo(String id_campo) {
		driver.findElement(By.id(id_campo)).getAttribute("value");
			
	}
	///////// METODOS JS 
	
	private Object executeJs(String script, Object... args) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(script, args);
	}

	public void scrollToElement(WebElement element) {
		executeJs("Arguments[0].scrollIntoView(true)", element);
	}

	public void scroll(int scroll) {
		executeJs("window.scrollBy(0," + scroll + ")", "");
	}

	public void assertEquals(String string, String string2) {
		
		
	}


}