package com.homework2;

public class Test {
	static int noOfObjects = 0; 
	  
     
    { 
        noOfObjects += 1; 
    } 
  
    
    public Test() 
    { 
    } 
    public Test(int n) 
    { 
    } 
    public Test(String s) 
    { 
    } 
  
    public static void main(String args[]) 
    { 
        Test t1 = new Test(); 
        Test t2 = new Test(5); 
        Test t3 = new Test("GFG"); 
  
       
        System.out.println(Test.noOfObjects); 
    } 

}
