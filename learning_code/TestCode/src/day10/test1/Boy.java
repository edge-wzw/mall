package day10.test1;

/**
 * @author Edge
 * @create 2021$-01$-05$-21:01$
 * @description:
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void marry(Girl girl){
        System.out.println("男孩想娶" + girl.getName());
    }

    public void shout(){
        System.out.println("shout");
    }

}
