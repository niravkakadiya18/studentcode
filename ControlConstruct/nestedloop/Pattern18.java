package com.kn.nestedloop;

public class Pattern18 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j > 6) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println("");

		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.print(j);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}
