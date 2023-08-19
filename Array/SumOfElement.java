package com.kn.array;

import java.util.Scanner;

public class SumOfElement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Declaration
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		//Creation
		int[] arr = new int[size];

		//Initialization
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + " = ");
			arr[i] = scanner.nextInt();
		}

		//Sum of all elements
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of all elements: " + sum);
		
		scanner.close();
	}

}
