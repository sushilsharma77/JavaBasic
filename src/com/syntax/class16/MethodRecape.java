package com.syntax.class16;

public class MethodRecape {
	 //create a method that will accept array of integers and return max element from that array
		int getLargest(int[]array) {
			int largest=array[0];
			for(int i=1;i<array.length;i++) {
				if(array[i]>largest) {
					largest=array[i];
				}
			}
			return largest;
		}
		public static void main(String[] args) {
			MethodRecape obj=new MethodRecape();
			int[] arr= {10,50,480};
			System.out.println(obj.getLargest(arr));
		}
	}


