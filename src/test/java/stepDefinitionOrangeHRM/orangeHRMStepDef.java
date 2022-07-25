package stepDefinitionOrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orangeHRMStepDef {

	WebDriver driver;
	
	@Given("Open the browser and Launch OrangeHRM application")
	public void open_the_browser_and_launch_orange_hrm_application() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
	}

	@When("Enter the Username {string}")
	public void enter_the_username(String username) throws Exception {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		Thread.sleep(6000);
	}

	@When("Enter the password {string}")
	public void enter_the_password(String password) throws Exception {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(6000); 
	}

	@Then("Click LoginIn button")
	public void click_login_in_button() throws Exception {
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(4000);
	}

	@Then("User navigates to homepage")
	public void user_navigates_to_homepage() {
	    System.out.println("User landed on homepage");
	    driver.close();
	}

	@Then("User does not navigates to homepage")
	public void user_does_not_navigates_to_homepage() {
		System.out.println("Enter correct username or password");
		driver.close();
	}
}
