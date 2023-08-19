package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		boolean flag = isPositiveNumber(num);
		if(flag)
		{
			System.out.println("the given number " +num+" is Positive");
		}
		else
		{
			System.out.println("the given number " +num+" is Nagetive");
		}
		sc.close();
	}

static boolean isPositiveNumber(int num) {
	if(num>0) {
		return true;
	}else {
	return false;
	}
}
}
