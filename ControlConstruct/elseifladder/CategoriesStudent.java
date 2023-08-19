package com.kn.elseifladder;

import java.util.Scanner;

public class CategoriesStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter your marks:-");
		int marks=sc.nextInt();
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("A");
		}
		else if(marks>=80 && marks<=89)
		{
			System.out.println("B");
		}
		else if(marks>=70 && marks<=79)
		{
			System.out.println("C");
		}
		else if(marks>=60 && marks<=69)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		sc.close();
	}

}
