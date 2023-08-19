package com.kn.elseifladder;

import java.util.Scanner;

public class IdentifierQuadrant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number for quadrant:-");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		if(num1>0 && num2>0)
		{
			System.out.println("first");
		}
		else if(num1<0 && num2>0)
		{
			System.out.println("second");
		}
		else if(num1<0 && num2<0)
		{
			System.out.println("third");
		}
		else if(num1>0 && num2<0)
		{
			System.out.println("fourth");
		}
		else
		{
			System.out.println("invalid input");
		}
		sc.close();
	}

}
