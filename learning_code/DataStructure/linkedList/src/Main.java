/**
 * @ClassName Main
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/18 16:51
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList.toString());
        }

        linkedList.add(2, 666);
        System.out.println(linkedList.toString());

        linkedList.remove(2);
        System.out.println(linkedList.toString());

    }
}
