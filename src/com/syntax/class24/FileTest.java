package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		File java=new JavaFile();
		java.open();
		java.edit();
		
		File word=new WordFile();
		word.open();
		
		File pdf=new PDFFile();
		pdf.open();
		

	}

}
