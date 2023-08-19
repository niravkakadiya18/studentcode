package com.kn.forloop;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		printTable(num);

		sc.close();
	}

	static void printTable(int num) {
		for (int i = 1; i < 11; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}
