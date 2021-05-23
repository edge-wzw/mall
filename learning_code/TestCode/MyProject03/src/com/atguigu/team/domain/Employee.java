package com.atguigu.team.domain;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:39
 * @Version 1.0
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**

     * @return: java.lang.String 返回基本信息：ID、name、age、salary
     * @author:
     * @date:
     * @description:返回基本信息：ID、name、age、salary
     */
    public String getBaseDetail(){
        return getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    /**

     * @return: java.lang.String
     * @author:
     * @date:
     * @description:返回基本信息：ID、name、age、salary
     */
    @Override
    public String toString() {
        return getBaseDetail();
    }
}
