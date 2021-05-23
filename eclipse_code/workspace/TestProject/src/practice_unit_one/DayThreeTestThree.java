package practice_unit_one;
/**
 * 
* @Description 定义三个int型变量并赋值，使用三元运算符或者if-else获取这三个数中的较大数的实现
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月23日下午9:45:57
*
 */
public class DayThreeTestThree {
	public static void main(String[] args){
		int i1=0;
		int i2=89;
		int i3=-88;
		

//		//if-else
//		int max_num;
//		if(i1>=i2){
//			max_num=i1;
//		}else{
//			max_num=i2;
//		}
//		
//		if(i3>=max_num){
//			System.out.println("三个数中最大的数字为：" + i3);
//		}else{
//			System.out.println("三个数中最大的数字为：" + max_num);
//		}
		
		//三元运算符
//		int max_num;
//		max_num = (i1>=i2)?i1:i2;
		System.out.println((i3>=((i1>=i2)?i1:i2)?i3:((i1>=i2)?i1:i2)));
	}
}
