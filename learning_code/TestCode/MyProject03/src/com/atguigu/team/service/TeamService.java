package com.atguigu.team.service;

import com.atguigu.team.domain.Architect;
import com.atguigu.team.domain.Designer;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.domain.Programmer;

/**
 * @ClassName TeamService
 * @Description 关于开发团队成员的管理：添加、删除等。
 * @Author 15588
 * @Date 2021/4/2 11:11
 * @Version 1.0
 */
public class TeamService {
    //counter为静态变量，用来为开发团队新增成员自动生成团队中的唯一ID，即memberId。（提示：应使用增1的方式）
    private static int counter = 1;
    //MAX_MEMBER：表示开发团队最大成员数
    private final int MAX_MEMBER = 5;
    //team数组：用来保存当前团队中的各成员对象
    private Programmer[] team = new Programmer[MAX_MEMBER];
    //total：记录团队成员的实际人数
    private int total = 0;

    /**
     * @return: com.atguigu.team.domain.Programmer[] 包含所有成员对象的数组，数组大小与成员人数一致
     * @author:
     * @date:
     * @description:返回当前团队的所有对象
     */
    public Programmer[] getTeam() {
        Programmer[] programmers = new Programmer[total];
        for (int i = 0; i < total; i++) {
            programmers[i] = team[i];
        }
        return programmers;
    }

    /**
     * @param e: 待添加成员的对象
     * @return: void 异常：添加失败， TeamException中包含了失败原因
     * @author:
     * @date:
     * @description:向团队中添加成员
     */
    public void addMember(Employee e) throws TeamException {
        //成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }

        Programmer p = (Programmer) e;
        //该员工已是某团队成员
        //该员正在休假，无法添加
        if ("BUSY".equalsIgnoreCase((p).getStatus().getNAME())) {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equalsIgnoreCase((p).getStatus().getNAME())) {
            throw new TeamException("该员正在休假，无法添加");
        }

        int numArchitect = 0, numDesigner = 0, numProgrammer = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numArchitect++;
            } else if (team[i] instanceof Designer) {
                numDesigner++;
            } else if (team[i] instanceof Programmer) {
                numProgrammer++;
            }
        }


        //团队中至多只能有一名架构师
        if (p instanceof Architect) {
            if (numArchitect >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            //团队中至多只能有两名设计师
            if (numDesigner >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            //团队中至多只能有三名程序员
            if (numProgrammer >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }


        team[total++] = p;
        p.setStatus(Status.BUSY);
        p.setMemberID(counter++);
    }

    /**
     * @param e:
     * @return: boolean
     * @author:
     * @date:
     * @description:判断员工是否已经在团队内
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param memberId:待删除成员的memberId
     * @return: void 异常：找不到指定memberId的员工，删除失败
     * @author:
     * @date:
     * @description:从团队中删除成员
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberID() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total) {
            throw new TeamException("找不到指定memberId的员工，删除失败");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }

        team[--total] = null;
    }

}
