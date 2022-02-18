package org.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Step {
	WebDriver driver;
	@Given("User is on Facebook Page")
	public void user_is_on_Facebook_Page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("java");
		driver.findElement(By.id("pass")).sendKeys("java");
	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user need to verify home page is oprated or not")
	public void user_need_to_verify_home_page_is_oprated_or_not() {
		System.out.println("Done");
	}

}
