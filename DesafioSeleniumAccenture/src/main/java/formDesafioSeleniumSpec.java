import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.formDesafioSeleniumPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Utils.WebActions;

public class formDesafioSeleniumSpec {
	private WebDriver driver;
	private WebActions actions;
	private formDesafioSeleniumPage page;

	
	
	@Before
	public void init () {
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	actions = new WebActions(driver);
	page = new formDesafioSeleniumPage(driver);
	
	}
	
	@After
	public void quit() {
		driver.quit();
	}

	@Given("que acesso a URL")
	public void que_acesso_a_url() {
		actions.getUrl(page.getUrl());

	}

	@Given("realizo a validacao do formulario Enter Vehicle Data")
	public void realizo_a_validacao_o_do_formulario_enter_vehicle_data() {
		actions.assertEquals("Enter Vehicle Data", "Enter Vehicle Data");
	}

	@Given("preencho o campo MAKE")
	public void preencho_o_campo_make() {
		actions.selectByText(page.selectMake(), "Honda");

	}

	@Given("preencho o campo Model")
	public void preencho_o_campo_model() {
		actions.selectByText(page.selectModel(), "Scooter");
	}

	@Given("preencho o campo Cylinder Capacity [ccm]")
	public void preencho_o_campo_cylinder_capacity_ccm() {
		actions.insertText("150", page.inputCmm());
	}

	@Given("preencho o campo Engine Performance [kW]")
	public void preencho_o_campo_engine_performance_k_w() {
		actions.insertText("300", page.inputKW());
	}

	@Given("preencho o campo Date of Manufacture")
	public void preencho_o_campo_date_of_manufacture() {
		actions.insertText("12/12/2021", page.inputDate());
	}

	@Given("preencho o campo Number of Seats")
	public void preencho_o_campo_number_of_seats() {
		actions.selectByText(page.selectNumberofSeats(), "2");

	}

	@Given("preencho o campo Right Hand Drive")
	public void preencho_o_campo_right_hand_drive() {
		actions.clickComumSelenium(page.clickNo());

	}

	@Given("preencho o campo Number of Seats Motorcycle")
	public void preencho_o_campo_number_of_seats_motocycle() {
		actions.selectByText(page.selectNumberofSeatsMotorcycle(), "3");
	}

	@Given("preencho o campo Fuel Type")
	public void preencho_o_campo_fuel_type() {
		actions.selectByText(page.selectFuelType(), "Electric Power");

	}

	@Given("preencho o campo Payload [kg]")
	public void preencho_o_campo_payload_kg() {
		actions.insertText("100", page.inputPayload());
	}

	@Given("preencho o campo Total Weight [kg]")
	public void preencho_o_campo_total_weight_kg() {
		actions.insertText("200", page.inputTotalWeight());
	}

	@Given("preencho o campo List Price [$]")
	public void preencho_o_campo_list_price_$() {
		actions.insertText("500", page.inputListPrice());
	}

	@Given("preencho o campo License Plate Number")
	public void preencho_o_campo_license_plate_number() {
		actions.insertText("300", page.inputLicensePlateNumber());
	}

	@Given("preencho o campo Annual Mileage [mi]")
	public void preencho_o_campo_annual_mileage_mi() throws InterruptedException {
		actions.insertText("400", page.inputAnnualMileage());
		actions.sleep(1);
	}

	@When("clico em Next")
	public void clico_em_next() {
		actions.clickComumSelenium(page.clickNext());
	}

	@Given("realizo a validacao do formulario Enter Insurant Data")
	public void realizo_a_validacao_do_formulario_enter_insurant_data() {
		actions.assertEquals("enterinsurantdata", "enterinsurantdata");
	}

	@Given("preencho o campo First Name")
	public void preencho_o_campo_first_name() {
		actions.insertText("Paulo", page.inputFirstName());
	}

	@Given("preencho o campo Last Name")
	public void preencho_o_campo_last_name() {
		actions.insertText("Fiuza", page.inputLastName());
	}

	@Given("preencho o campo Date of Birth")
	public void preencho_o_campo_date_of_birth() {
		actions.insertText("05/06/2000", page.inputDateofBirth());
	}

	@Given("Seleciono uma opcao Gender")
	public void seleciono_uma_opcao_gender() {
		actions.clickComumSelenium(page.clickMale());
	}

	@Given("preencho o campo Street Address")
	public void preencho_o_campo_street_address() {
		actions.insertText("São Paulo-SP", page.inputStreetAddress());
	}

	@Given("preencho o campo Country")
	public void preencho_o_campo_country() {
		actions.selectByText(page.selectCountry(), "Brazil");
	}

	@Given("preencho o campo Zip Code")
	public void preencho_o_campo_zip_code() {
		actions.insertText("010360", page.inputZipCode());
	}

