package com.kn.array;

import java.util.Scanner;

public class AddiOf3DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array = ");
		int size1 = sc.nextInt();
		System.out.println("enter the size of row = ");
		int size2 = sc.nextInt();
		System.out.println("enter the size of column = ");
		int size3 = sc.nextInt();

		// Declaration and Creation
		int[][][] arr = new int[size1][size2][size3];
		int[][][] brr = new int[size1][size2][size3];
		int[][][] crr = new int[size1][size2][size3];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.println(
							"enter the " + (i + 1) + " Array, " + (j + 1) + " row, " + (k + 1) + " column number = ");
					arr[i][j][k] = sc.nextInt();
				}
			}
		}

		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				for (int k = 0; k < brr[i][j].length; k++) {
					System.out.println(
							"enter the " + (i + 1) + " Array, " + (j + 1) + " row, " + (k + 1) + " column number = ");
					brr[i][j][k] = sc.nextInt();
				}
			}
		}
		is3DArrayElementSum(arr, brr,crr);
		sc.close();
	}

	// Traversing
	static void is3DArrayElementSum(int[][][] arr, int[][][] brr,int[][][] crr) {
		System.out.println("sum of two arrays:");
		for (int i = 0; i < crr.length; i++) {
			for (int j = 0; j < crr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					crr[i][j][k] = arr[i][j][k] + brr[i][j][k];
					System.out.println(crr[i][j][k]);
				}
			}
		}
	}
}
