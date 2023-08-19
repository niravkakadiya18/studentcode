package com.kn.array;

public class ArrayDeclare {

	public static void main(String[] args) {
		//Declaration
		int[] arr;
		
		//Creation
		arr=new int[5];
		
		//Initialization
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		//Traversing
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
