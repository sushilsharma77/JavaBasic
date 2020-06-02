package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class CarAndPrice {

	public static void main(String[] args) throws IOException  {
		String path="C:\\Users\\sushi\\eclipse-workspace\\JavaBasics\\Configs\\carPrice.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(fis);
		pro.put("BMW", "40000");
		
		Set<Entry<Object, Object>>set=pro.entrySet();
		for(Entry<Object, Object>obj:set) {
			System.out.println(obj.getKey()+":"+obj.getValue());
		}
		FileOutputStream fos=new FileOutputStream(path);
		pro.store(fos, "new car is added");

	}

}
