package com.atguigu.team.domain;

/**
 * @ClassName Printer
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:49
 * @Version 1.0
 */
public class Printer implements Equipment {
    private String name;        //model 表示机器的型号
    private String type;        //type 表示机器的类型

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return getName() + "(" + getType() + ")";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
