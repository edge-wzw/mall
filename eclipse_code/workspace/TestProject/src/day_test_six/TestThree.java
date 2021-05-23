package day_test_six;
/**
 * 
* @Description	
3.如何遍历如下的二维数组
int[] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月25日下午5:01:05
*
 */
public class TestThree {
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,2,3},{4,5},{6,7,8}};
		for(int i = 0; i< arr.length; i++){
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
