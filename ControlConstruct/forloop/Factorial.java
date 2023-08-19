package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		int num = sc.nextInt();
		int num1=calculateFactorial(num);
		System.out.println(num1);
		
		sc.close();
	}
	
	static int calculateFactorial(int num) {
		int factorial = 1;
		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}
//		System.out.println("the factorial of given number " + num + " = "  + factorial);
		return factorial;
	}

}
