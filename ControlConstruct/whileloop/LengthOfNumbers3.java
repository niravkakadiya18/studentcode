package com.kn.whileloop;

import java.util.Scanner;

public class LengthOfNumbers3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:-");
		long num = sc.nextLong();
		
		int length=lengthofNumber(num);
		System.out.println("The length of the number " + num + " is: " + length);
		sc.close();
	}

static int lengthofNumber(long num) {
	int length = 0;
	while (num > 0) {
        length++;
        num /= 10;
    }

    return length;
	}

}
