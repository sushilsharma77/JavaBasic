package com.syntex.class09;

public class MoreArrays {

	public static void main(String[] args) {
		// arrays are fixed in size
		String[] students = new String[3];
		students[0] = "Hassana";
		students[1] = "Faisal";
		students[2] = "Kemal";

		// students[3]="Aaron"-->during run time java will
		// say ArrayIndexOut.........
		System.out.println("<---------------------------------->");
		String[] inClassStudent = new String[5];
		inClassStudent[1] = "Hichem";
		inClassStudent[2] = "Tetteh";

		System.out.println(inClassStudent[0]);
		// in this case complier give you default value

	}

}
