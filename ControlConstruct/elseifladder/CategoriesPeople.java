package com.kn.elseifladder;

import java.util.Scanner;

public class CategoriesPeople {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.err.println("enter your age:-");
		int age=sc.nextInt();
		
		if(age>=0 && age<=12)
		{
			System.out.println("child");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("teen");
		}
		else if(age>=20 && age<=59)
		{
			System.out.println("adult");
		}
		else
		{
			System.out.println("senior");
		}
		sc.close();
	}

}
