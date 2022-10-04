package com.dataDriven;

public class FileReading {
	
	private static String filePath = "/src/main/resources/Env.properties";
	public static String url;
	public static String facebookUrl;
	public static String googleUrl;
	public static String Browser;
	
	static {
		PropertiesLaunching prop =  new PropertiesLaunching();
		String baseDirectory = System.getProperty("user.dir");
		url = prop.getValue(baseDirectory+filePath, "url");
		facebookUrl = prop.getValue(baseDirectory+filePath, "facebook_url");
		googleUrl = prop.getValue(baseDirectory+filePath, "google_url");
		Browser = prop.getValue(baseDirectory+filePath, "browserName");
	}
	
}
