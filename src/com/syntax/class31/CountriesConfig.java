package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CountriesConfig {

	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\sushi\\eclipse-workspace\\JavaBasics\\Configs\\countries.properties";
		
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty("USA", "Washington DC");
		prop.remove("Afganistan");
		Object china=prop.get("China");
		System.out.println(china);
		
		
		FileOutputStream fos=new FileOutputStream(path);
		prop.store(fos, "Added new entry");
		
	}

}
