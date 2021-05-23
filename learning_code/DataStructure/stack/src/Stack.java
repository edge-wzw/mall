public interface Stack<E> {

    /**
     * @return: int
     * @author:
     * @date:
     * @description:获取元素数量
     */
    int getSize();

    /**
     * @return: boolean
     * @author:
     * @date:
     * @description:判断是否为空
     */
    boolean isEmpty();

    /**
     * @param e:
     * @return: void
     * @author:
     * @date:
     * @description:入栈
     */
    void push(E e);

    /**
     * @return: E
     * @author:
     * @date:
     * @description:出栈
     */
    E pop();

    /**
     * @return: E
     * @author:
     * @date:
     * @description:查看栈顶元素
     */
    E peek();

}
