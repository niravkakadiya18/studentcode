package com.kn.array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Declaration
		int[][] arr;
		
		//Creation
		System.out.println("enter the number of student = ");
		int size1=sc.nextInt();
		System.out.println("enter the number of subjects per student = ");
		int size2=sc.nextInt();
		arr=new int[size1][size2];
		
		//Initialization
		for(int i=0;i<size1;i++) {
			System.out.println("enter student "+(i+1)+ " data :");
			for(int j=0;j<size2;j++) {
				System.out.println("enter subject "+(j+1)+ " marks = ");
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("*************************************************");
		
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println("student "+(i+1)+ " Data : ");
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("subject "+(j+1)+ " marks = "+arr[i][j]);
			}
		}
		sc.close();
	}

}
