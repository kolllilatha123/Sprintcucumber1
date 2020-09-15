package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobel;

public class LoginsPage extends LibGlobel {

	public LoginsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtuser;
	@FindBy(id = "password")
	private WebElement txtpass;
	@FindBy(id = "login")
	private WebElement login;

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLogin() {
		return login;
	}

	public void Login(String username, String password) {
		type(getTxtuser(), username);
		type(getTxtpass(), password);
		btnClick(getLogin());
	}
}
