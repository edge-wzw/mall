package day08;

/**
 * @author Edge
 * @create 2021-02-23-15:15
 * @description 定义类 Student，包含三个属性：学号 number（nt），年级 state（int），成绩
 * score（int）.创建20个学生对象，学号为1到20，年级和成绩都由随机数确定
 * 问题一：打印出3年级（ state值为3）的学生信息。
 * 问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
 * 提示
 * 1）生成随机数： Math. random（），返回值类型 double；
 * 2）四舍五入取整： Math 。 round（ double d），返回值类型long.
 */
public class TestTwo {
    public static void main(String[] args) {
        Student1 [] s1 = new Student1[20];
        for (int i=0; i< s1.length;i++) {
            s1[i] = new Student1();
            s1[i].number = i+1;
            s1[i].state = (int)(Math.random()* (6 - 1 + 1) + 1 );
            s1[i].score = (int)(Math.random()*(100 - 0 + 1));
        }

        printStudentMessage(s1);
        System.out.println("*****************");
        searchClassMessage(s1, 3);
        System.out.println("*****************");
        sortStudentScore(s1);
        System.out.println("*****************");
        printStudentMessage(s1);
    }

    //遍历所有学生信息
    public static void printStudentMessage(Student1[] student) {
        for (int i = 0;i < student.length;i++) {
            student[i].studentMessage();
        }
    }

    //遍历得到对应年级的学生信息
    public static void searchClassMessage(Student1[] student, int state) {
        for (int i = 0;i < student.length;i++) {
            if (student[i].state == state) {
                student[i].studentMessage();
            }
        }
    }

    //冒泡排序学生信息
    public static void sortStudentScore(Student1[] student) {
        for (int i = 0;i < student.length - 1;i++) {
            for (int j = 0; j < student.length - 1 - i;j++) {
                if (student[j].score > student[j + 1].score) {
                    Student1 tempStu = student[j];
                    student[j] = student[j+1];
                    student[j+1] = tempStu;
                }
            }
        }
    }

}

class Student1 {
    int number;
    int state;
    int score;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void studentMessage(){
        System.out.println("学号：" + this.number + ", 年级：" + this.state + "， 成绩：" + this.score);
    }
}
