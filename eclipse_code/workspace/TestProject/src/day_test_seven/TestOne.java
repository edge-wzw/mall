package day_test_seven;
/**
 * 
* @Description
1.使用冒泡排序，实现如下的数组从小到大排序。
int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
2.如何反转上面的数组。请代码实现
3.复制上述数组，得到一个新的数组
4.使用线性查找，从上述数组中查找22是否存在。存在，返回所在位置的索引。不存在，输出提示信息。
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月25日下午7:11:12
*
 */
public class TestOne {
	public static void main(String[] args) {
		int[] arr = new int[]{34,5,22,-98,6,-76,0,-3};
		
		System.out.println("排序前：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n**************");
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("排序后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n**************");
		
		//反转数组
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		System.out.println("反转后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n**************");
		
		//复制数组
		int [] arr1 = new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		System.out.println("复制的新数组arr1：");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + ", ");
		}
		System.out.println("\n**************");
		//查找数字22是否存在数组arr中
		int search_num = 22;
		boolean isFlag = true;
		int m;
		for (m=0; m < arr.length; m++) {
			if (arr[m] == search_num) {
				System.out.print("已找到，索引为:" + m);
				isFlag = false;
				break;
			}
		}
		if (isFlag) {
			System.out.println("未找到数字" + search_num);
		}
		if (m == arr.length) {
			System.out.println("未找到数字" + search_num);
		}
		
	}
}
