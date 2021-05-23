package com.example.six_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName HelloServlet2
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/20 16:34
 * @Version 1.0
 */
public class HelloServlet2 extends HttpServlet {
    /**
     * @param req: 
     * @param resp:  
     * @return:void
     * @author: 
     * @date:  
     * @description:doGet（）在get请求的时候调用
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
    }

    /**
     * @param req: 
     * @param resp:  
     * @return:void
     * @author: 
     * @date:  
     * @description:doPost（）在post请求的时候调用
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
    }
}
