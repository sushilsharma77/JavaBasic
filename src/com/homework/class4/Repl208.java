package com.homework.class4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//Create a method that will not be handling exception and throwing it at caller.
//In main method call method and handle the exception.

public class Repl208 {
	public void method() throws FileNotFoundException {
		String filePath = "";
		FileInputStream fis = new FileInputStream(filePath);
		System.out.println("java.io.FileNotFoundException:  (No such file or directory)");

	}

	public static void main(String[] args) {
		Repl208 obj = new Repl208();
		try {
			obj.method();
		} catch (FileNotFoundException e) {
			System.out.println("java.io.FileNotFoundException:  (No such file or directory)");
			// e.printStackTrace();
		}

	}

}
