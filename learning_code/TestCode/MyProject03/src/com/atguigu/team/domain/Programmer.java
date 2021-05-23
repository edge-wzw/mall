package com.atguigu.team.domain;

import com.atguigu.team.service.Status;

/**
 * @ClassName Programmer
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:54
 * @Version 1.0
 */
public class Programmer extends Employee {
    private int memberID;       //memberId 用来记录成员加入开发团队后在团队中的ID
    private Status status = Status.FREE;        //Status是项目service包下自定义的类，声明三个对象属性，分别表示成员的状态。
    private Equipment equipment;       //equipment 表示该成员领用的设备

    public Programmer() {
        super();
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * @return: java.lang.String 返回程序员基本信息：ID、name、age、salary、程序员、设备名称
     * @author:
     * @date:
     * @description:返回程序员基本信息：ID、name、age、salary、程序员、设备名称
     */
    @Override
    public String toString() {
        return getBaseDetail() + "\t程序员\t" + status + "\t\t\t" + equipment.getDescription();
    }

    //TID/ID	姓名	年龄	工资	职位	奖金	股票
    //
    //1/3	李彦宏	23	7000.0	程序员

    /**
     * @return: java.lang.String 返回Team基本信息：MemberID、ID、name、age、salary
     * @author:
     * @date:
     * @description:返回Team基本信息：MemberID、ID、name、age、salary
     */
    public String getTeamBaseDetail() {
        return getMemberID() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary();
    }

    /**
     * @return: java.lang.String 返回Team中程序员的基本信息：MemberID、ID、name、age、salary、程序员
     * @author:
     * @date:
     * @description:返回Team中程序员的基本信息：MemberID、ID、name、age、salary、程序员
     */
    public String getDetailsForTeam() {
        return getTeamBaseDetail() + "\t程序员";
    }
}
