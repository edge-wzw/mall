package com.atguigu.team.service;
import com.atguigu.team.domain.*;

/**
 * @ClassName NameListService
 * @Description 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * @Author 15588
 * @Date 2021/4/1 21:02
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            int employeeType = Integer.parseInt(Data.EMPLOYEES[i][0]);

            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            double bonus;
            int stock;

            switch (employeeType) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary, getEquipment(i));
                    break;
                case Data.DESIGNER:
                    employees[i] = new Designer(id, name, age, salary, getEquipment(i), Double.parseDouble(Data.EMPLOYEES[i][5]));
                    break;
                case Data.ARCHITECT:
                    employees[i] = new Architect(id, name, age, salary, getEquipment(i), Double.parseDouble(Data.EMPLOYEES[i][5]), Integer.parseInt(Data.EMPLOYEES[i][6]));
                    break;
            }
        }
    }

    /**
     * @param idx:
     * @return: com.atguigu.team.domain.Equipment
     * @author:
     * @date:
     * @description:获取指定员工的设备
     */
    private Equipment getEquipment(int idx) {
        int equipmentType = Integer.parseInt(Data.EQUIPMENTS[idx][0]);
        switch (equipmentType) {
            case Data.PC:
                PC pc = new PC(Data.EQUIPMENTS[idx][1], Data.EQUIPMENTS[idx][2]);
                return pc;
            case Data.NOTEBOOK:
                NoteBook noteBook = new NoteBook(Data.EQUIPMENTS[idx][1], Double.parseDouble(Data.EQUIPMENTS[idx][2]));
                return noteBook;
            case Data.PRINTER:
                Printer printer = new Printer(Data.EQUIPMENTS[idx][1], Data.EQUIPMENTS[idx][2]);
                return printer;
        }
        return null;
    }

    /**
     * @return: com.atguigu.team.domain.Employee[]
     * @author:
     * @date:
     * @description:获取当前所有员工。
     */
    public Employee[] getAllEmployees() {
        return employees;
    }


    /**
     * @param id:
     * @return: com.atguigu.team.domain.Employee
     * @author:
     * @date:
     * @description:获取指定ID的员工对象。
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }


}
