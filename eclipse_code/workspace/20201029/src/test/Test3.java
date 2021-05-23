package test;

public class Test3 {
	public static void main(String args[]){
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "Tom";
		p1.sex = 1;
		
		p1.study();
		p1.showAge();
		p1.addAge(2);
		p1.showAge();
		
		Person p2 = new Person();
		p2.showAge();
		
		Cricle c1 = new Cricle();
		c1.radius = 2;
		double s = c1.getS();
		System.out.println("半径" + c1.radius + "的圆面积为：" + s);
		
		
		int s1 = method(10, 20);
		System.out.println("面积为：" + s1);
		
		MyDate m1 = new MyDate();
		m1.year = 1996;
		m1.month = 11;
		m1.day = 27;
		m1.printMyDate();
		
	}
	
	public static int method(int m, int n){
		for(int i = 0;i < m; i++){
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int s = m * n;
		return s;
	}
}

class Person{
	String name;
	int age;
	int sex;
	
	public void study(){
		System.out.println("studying");
	}
	
	public void showAge(){
		System.out.println("年龄为：" + age);
	}
	
	public int addAge(int i){
		age += i;
		return age;
	}
}



class Cricle{
	double radius;
	
	public double getS(){
		double s = Math.PI * radius * radius;
		return s;
	}
	
}

class MyDate{
	int year;
	int month;
	int day;
	
	public void printMyDate(){
		System.out.println("出生日期为：" + year + "年" + month + "月" + day + "日");
	}
	
}



