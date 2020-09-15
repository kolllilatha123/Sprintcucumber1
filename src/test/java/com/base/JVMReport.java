package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonFile) {
		File loc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\Reporting");
		Configuration config = new Configuration(loc, "adaction hotel automation");
		config.addClassifications("sprint", "20");
		config.addClassifications("browser", "chrome");
		config.addClassifications("env", "UAT");
		config.addClassifications("OS", "Windows-10");
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);

		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		builder.generateReports();

	}
}
