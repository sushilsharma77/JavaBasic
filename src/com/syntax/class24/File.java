package com.syntax.class24;
//Create a class File that will have the following behaviors: open, edit, close.

//Edit and close are implemented method while open is an abstract. Create 3 subclasses:
//JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour:
//Example: to open .java file we need notepad++ or sublime text,
//to open .doc file we need Microsoft word to be installed etc

  public abstract class File {
	public void edit() {
		System.out.println("File can be edited");
	}

	public void close() {
		System.out.println("File can be closed");
	}

	public abstract void open();

}
  class JavaFile extends File{
	  public void open() {
		  System.out.println("To open java file need have notepad++");
	  }
	  public void edit() {
			System.out.println("javaFile can be edited through eclipse");
		}
  }
  class WordFile extends File{
	  public void open() {
		  System.out.println("To open word file need have microsoft word");
	  }
  }
  class PDFFile extends File{
	  public void open() {
		  System.out.println("To open PDF file need have any pdf software");
	  }
  }
