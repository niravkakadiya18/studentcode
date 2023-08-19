package com.kn.array;

import java.util.Scanner;

public class ThreeDArraySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Declaration and Creation
		int[][][] arr = new int[2][2][2];
		
		//Initialization
		System.out.println("enter the data :");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		//Traversing
		System.out.println("array element are as follow:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k]+" ");
				}
			}
		}
		
		sc.close();
	}

}
