package com.kn.nestedloop;

public class Pattern10 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; i <= j; j--) {
				System.out.print((char) (70 - i));
			}
			System.out.println();
		}
	}
}
