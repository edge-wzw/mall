package com.example.six_servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @ClassName HelloServlet1
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/20 15:29
 * @Version 1.0
 */
public class HelloServlet1 implements Servlet {
    public HelloServlet1(){
        System.out.println("Servlet constructor");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service method");
    }
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }


    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Servlet destroy");
    }
}
