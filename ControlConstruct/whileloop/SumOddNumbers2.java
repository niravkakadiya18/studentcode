package com.kn.whileloop;

import java.util.Scanner;

public class SumOddNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		int num = sc.nextInt();

		int num1 = sumofOddNumbers(num);
		System.out.println("The sum of first " + num + " odd numbers is: " + num1);
		sc.close();
	}

	static int sumofOddNumbers(int num) {
		int sum = 0;
		int count = 1; 

		while (num > 0) {
			if (count % 2 > 0) {
				sum += count;
				num--;
			}
			count++;
		}

		return sum;
	}

}
