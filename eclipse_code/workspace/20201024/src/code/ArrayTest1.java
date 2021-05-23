package code;
/*
 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
然后求出所有元素的最大值，最小值，和值，平均值，并输出出来。
要求：所有随机数都是两位数。
提示；
[0,1) * 90 [0,90) + 10  [10,100) [10,99]
(int)(Math.random() * 90 + 10)
 */
public class ArrayTest1 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		
		// 赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 90 + 10);
		}
		
		//遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.print("\n");
		
		// 求最大值，最小值，和值，平均值
		int min = arr[0];
		int max = arr[0];
		int sum = 0;
		float mean = 0.0f;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			//最大值
			if (arr[i] >= max) {
				max = arr[i];
			}
			
			//最小值
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		
		mean = sum / arr.length;
		
		System.out.println("最小值" + min);
		System.out.println("最大值" + max);
		System.out.println("平均值" + mean);
		System.out.println("和值" + sum);
	}
}
