package day08;

/**
 * @author Edge
 * @create 2021-02-23-14:53
 * @description 编写教师类和学生类，并通过测试类创建对象进行测试
 */
public class TestOne {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Tom");
        t1.setAge(27);
        t1.setCourse("教书八年了");
        t1.printers();
    }
}

class Teacher {
    private String name;
    private int age;
    private int teacherAge;
    private String course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public void setTeacherAge(int teacherAge) {
        this.teacherAge = teacherAge;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void printers(){
        System.out.println(this.name + "今年" + this.age + "岁，" + this.course);
    }
}

class Student {
    private String name;
    private int age;
    private String major;
    private String interests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }
}