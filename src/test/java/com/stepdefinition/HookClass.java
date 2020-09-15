package com.stepdefinition;

import java.net.MalformedURLException;

import com.base.LibGlobel;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends LibGlobel {

	@Before
	public void berofeScenario() throws MalformedURLException {
		getDriverCloud();
		loadUrl("http://adactinhotelapp.com/");
	}

	@After
	public void afterScenario(Scenario sc) {
		System.out.println("after scenario");
	}
}
