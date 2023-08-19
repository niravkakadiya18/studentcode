package com.kn.forloop;

import java.util.Scanner;

public class FibonaciSer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		int num = sc.nextInt();
		printFibonacci(num);

		sc.close();
	}

	static void printFibonacci(int num) {
		int nextNumber = 0;
		int firstNumber = 0, secondNumber = 1;

		System.out.print(firstNumber + " " + secondNumber + " ");
		for (int i = 3; i <= num; i++) {
			nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber + " ");
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
	}

}
