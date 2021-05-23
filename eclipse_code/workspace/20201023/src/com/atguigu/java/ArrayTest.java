package com.atguigu.java;
/*
 * 一、数组的概述
 * 1. 数组的理解：数组(Array)，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，
 * 并通过编号的方式对这些数据进行统一管理。  
 * 
 * 2. 数组的常见概念
 * > 数组名
 * > 下标(或索引、角标) 
 * > 元素
 * > 数组的长度
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		
		// 1. 一维数组的声明和初始化
		int num;	//声明
		num = 10;	//初始化
		int id = 1001;	//声明+初始化
		
		int[] ids;	//声明
		// 1.1 静态初始化
		ids = new int[]{1001, 1002, 1003, 1004};
		// 1.2 动态初始化
		String[] names = new String[5];
		
		// 错误的写法
//		int[] arr1 = new int[];
//		int[5] arr2 = new int[5];
//		int[] arr3 = new int[3]{1,2,3};
		
		// 2. 如何调用数组指定位置的元素： 通过角标的方式调用。
		// 0 ~ n-1
		names[0] = "王明";
		names[1] = "张明";
		names[2] = "李明";
		names[3] = "吴明";
		names[4] = "孙明";
//		names[5] = "周明";
		
		// 3. 如何获取数组的长度
		System.out.println(names.length);
		System.out.println(ids.length);
		
		// 4. 遍历
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}


		
	}
}
