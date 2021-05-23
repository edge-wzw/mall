package bean;

import org.junit.Test;

/**
 * 
 * @Description
 * @author Edge Email:1558829727@qq.com
 * @version
 * @date 2021年3月27日下午8:43:39
 */
public class Customer {
//	客户姓名
	private char gender;  
//	性别
	private String name;
//	 年龄
	private int age; 	
//	电话号码
	private String phone;
//	电子邮箱
	private String email;
	
	public Customer(char gender, String name, int age, String phone, String email) {
	super();
	this.gender = gender;
	this.name = name;
	this.age = age;
	this.phone = phone;
	this.email = email;
}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
