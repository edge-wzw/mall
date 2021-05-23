package day10.test1;

/**
 * @author Edge
 * @create 2021$-08$-05$-21:08$
 * @description:
 */
public class Girl {
    private String name;
    private int age;

    public Girl(String name, int age) {
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

    public void marry(Boy boy){
        System.out.println("女孩想嫁给" + boy.getName());
    }

    public void compare(Girl girl){
        System.out.println(girl.getAge());
    }
}
