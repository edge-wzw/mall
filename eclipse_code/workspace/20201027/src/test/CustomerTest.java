package test;
/*
类中方法的声明和使用 
	方法：描述类应该具有的功能
	比如：Math类：sqrt()\random()\...
		Scanner类:nextXxx()
1.举例
	public void eat(){}
	public void sleep(int hour){}
	public String getName(){}
	public String getNation(String nation){}
	void 表示无返回值，其他代表对应返回值的类型

2. 方法的声明：
	权限修饰符 返回值类型 方法名(形参列表){
			方法体
	}
	
	注意：static\final\abstract 用来修饰方法
	
3. 说明
3.1 权限修饰符
Java规定的4中权限修饰符，private、public、缺省、protected  

3.2 返回值类型：有返回值	vs	无返回值
3.2.1 如果方法有返回值，则必须在方法声明时，指定返回值的类型，
	     	同时方法中需要使用return关键字来返回指定类型的变量或常量。“return 数据;”
	     如果方法没有返回值，则方法声明时需要使用void来表示。通常，没有返回值的方法中，
	  		就不使用return。但是，如果使用的话，只能使用 “return;” 表示结束此方法。
3.2.2 我们定义方法三该不该有返回值？ 
		1. 看题目要求；
		2. 根据经验, 具体问题具体分析；
		
3.3 方法名：属于标识符，遵循标识符的定义与规范
3.4 形参列表： 方法可以声明0个，1个或多个形参
	3.4.1 格式：
	数据类型1  形参1; 数据类型2 形参2;...
	
	3.4.2 定义方法什么时候需要形参？
		1. 看题目要求；
		2. 根据经验, 具体问题具体分析；
3.5 方法体
	方法功能的体现
	
4. return的使用：
	1.使用范围：使用在方法体中
	2. 作用：1.结束方法
		    2. 针对有返回值类型的方法，使用“return 数据”方法返回索要的数据
		    3. return关键字后面不可以声明执行语句。
 
5. 方法的使用：可以调用当前类的属性和方法
	特殊的：方法A中调用了方法A本身
	方法中不可以定义新的方法
	
	
		

 * 
 */
public class CustomerTest {

}

// 客户类
class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat(){
		System.out.println("客户吃饭");
	}
	
	public void sleep(int hour){
		System.out.println("休息" + hour + "小时");
	}
	
	public String getName(){
		return name;
	}
	
	public String getNation(String nation){
		String info = "国籍是" + nation;
		return info;
	}
	
	
	
}
