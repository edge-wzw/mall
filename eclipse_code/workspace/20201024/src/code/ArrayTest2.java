package code;
/*
 *  数组的复制、反转、查找(线性查找、二分法查找)
 */
public class ArrayTest2 {
	public static void main (String[] args){
		String[] arr = new String[]{"aa", "bb", "cc", "dd"};

		//打印输出
		System.out.println("arr:");
		for(int i=0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\n");
		
		//复制
		String[] arr1 = new String[arr.length];
		for(int i=0; i < arr.length; i++){
			arr1[i] = arr[i];
		}
		
		//打印输出
		System.out.println("arr1:");
		for(int i=0; i < arr1.length; i++){
			System.out.print(arr1[i] + "\t");
		}
		System.out.print("\n");
		
		//反转
		String[] arr2 = new String[arr.length];
		for(int i=0; i <= arr.length-1; i++){
			arr2[i] = arr[arr.length-1 - i];
		}

		//打印输出
		System.out.println("arr2:");
		for(int i=0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
		System.out.print("\n");
		
		// 查找
		// 1. 线性查找
		String s1 = "ee";
		boolean count1 = true;
		for(int i=0; i<arr.length; i++){
			if(s1.equals(arr[i])){
				count1 = false; 
				System.out.print("已找到,位置是" + i);
				break;
			}
		}
		if (count1) {
			System.out.println("未找到" + s1);
		}
		
		// 2. 二分法查找(前提有序)
		System.out.println("二分法");
		int[] arr3 = new int[]{1,10,20,37,53,88,96,105,113,151}; 
		int i2 = 5;
		boolean count2 = true;
		int start = 0;
		int end = arr3.length - 1;
		
		while(start <= end){
			int mid = (start + end) / 2;
			
			if(i2 == arr3[mid]){
				count2 = false;
				System.out.println("已找到，位置是：" + mid);
			}else if(i2 < arr3[mid]){
				end = mid - 1;
			}else if(i2 > arr3[mid]){
				start = mid + 1;
			}
		}
		
		if (count2) {
			System.out.println("未找到" + i2);
		}
		
		
		
	}
	
}
