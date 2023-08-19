package com.kn.array;

import java.util.Scanner;

public class ArrayInteger {

	public static void main(String[] args) {
		//Array Declaration
		Scanner sc=new Scanner(System.in);
		int[] arr;
		
		//Array Creation
		System.out.println("Enter Array Size = ");
		arr=new int[sc.nextInt()];
		
		
		//Array Initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter integer data for element "+(i+1)+" = ");
			arr[i]=sc.nextInt();
		}
		
		
		//Array Traversing
		System.out.println("Forward");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//Backword
		System.out.println("Backword");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}
