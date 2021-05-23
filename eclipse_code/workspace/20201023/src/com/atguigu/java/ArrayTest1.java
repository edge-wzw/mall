package com.atguigu.java;

public class ArrayTest1 {
	public static void main(String[] args) {
		int [] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("*******");
		float [] arr1 = new float[4];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println("*******");
		short [] arr2 = new short[4];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}

		System.out.println("*******");
		char [] arr3 = new char[4];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println("***" + arr3[i] + "---");
		}
		if (arr3[0] == 0) {
			System.out.println("零");
		}
		
		System.out.println("*******");
		boolean [] arr4 = new boolean[4];
		for (int i = 0; i < arr4.length; i++) {
			System.out.println(arr4[i]);
		}
		
		System.out.println("*******");
		String[] arr5 = new String[5];
		System.out.println(arr5[0] == null);
		
	}
}
