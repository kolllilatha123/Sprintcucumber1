package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\AdultPerRoom.feature", glue = {
		"com.stepdefinition" }, plugin = { "pretty",
				"json:\\src\\test\\resources\\Reporting\\cucumber.json" }, dryRun = false, monochrome = true, strict = true)
public class TestRunner {

	@AfterClass
	public static void afterclass() {
		JVMReport
				.generateJVMReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting\\cucumber.json");

	}
}
