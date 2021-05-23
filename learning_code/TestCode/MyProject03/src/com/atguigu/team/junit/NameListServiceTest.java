package com.atguigu.team.junit;

import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import com.atguigu.team.service.TeamException;
import org.junit.Test;

/**
 * @ClassName NameListServiceTest
 * @Description
 * @Author 15588
 * @Date 2021/4/2 11:04
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for(int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        try {
            Employee employee = service.getEmployee(10);
            System.out.println(employee);
        } catch (TeamException e) {
            e.printStackTrace();
        }
    }
}
