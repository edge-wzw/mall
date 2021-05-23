package day_test_four;
/**
 * 
* @Description	使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出。
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月24日下午8:31:16
*
 */
public class TestFive {
	public static void main(String[] args) {
		int sum_num = 0;
		for(int i=0;i<100;i++){
			if(i % 2 !=0){
				System.out.print(i + "\t");
				sum_num += i;
			}
		}
		System.out.println("\n100以内所有奇数的和为：" + sum_num);
	}
}