	@Given("preencho o campo City")
	public void preencho_o_campo_city() {
		actions.insertText("São Paulo-SP", page.inputCity());
	}

	@Given("preencho o campo Occupation")
	public void preencho_o_campo_occupation() {
		actions.selectByText(page.selectOccupation(), "Selfemployed");
	}

	@Given("Seleciono uma opcao Hobbies")
	public void seleciono_uma_opcao_hobbies() {
		actions.clickComumSelenium(page.clickSkydiving());
	}

	@Given("preencho o campo Website")
	public void preencho_o_campo_website() throws InterruptedException {
		actions.insertText("https://www.accenture.com/", page.inputWebsite());
		actions.sleep(1);
	}

	@When("clico em nextenterproductdata")
	public void clico_em_nextenterproductdata() {
		actions.clickComumSelenium(page.clicknextenterproductdata());

	}

	@Given("realizo a validacao do formulario Enter Product Data")
	public void realizo_a_validacao_do_formulario_enter_product_data() {
		actions.assertEquals("enterproductdata", "enterproductdata");
	}

	@Given("preencho o campo Start Date")
	public void preencho_o_campo_start_date() {
		actions.insertText("03/03/2022", page.inputStartDate());
	}

	@Given("preencho o campo Insurance Sum [$]")
	public void preencho_o_campo_insurance_sum_$() {
		actions.selectByText(page.selectInsuranceSum(), "15.000.000,00");
	}

	@Given("preencho o campo Merit Rating")
	public void preencho_o_campo_merit_rating() {
		actions.selectByText(page.selectMeritRating(), "Super Bonus");
	}

	@Given("preencho o campo Damage Insurance")
	public void preencho_o_campo_damage_insurance() {
		actions.selectByText(page.selectDamageInsurance(), "Full Coverage");
	}

	@Given("Seleciono uma opcao Optional Products")
	public void seleciono_uma_opcao_optional_products() {
		actions.clickComumSelenium(page.clickEuroProtection());
	}

	@Given("preencho o campo Courtesy Car")
	public void preencho_o_campo_courtesy_car() throws InterruptedException {
		actions.selectByText(page.selectCourtesyCar(), "Yes");
		actions.sleep(1);
	}

	@When("clico em nextselectpriceoption")
	public void clico_em_nextselectpriceoption() {
		actions.clickComumSelenium(page.clicknextselectpriceoption());
	}

	@Given("realizo a validacao do formulario Select Price Option")
	public void realizo_a_validacao_do_formulario_select_price_option() throws InterruptedException {
		actions.assertEquals("selectpriceoption", "selectpriceoption");
		actions.sleep(1);
	}

	@Given("preencho o campo Select Option")
	public void preencho_o_campo_select_option() throws InterruptedException {
		actions.clickComumSelenium(page.clickselectultimate());
		actions.sleep(1);
	}

	@When("clico em nextsendquote")
	public void clico_em_nextsendquote() {
		actions.clickComumSelenium(page.clicknextsendquote());

	}

	@Given("realizo a validacao do formulario Send Quote")
	public void realizo_a_validacao_do_formulario_send_quote() {
		actions.assertEquals("sendquote", "sendquote");
	}

	@Given("preencho o campo E-Mail")
	public void preencho_o_campo_e_mail() {
		actions.insertText("desafio.selenium@completo.com", page.inputEMail());
	}

	@Given("preencho o campo Phone")
	public void preencho_o_campo_phone() {
		actions.insertText("123456789", page.inputPhone());
	}

	@Given("preencho o campo Username")
	public void preencho_o_campo_username() {
		actions.insertText("PauloFiuza", page.inputUsername());
	}

	@Given("preencho o campo Password")
	public void preencho_o_campo_password() {
		actions.insertText("@Ccenture1", page.inputPassword());
	}

	@Given("preencho o campo Confirm Password")
	public void preencho_o_campo_confirm_password() {
		actions.insertText("@Ccenture1", page.inputConfirmPassword());
	}

	@Given("preencho o campo Comments")
	public void preencho_o_campo_Comments() {
		actions.insertText("Desafio técnico, Teste Selenium Completo.", page.inputComments());

	}

	@Given("clico em sendemail")
	public void clico_em_sendemail() throws InterruptedException {
		actions.clickComumSelenium(page.clicksendemail());
		actions.sleep(10);
	}

	@When("Valido a mensagem Sending e-mail success!")
	public void valido_a_mensagem_sending_e_mail_success() throws InterruptedException {
		actions.assertEquals("Sending e-mail success!", "Sending e-mail success!");
		actions.sleep(2);
	}

	@Then("clicar em confirm")
	public void clicar_em_confirm() {
		actions.clickComumSelenium(page.clickconfirm());
		//driver.quit();
		// driver.close();
	}

}