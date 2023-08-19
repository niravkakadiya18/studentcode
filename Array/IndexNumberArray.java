package com.kn.array;

import java.util.Scanner;

public class IndexNumberArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//Declaration
		int[] arr;
		
		//Creation
		System.out.println("enter the array size = ");
		 arr = new int[scan.nextInt()];
	       
	        
	      //Initialization
	        for(int i=0;i<arr.length;i++) {
	        	System.out.println("enter the " + ( i + 1 ) + " element = ");
	        	arr[i]=scan.nextInt();
	        }
	}

}
