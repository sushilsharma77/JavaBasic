package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Task {

	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\sushi\\eclipse-workspace\\JavaBasics\\Configs\\File2.properties";
		
		FileInputStream fileInput=new FileInputStream(filePath);
		Properties prop =new Properties();
		prop.load(fileInput);
		
		String Browser=prop.getProperty("Browser");
		System.out.println(Browser);
		
		String url=prop.getProperty("url");
		System.out.println(url);
		
		String password=prop.getProperty("password");
		System.out.println(password);
		
		String userName=prop.getProperty("username");
		System.out.println(userName);
		
		


	}

}
