package com.atguigu.team.service;

/**
 * @ClassName Status
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/1 20:57
 * @Version 1.0
 */
public class Status {
    private final String NAME;
    private Status(String name) {
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }
}

