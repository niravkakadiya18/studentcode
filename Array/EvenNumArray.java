package com.kn.array;

import java.util.Scanner;

public class EvenNumArray {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		       //Declaration
		        System.out.print("Enter the size of the array: ");
		        int size = sc.nextInt();

		        //Creation
		        int[] arr = new int[size];

		        //Initialization
		        for (int i = 0; i < size; i++) {
		            System.out.print("Enter element " + (i + 1) + " = ");
		            arr[i] = sc.nextInt();
		        }

		        //Traversing
		        System.out.println("Even numbers in the array:");
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] % 2 == 0) {
		                System.out.print(arr[i] + " ");
		            }
		        }

		        sc.close();
		    }

	}

