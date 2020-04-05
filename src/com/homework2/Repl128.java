package com.homework2;

public class Repl128 {
	public static int count_Vowels(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                count++;
            }
             
        }
        return count;
       
    }
	
	
	public static void main(String[] args){
		System.out.println(count_Vowels("obama")); //3
		System.out.println(count_Vowels("happy friday! i love weekends")); 
	}

}
