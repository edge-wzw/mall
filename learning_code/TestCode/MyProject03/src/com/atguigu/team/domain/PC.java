package com.atguigu.team.domain;

/**
 * @ClassName PC
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:43
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model;   //model 表示机器的型号
    private String display;     //display display 表示显示器名称

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return getModel() + "(" + getDisplay() + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }
}
