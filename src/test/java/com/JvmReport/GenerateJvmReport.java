package com.JvmReport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateJvmReport {
	
	public static void generatereport(String jsonfile) {
		
		
		File f = new File("C:\\Users\\DORABABU\\eclipse-workspace\\Grooton\\src\\test\\resources\\Report");
		
		Configuration configuration = new Configuration(f, "Grooton Web Application");
		configuration.addClassifications("Os Operating","Windows");
		configuration.addClassifications("Browser","Chrome");
		configuration.addClassifications("BrowserVersion","8.25");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		
		ReportBuilder rb = new ReportBuilder(jsonfiles, configuration);
	}

}
