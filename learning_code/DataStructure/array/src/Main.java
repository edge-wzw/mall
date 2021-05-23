/**
 * @ClassName Main
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/16 22:04
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<>(5);
        System.out.println(arr.toString());
        for (int i = 0; i < 5; i++) {
            arr.addLast(i);
            System.out.println(arr.toString());
        }

        arr.add(1,100);
        System.out.println(arr.toString());

        arr.addFirst(-1);
        System.out.println(arr.toString());

        arr.addFirst(11);
        System.out.println(arr.toString());


        arr.remove(2);
        System.out.println(arr.toString());
        arr.removeFirst();
        System.out.println(arr.toString());
        arr.removeLast();
        System.out.println(arr.toString());
        arr.removeElement(100);
        System.out.println(arr.toString());

    }
}
