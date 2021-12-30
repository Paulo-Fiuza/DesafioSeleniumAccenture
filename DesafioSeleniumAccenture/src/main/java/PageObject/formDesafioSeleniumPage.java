package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formDesafioSeleniumPage {

	private WebDriver driver;

	public formDesafioSeleniumPage(WebDriver driver) {
		super();
		this.driver = driver;

	}

	public String getUrl() {
		return "http://sampleapp.tricentis.com/101/app.php";
	}

	public WebElement selectMake() {
		return driver.findElement(By.id("make"));
	}

	public WebElement selectModel() {
		return driver.findElement(By.id("model"));
	}

	public WebElement inputCmm() {
		return driver.findElement(By.id("cylindercapacity"));
	}

	public WebElement inputKW() {
		return driver.findElement(By.id("engineperformance"));
	}

	public WebElement inputDate() {
		return driver.findElement(By.id("dateofmanufacture"));
	}

	public WebElement selectNumberofSeats() {
		return driver.findElement(By.id("numberofseats"));
	}

	public WebElement clickNo() {
		return  driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
	}


	public WebElement selectNumberofSeatsMotorcycle() {
		return driver.findElement(By.id("numberofseatsmotorcycle"));
	}

	public WebElement selectFuelType() {
		return driver.findElement(By.id("fuel"));
	}

	public WebElement inputPayload() {
		return driver.findElement(By.id("payload"));
	}

	public WebElement inputTotalWeight() {
		return driver.findElement(By.id("totalweight"));
	}

	public WebElement inputListPrice() {
		return driver.findElement(By.id("listprice"));
	}

	public WebElement inputLicensePlateNumber() {
		return driver.findElement(By.id("licenseplatenumber"));
	}

	public WebElement inputAnnualMileage() {
		return driver.findElement(By.id("annualmileage"));
	}

	public WebElement clickNext() {
		return driver.findElement(By.id("nextenterinsurantdata"));
	}

		public WebElement inputFirstName() {
		return driver.findElement(By.id("firstname"));
	}

	public WebElement inputLastName() {
		return driver.findElement(By.id("lastname"));
	}

	public WebElement inputDateofBirth() {
		return driver.findElement(By.id("birthdate"));
	}

	public WebElement clickMale() {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
	}

	public WebElement inputStreetAddress() {
		return driver.findElement(By.id("streetaddress"));
	}

	public WebElement selectCountry() {
		return driver.findElement(By.id("country"));
		
	}

	public WebElement inputZipCode() {
		return driver.findElement(By.id("zipcode"));
	}

	public WebElement inputCity() {
		return driver.findElement(By.id("city"));
	}

	public WebElement selectOccupation() {
		return driver.findElement(By.id("occupation"));
	}

	public WebElement clickSkydiving() {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span"));
	}

	public WebElement inputWebsite() {
		return driver.findElement(By.id("website"));
		
	}

	public WebElement clicknextenterproductdata() {
		return driver.findElement(By.id("nextenterproductdata"));
		
	}
	
	public WebElement inputStartDate() {
		return driver.findElement(By.id("startdate"));
	}

	public WebElement selectInsuranceSum() {
		return driver.findElement(By.id("insurancesum"));
	}

	public WebElement selectMeritRating() {
		return driver.findElement(By.id("meritrating"));
	}

	public WebElement selectDamageInsurance() {
		return driver.findElement(By.id("damageinsurance"));
	}

	public WebElement clickEuroProtection() {
		return driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]"));
	}

	public WebElement selectCourtesyCar() {
		return driver.findElement(By.id("courtesycar"));
	}

	public WebElement clicknextselectpriceoption() {
		return driver.findElement(By.id("nextselectpriceoption"));
	}

	public WebElement clickselectultimate() {
		return driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span"));
		
	}

	public WebElement clicknextsendquote() {
		return driver.findElement(By.id("nextsendquote"));
	}

	public WebElement inputEMail() {
		return driver.findElement(By.id("email"));
	}

	public WebElement inputPhone() {
		return driver.findElement(By.id("phone"));
	}

	public WebElement inputUsername() {
		return driver.findElement(By.id("username"));
	}

	public WebElement inputPassword() {
		return driver.findElement(By.id("password"));
	}

	public WebElement inputConfirmPassword() {
		return driver.findElement(By.id("confirmpassword"));
	}

	public WebElement inputComments() {
		return driver.findElement(By.id("Comments"));
	}

	public WebElement clicksendemail() {
		return driver.findElement(By.id("sendemail"));
	}

	public WebElement clickconfirm() {
		return driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button"));
	}

	

}