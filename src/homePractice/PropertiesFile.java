package homePractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFile {
	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\sushi\\eclipse-workspace\\JavaBasics\\Configs\\greeting.properties";
		FileInputStream fis=new FileInputStream(filePath);
		Properties pro=new Properties();
		
		String nepal=pro.getProperty("Nepal");
		System.out.println(nepal);
		String usa=pro.getProperty("USA");
		System.out.println(usa);
		String mexico=pro.getProperty("Mexico");
		System.out.println(mexico);
		pro.load(fis);
		
		Set<Object>set=pro.keySet();
		for(Object obj:set) {
			System.out.println(obj);
		}
		pro.setProperty("Pakistan", "Salam maleyekum");
		FileOutputStream fos=new FileOutputStream(filePath);
		pro.store(fos, null);
		
	}

}
