package test;
/*
 * 
练习7.1：请用Java写出递归求阶乘(n!)的算法
练习7.2：已知有一个数列：f(0) = 1,f(1) = 4,f(n+2)=2*f(n+1) + f(n),其中n是大于0
的整数，求f(10)的值。
练习7.3：已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
其中n是大于0的整数，求f(10)的值。
练习7.4：输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
1 1 2 3 5 8 13 21 34 55
规律：一个数等于前两个数之和
要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
 */

public class Test7 {
	public static void main(String[] args) {
		//7.1
		int x = tactorial(10);
		System.out.println(x);
		
		//7.2
		Test7_2 test7_2 = new Test7_2();
		int y = test7_2.f(10);
		System.out.println(y);
		
		//7.3
		Test7_3 test7_3 = new Test7_3();
		int z = test7_3.f(10);
		System.out.println(z);
		
		//7.4 斐波那契数列
		Fibonacci fb = new Fibonacci();
		int fn = fb.f(10);
		System.out.println(fn);
		fb.printfba(10);
		
	}
	
	//7.1
	public static int tactorial(int n){
		if(n == 1){
			return 1;
		}else{
			return n * tactorial(n - 1);
		}
	}
}

//7.2
class Test7_2{
	int f0 = 1;
	int f1 = 4;
	
	public int f(int n){
		if (n == 0) {
			return f0;
		} else if (n == 1) {
			return f1;
		} else{
			int fn = 2 * f(n -1) +  f(n-2);
			return fn;
		}
	}
}

//7.3
class Test7_3{
	int f20 = 1;
	int f21 = 4;
	
	public int f(int n){
		if (n == 20) {
			return f20;
		} else if (n == 21) {
			return f21;
		} else{
			int fn = f(n+2) - 2 * f(n +1) ;
			return fn;
		}
	}
}


//7.4
class Fibonacci{
	int f0 = 1;
	int f1 = 1;
	
	public int f(int n){
		if (n == 1 || n == 2) {
			return f0;
		} else{
			int fn = f(n - 2) + f(n - 1) ;
			return fn;
		}
	}
	
	public void printfba(int n){		
		for (int i = 0; i < n; i++) {
			System.out.print(f(i+1) + "\t");
		}
	}
}

