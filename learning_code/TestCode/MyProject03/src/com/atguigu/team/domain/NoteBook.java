package com.atguigu.team.domain;

/**
 * @ClassName NoteBook
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:48
 * @Version 1.0
 */
public class NoteBook implements Equipment {
    private String model;       //model 表示机器的型号
    private double price;       //price 表示价格

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }


    @Override
    public String getDescription() {
        return getModel() + "(" + getPrice() + ")";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
