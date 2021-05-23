package com.atguigu;

/**
 * @ClassName com.atguigu.User
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/2 9:04
 * @Version 1.0
 */
public class User {
    private String userId;
    private String username;
    private String ustatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    public void add(){
        System.out.println("add......");
    }
}
