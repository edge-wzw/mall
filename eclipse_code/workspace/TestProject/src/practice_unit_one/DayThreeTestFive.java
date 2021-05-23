package practice_unit_one;
/**
 * 
* @Description	交换两个变量值的代码的实现
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月23日下午10:10:32
*
 */
public class DayThreeTestFive {
	public static void main(String[] args){
		//数值型数据交换

		int a=10;
		int b=20;
		
		//方法一，利用中间变量
//		int med_num;
//		
//		System.out.println("交换前：a=" + a + "b=" + b);
//		med_num = b;
//		b=a;
//		a=med_num;
//		System.out.println("交换后：a=" + a + "b=" + b);
		
		//方法二
		System.out.println("交换前：a=" + a + "b=" + b);
		a += b;	//a=30,b=20
		b = (a-b);
		a -= b;
		System.out.println("交换后：a=" + a + "b=" + b);
	}
}
