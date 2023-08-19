package com.kn.array;

import java.util.Scanner;

public class JaggedTwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Declaration and Creation
		System.out.println("enter the array size = ");
		int[][] arr=new int[sc.nextInt()][];
//		int[][] arr = new int[2][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		// Initialization
//		arr[0][0]=10;
//		arr[0][1]=20;
//		arr[0][2]=30;
//		arr[0][3]=40;
//		arr[1][0]=50;
//		arr[1][1]=60;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the "+(j+1)+" element value = ");
				arr[i][j]=sc.nextInt();
			}
		}

		// Traversing
//		System.out.println(arr[0][0]);
//		System.out.println(arr[0][1]);
//		System.out.println(arr[0][2]);
//		System.out.println(arr[0][3]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[1][1]);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("element of " + arr[i][j]);
			}
		}
		sc.close();
	}
}
