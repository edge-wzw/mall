package day_test_five;
/**
 * 
* @Description
* 从控制台输出如下结构：

******
*****
****	
***	
**	
*	

* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月25日下午3:59:28
*
 */
public class TestFive {
	public static void main(String[] args) {
		for (int i = 6; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
