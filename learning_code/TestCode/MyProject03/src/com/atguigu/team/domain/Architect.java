package com.atguigu.team.domain;

/**
 * @ClassName Atchitect
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 21:00
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;      //stock 表示公司奖励的股票数量

    public Architect() {
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //8	杨元庆	30	19800.0	架构师	FREE	15000.0	2500	爱普生20K(针式
    @Override
    public String toString() {
        return getBaseDetail() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return getTeamBaseDetail() + "\t架构师\t" + getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }
}
