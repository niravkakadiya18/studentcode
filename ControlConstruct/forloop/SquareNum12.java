package com.kn.forloop;

import java.util.Scanner;

public class SquareNum12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:-");
		int num=sc.nextInt();
		
		int num1=isSquareNumber(num);
		System.out.println(num1);
		sc.close();
	}
	
	static int isSquareNumber(int num) {
		int sum=0;
		for(int i=1;num>=i;i++)
		{
			sum +=(i*i);
		}
		return sum;
	}

}
