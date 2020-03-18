package com.syntax.class05;

public class Homework1 {

	public static void main(String[] args) {
		int quiz=50;
		int midTerm=40;
		int score=(quiz+midTerm);
		if(score>=90) {
			System.out.println("grade=A");
		} else if(score>=70 && score<90){
			System.out.println("grade=B");
		} else if(score>=50&&score<70) {
			System.out.println("grade=C");
		}else if(score<50) {
			System.out.println("grade=F");
		}
		

	}

}
