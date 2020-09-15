package com.PageObject;

import com.base.LibGlobel;
import com.pages.BookingHotel;
import com.pages.ChooseSearch;
import com.pages.LoginsPage;
import com.pages.OrderId;
import com.pages.SearchHotel;

public class PageObjectManager extends LibGlobel {

	private static PageObjectManager PageObjectManager = null;
	private LoginsPage LoginsPage;
	private SearchHotel SearchHotel;
	private ChooseSearch ChooseSearch;
	private BookingHotel BookingHotel;
	private OrderId OrderId;

	private PageObjectManager() {

	}

	public static PageObjectManager getInstance() {
		if (PageObjectManager == null) {
			PageObjectManager = new PageObjectManager();
		}
		return PageObjectManager;

	}

	public LoginsPage getLoginsPage() {
		if (driver.getCurrentUrl().contains("adactinhotelapp")) {
			PageObjectManager = null;
			LoginsPage = null;
			if (LoginsPage == null) {
				LoginsPage = new LoginsPage();
			}
		}

		return LoginsPage;
	}

	public SearchHotel getSearchHotel() {

		return (SearchHotel == null) ? SearchHotel = new SearchHotel() : SearchHotel;
	}

	public BookingHotel getBookingHotel() {

		return (BookingHotel == null) ? BookingHotel = new BookingHotel() : BookingHotel;
	}

	public ChooseSearch getChooseSearch() {

		return (ChooseSearch == null) ? ChooseSearch = new ChooseSearch() : ChooseSearch;
	}

	public OrderId getOrderId() {

		return (OrderId == null) ? OrderId = new OrderId() : OrderId;
	}

}