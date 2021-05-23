package day_test_ten;
/**
 * 
* @Description
* 创建Circle类，提供私有的radius属性，提供相应的get和set方法，提供求圆面积的方法。
* @author Edge Email:wuzhiwei_wzw@qq.com
* @version
* @date 2021年1月26日下午2:59:49
*
 */
public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea(){
		return 2 * Math.PI * getRadius() * getRadius();
	}
}
