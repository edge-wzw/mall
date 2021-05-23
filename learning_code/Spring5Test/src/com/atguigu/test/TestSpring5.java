package com.atguigu.test;

import com.atguigu.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestSpring5
 * @Description TODO
 * @Author 15588
 * @Date 2021/5/2 9:07
 * @Version 1.0
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

}
