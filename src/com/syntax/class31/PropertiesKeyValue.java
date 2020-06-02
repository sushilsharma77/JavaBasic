package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesKeyValue {

	public static void main(String[] args) throws IOException {

		String path = System.getProperty("user.dir") + "\\Configs\\greeting.properties";
		FileInputStream fis = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(fis);
		String s = pro.getProperty("Nepal");
		pro.setProperty("Japan", "Konnichiwa");
		System.out.println(s);

		Set<Entry<Object, Object>> obj = pro.entrySet();
		for (Entry<Object, Object> set : obj) {
			Object key = set.getKey();
			Object value = set.getValue();
			System.out.println(key + "::" + value);

		}

		System.out.println();
		FileOutputStream fos = new FileOutputStream(path);
		pro.store(fos, "Japan has added");

	}

}
