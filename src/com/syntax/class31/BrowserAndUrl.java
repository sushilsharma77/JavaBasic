package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserAndUrl {

	public static void main(String[] args) throws IOException {
		String filePath=System.getProperty("user.dir")+"\\Configs\\browserUrl";
		FileInputStream fis=new FileInputStream(filePath);
		Properties prop=new Properties();
		prop.load(fis);
		String str=prop.getProperty("Chrome");
		System.out.println(str);
		
		String str1=prop.getProperty("IE");
		System.out.println(str1);
		
		String str2=prop.getProperty("Firefox");
		System.out.println(str2);
		
		String str3=prop.getProperty("Opera");
		System.out.println(str3);
		
		prop.setProperty("Edge", "www.homefinder.com");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, "new property added");
		
		String str4=prop.getProperty("Edge");
		System.out.println(str4);
		
		

	}

}
