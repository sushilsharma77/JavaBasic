package com.homework2;

public class Repl133 {
	
	public static String alphabetical(String str) {
	  str = str.toLowerCase();
			char[] ch = str.toCharArray();
			String alphabetical = "";
			alphabetical = alphabetical + ch[0];
			char c = ch[0];
			for (int i = 0; i < ch.length; i++) {
				if (c < ch[i]) {
					alphabetical += ch[i];
				}
				c = ch[0 + i];
			}
			return alphabetical;
		}

		
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(alphabetical("hello")); //"hlo"
			System.out.println(alphabetical("software")); 
			System.out.println(alphabetical("language"));
		}
}




