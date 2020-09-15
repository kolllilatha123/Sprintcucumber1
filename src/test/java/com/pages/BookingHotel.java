package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobel;

public class BookingHotel extends LibGlobel {
	public BookingHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fn;
	@FindBy(id = "last_name")
	private WebElement ln;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement ccno;
	@FindBy(id = "cc_type")
	private WebElement cctype;
	@FindBy(id = "cc_exp_month")
	private WebElement ccmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement ccyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	@FindBy(id = "book_now")
	private WebElement booknow;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement myitinerary;

	@FindBy(id = "order_id_text")
	private WebElement searchorderidtext;

	@FindBy(id = "search_hotel_id")
	private WebElement searchhotelid;

	@FindBy(id = "btn_id_356152")
	private WebElement cancel;

	public WebElement getMyitinerary() {
		return myitinerary;
	}

	public WebElement getSearchorderidtext() {
		return searchorderidtext;
	}

	public WebElement getSearchhotelid() {
		return searchhotelid;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public void clicks() {
		btnClick(getMyitinerary());

	}

	public void cancelBooking() {
		btnClick(getCancel());
		Alert a = driver.switchTo().alert();
		a.accept();
		System.out.println("canceld");

	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLn() {
		return ln;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcno() {
		return ccno;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void bookingHotel(String fn, String ln, String address, String ccno, String cctype, String ccmonth,
			String ccyear, String cvv) {

		type(getFn(), fn);
		type(getLn(), ln);
		type(getAddress(), address);
		type(getCcno(), ccno);
		selectDataBytext(getCctype(), cctype);
		selectDataBytext(getCcmonth(), ccmonth);
		selectDataBytext(getCcyear(), ccyear);
		type(getCvv(), cvv);
		btnClick(getBooknow());
	}
}
