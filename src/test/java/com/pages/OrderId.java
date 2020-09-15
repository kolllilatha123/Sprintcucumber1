package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobel;

public class OrderId extends LibGlobel {

	public OrderId() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderno;

	@FindBy(id = "logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public void getorderId() {
		getTxet(getOrderno());

	}

	public void logout() {
		btnClick(getLogout());

	}

}
