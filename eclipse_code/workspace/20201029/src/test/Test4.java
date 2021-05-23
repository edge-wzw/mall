package test;
/*
 * 
2.编写程序，定义三个重载方法并调用。方法名为mOL。 三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别
执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类的main ()方法中分别用参数区别调用三个方法。
3.定义三个重载方法max()，第一个方法求两个int值中的最大值，第二个方
法求两个double值中的最大值，第三个方法求三个double值中的最大值，
并分别调用三个方法。
 */

public class Test4 {
	public static void main(String[] args) {
		Test4_2 t4_2 = new Test4_2();
		t4_2.mOL(10);
		t4_2.mOL(10, 20);
		t4_2.mOL("字符串");
		
		Test4_3 t4_3 = new Test4_3();
		t4_3.max(10, 20);
		t4_3.max(50.55, 100.2);
		t4_3.max(20.5, 32.1, 10.99);
	}
}

class Test4_2{
	//平方和
	public void mOL(int x){
		System.out.println(x * x);
	}
	
	//相乘
	public void mOL(int x, int y){
		System.out.println(x * y);
	}
	
	//字符串
	public void mOL(String x){
		System.out.println(x);
	}
}


class Test4_3{
	//最大值
	public void max(int x, int y){
		int max = (x > y) ? x:y;
		System.out.println("最大值为：" + max);
	}
	
	//最大值
	public void max(double x, double y){
		double max = (x > y) ? x:y;
		System.out.println("最大值为：" + max);
	}
	
	//最大值
	public void max(double x, double y, double z){
		double max = (x > y) ? x:y;
		max = (max > z) ? max:z;
		System.out.println("最大值为：" + max);
	}
}
