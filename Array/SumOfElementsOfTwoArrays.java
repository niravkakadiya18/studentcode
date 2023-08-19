package com.kn.array;

import java.util.Scanner;

public class SumOfElementsOfTwoArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Array Declaration and Creation
//		int[][] arr = new int[3][5];

//		//Array Initialization
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				
//				System.out.println("enter the "+(j+1)+ "element number = ");
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		isSumOfArray(arr);
//		sc.close();
//	}
//	// Array traversing sum of two array
//
//	static void isSumOfArray(int[][] arr) {
//		System.out.println("sum of two array----->");
//		for (int i = 0; i < 1; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i + 2][j] = arr[i + 1][j] + arr[i][j];
//				System.out.println(arr[i + 2][j]);
//
//			}

//		}

		int[] arr = new int[3];
		int[] brr = new int[3];
		int[] crr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the element of array " + (i + 1));
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < brr.length; i++) {
			System.out.println("enter the element of array " + (i + 1));
			brr[i] = sc.nextInt();
		}
		for (int i = 0; i < crr.length; i++) {
			System.out.println("enter the element of array " + (i + 1));
			crr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			crr[i]=arr[i]+brr[i];
			System.out.println(crr[i]);
		}
		
	}
}
