package com.syntax.class31;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		// to read the file
		//have file
		String filePath="C:\\Users\\sushi\\eclipse-workspace\\JavaBasics\\Configs\\Examples.properties";
		
		//bring object of FileInputStream
		
		 FileInputStream fileInput=new FileInputStream(filePath);
		 
		 //to handle data from property file we need property class
		 
		Properties prop =new Properties();
		prop.load(fileInput);
		
		String name=prop.getProperty("name");
		System.out.println(name);
		
		String city=prop.getProperty("city");
		System.out.println(city);
		
		String country=prop.getProperty("country");
		System.out.println(country);
		
		Set<Object>keys=prop.keySet();
		for(Object key:keys) {
			System.out.println(key);
		}
		
	 }

}
