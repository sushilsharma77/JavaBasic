package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperiesFile {

	public static void main(String[] args) throws IOException {
		// Write into existing file and add values
		String filePath="C:\\\\Users\\\\sushi\\\\eclipse-workspace\\\\JavaBasics\\\\Configs\\\\Examples.properties";
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop =new Properties();
		prop.load(fis);
		
		prop.setProperty("phoneNumber", "123456789");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "Added additional key");
		

	}

}
