package com.kn.forloop;

import java.util.Scanner;

public class Gcd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr two number:-");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		int n=findGCD(num1,num2);
		System.out.println("Gcd value is:" +n);
		sc.close();
	}

static int findGCD(int num1, int num2) {
	int gcd=1;
	for(int i=1;i<=num1&&i<=num2;i++)
	{
		if(num1%i==0 && num2%i==0)
		{
			gcd=i;
		}
		
	}
		return gcd;
	}
}
