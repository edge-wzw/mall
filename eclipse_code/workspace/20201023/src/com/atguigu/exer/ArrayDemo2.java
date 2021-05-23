package com.atguigu.exer;

public class ArrayDemo2 {
	public static void main(String[] args) {
		//1. 一维数组初始化的方式
		//静态初始化
		int[] arr1 = new int[]{1,2,3,4};
		System.out.println("arr1:" + arr1[0]);
		System.out.println("*************");
		//动态初始化
		int[] arr2 = new int[5];
		arr2[0] = 5;
		System.out.println("arr2:" + arr2[0]);
		System.out.println("*************");
	
		//2. 二维数组的初始化
		//静态初始化
		int[][] arr3 = new int[][]{{5,3,4}, {1,8,9}};
		System.out.println("arr3:" + arr3[0][1]);
		System.out.println("*************");
		
		//动态初始化
		int[][] arr4 = new int[5][2];
		arr4[0][1] = 4;
		System.out.println("arr4:" + arr4[0][1]);
		System.out.println("*************");
		
		int[][] arr5 = new int[5][];
		arr5[0] = new int[]{1,2};
		System.out.println("arr5:" + arr5[0][1]);
		System.out.println("*************");
		
		//遍历
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1:" + arr1[i]);
		}
		System.out.println("*************");
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.println("arr3:" + arr3[i][j]);
			}
		}
	
	}
}
