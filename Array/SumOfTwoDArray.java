package com.kn.array;

import java.util.Scanner;

public class SumOfTwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[2][5];
		int[][] brr = new int[2][5];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the number of " + ((j + 1)+(i*arr[i].length)) + "elements = ");
				arr[i][j] = sc.nextInt();
			}

		}
		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				System.out.println("enter the number of " + ((j + 1)+(i*brr[i].length)) + "elements = ");
				brr[i][j] = sc.nextInt();
			}

		}
		
		findTwoDArrayElementSum(arr,brr);
		sc.close();
	}

static void findTwoDArrayElementSum(int[][] arr, int[][] brr) {
		int[][] crr = new int[arr.length][arr[0].length];
		for(int i=0;i<crr.length;i++) {
			for(int j=0;j<crr[i].length;j++) {
				crr[i][j] = arr[i][j] + brr[i][j];
				System.out.println(crr[i][j]);
			}
		}
	}
}
