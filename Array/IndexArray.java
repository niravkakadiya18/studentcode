package com.kn.array;

import java.util.Scanner;

public class IndexArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Declaration
		int[] arr;

		// Creation
		System.out.print("Enter the size of the array: ");
		arr = new int[sc.nextInt()];

		// Initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the " + (i + 1) + " element = ");
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element you want to find: ");
		int ele = sc.nextInt();

		boolean flag = findNumberArray(arr, ele);
		if (flag) {
			System.out.println("Element " + ele + " is found in the array.");
		} else {
			System.out.println("Element " + ele + " is NOT found in the array.");
		}

		sc.close();
	}
	
//Traversing  
	static boolean findNumberArray(int[] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return true;
			}

		}
		return false;
	}
}
