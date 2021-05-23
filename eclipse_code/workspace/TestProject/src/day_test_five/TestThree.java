package day_test_five;

import java.util.Scanner;

/**
 * 
* @Description	
* 一个数如果恰好等于它的因子之和，这个数就称为"完数"。
* 例如6=1＋2＋3。编程 找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月25日下午2:30:15
*
 */
public class TestThree {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入所求完数的范围：");
		int rangeofnum = scan.nextInt();
		System.out.println(rangeofnum);
//		int rangeofnum = 1000;
		
		for (int i = 2; i <= rangeofnum; i++) {
			int sum_num=0;
			for (int j = 1; j <= i /2 + 1; j++) {
				if(i % j== 0){
					sum_num += j;
				}

			}
			if(sum_num==i){
				System.out.println(i + "是完数");
			}
			
		}
	}
}
