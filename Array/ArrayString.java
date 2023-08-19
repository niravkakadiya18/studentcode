package com.kn.array;

import java.util.Scanner;

public class ArrayString {

	public static void main(String[] args) {
		//Array Declaration
				Scanner sc=new Scanner(System.in);
				String[] arr;
				
				//Array Creation
				System.out.println("Enter Array Size = ");
				arr=new String[sc.nextInt()];
				
				
				//Array Initialization
				for(int i=0;i<arr.length;i++) {
					System.out.println("enter integer data for element "+(i+1)+" = ");
					arr[i]=sc.next();
				}
				
				
				//Array Traversing
//				System.out.println("Forward");
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
				}
//				//Backword
//				System.out.println("Backword");
//				for(int i=arr.length-1;i>=0;i--) {
//					System.out.println(arr[i]);
//				}
				sc.close();
			}

	}
