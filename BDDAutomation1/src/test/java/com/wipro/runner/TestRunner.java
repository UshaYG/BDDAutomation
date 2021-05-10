package com.wipro.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\HP\\eclipse-workspace\\BDDAutomation1\\FeatureFile",
                 monochrome=true,
                 dryRun=false,
                 glue="com.wipro.stepdefinitions",
                 plugin= {"html:target/cucumber-report/",
                         "json:target/cucumber.json",
                         "pretty:target/cucumber-pretty.txt",
                         "junit:target/cucumber-results.xml"
                         //"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
                         }
		)
public class TestRunner {

	/*@BeforeClass
	public static void setReportConfiguration() {
		ExtentProperties property = ExtentProperties.INSTANCE;
		property.setReportPath("./Reports/Reports.html");
	}
	@AfterClass
	public static void setConfiguration()
	{
		Reporter.loadXMLConfig("./Config/extent-config.xml");
	}*/
	
	
}
