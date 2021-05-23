package com.atguigu.team.domain;

/**
 * @ClassName Designer
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:59
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;       //bonus 表示奖金

    public Designer() {
        super();
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //7	柳传志	29	10800.0	设计师	FREE	5200.0		华硕(三星 17寸)

    /**
     * @return: java.lang.String 返回设计师基本信息：ID、name、age、salary、设计师、状态、奖金、设备
     * @author:
     * @date:
     * @description:返回设计师基本信息：ID、name、age、salary、设计师、状态、奖金、设备
     */
    @Override
    public String toString() {
        return getBaseDetail() + "\t设计师\t" + getStatus() + "\t" + getBonus() + "\t\t" + getEquipment().getDescription();
    }

    // 3/5	雷军	28	10000.0	设计师	5000.0

    /**
     * @return: java.lang.String 返回Team中的设计师基本信息：ID、name、age、salary、设计师、状态、奖金、设备
     * @author:
     * @date:
     * @description:返回Team中的设计师基本信息：ID、name、age、salary、设计师、状态、奖金、设备
     */
    @Override
    public String getDetailsForTeam() {
        return getTeamBaseDetail() + "\t设计师\t" + getBonus();
    }
}
