package com.LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	static WebDriver driver;

	//Locators
	private By emailInputLocator = By.name("email");
	private By passwordInputLocator = By.xpath("//input[@name='password']");

	private By loginButtonLocator = By.xpath("//input[@type='submit']");
	private By forgottenPasswordLinkLocator = By.xpath("(//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/forgotten'])[1]");

	private By logoutLinkLocator = By.linkText("Logout");

	///Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// methods/ Actions
	public void enterEmail(String email) {
		WebElement emailInput = driver.findElement(emailInputLocator);
		emailInput.sendKeys(email);
	}

	public void enterPassword(String password) {
		WebElement passwordInput = driver.findElement(passwordInputLocator);
		passwordInput.sendKeys(password);
	}

	public void clickLoginButton() {
		WebElement loginButton = driver.findElement(loginButtonLocator);
		loginButton.click();
	}

	public boolean checkForgotPwdLink() {
		return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();

	}
	public boolean checkLogoutLink() {
		return driver.findElement(logoutLinkLocator).isDisplayed();

	}
	public void login(String email, String password) {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}

	public static String getForgotPwdPageUrl() {
		String forgotPwdPageUrl = driver.getCurrentUrl();
		return forgotPwdPageUrl;
	}
}
