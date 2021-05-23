package com.atguigu.java;
/*
 * 二维数组的使用
 */
public class ArrayTest2 {
	public static void main(String[] args) {
	//1. 一维数组的声明和初始化
	int[] arr = new int[]{1,2,3};
	//二维数组
	//静态初始化
	int[][] arr1 = new int[][]{{1,2,3}, {7,8}, {4,3,2}};
	//动态初始化1
	String[][] arr2 = new String[3][2];
	//动态初始化1
	String[][] arr3 = new String[3][];
	
	//错误
//	String[][] arr4 = new String[][4];
//	String[4][3] arr5 = new String[][];
	
	//正确
	int[] arr8 = {1,2,3,4,5}; //类型推断,同一行时可以，换行时不行
	int[] arr6[] = new int[][]{{1,2,3}, {7,8}, {4,3,2}};
	int[] arr7[] = {{1,2,3}, {7,8}, {4,3,2}};
	
	//2. 调用数组指定位置的元素
	System.out.println(arr7[0][1]);	//2
	System.out.println(arr2[1][1]);	//null
	
		// System.out.println(arr3[1][0]); //java.lang.NullPointerException

	arr3[1] = new String[4];
	System.out.println(arr3[1][0]);	//null
	
	//3. 获取数组的长度
	System.out.println(arr6.length);	//3
	
	//4. 遍历
	for (int i = 0; i < arr7.length; i++) {
		for (int j = 0; j < arr7[i].length; j++) {
			System.out.print(arr7[i][j] + " ");
		}
		System.out.println();
	}
	
	//5. 数组的默认初始化值，规定：二维数组分为外层数组的元素、内层数组的元素
	int[][] arr9 = new int[3][4];
	System.out.println(arr9);		//[[I@15db9742 	维数类型@地址值
	System.out.println(arr9[0]);	//[I@15db9742
	System.out.println(arr9[0][0]);		//0
	
	System.out.println("********");	
	int[][] arr10 = new int[3][];
	System.out.println(arr10);		//[[I@15db9742 	维数类型@地址值
	System.out.println(arr10[0]);	//null
//	System.out.println(arr10[0][0]);	//java.lang.NullPointerException
	
	//6. 内存解析
	
	
	
	}
}
