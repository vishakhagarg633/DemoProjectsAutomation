package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {

		File src = new File("./Config/config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("not able to fin configuration file: " + e.getMessage());
		}
	}
	
	public String getData(String KeytoSearch) {
		return pro.getProperty(KeytoSearch);		
	}
	
	public String getBrowser() {
		return pro.getProperty("browsername");
	}

	public String getURL() {
		return pro.getProperty("URL");
	}
}
