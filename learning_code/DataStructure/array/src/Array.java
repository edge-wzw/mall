import java.util.Arrays;

/**
 * @ClassName Array
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/16 21:40
 * @Version 1.0
 */
public class Array<E> {
    private E [] data;
    private int size;

    /**
     * @param capacity: 容量
     * @return: null
     * @author:
     * @date:
     * @description:参数为capacity的构造器
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
    }

    /**
     * @return: null
     * @author:
     * @date:
     * @description:无参构造器,默认容量为10
     */
    public Array() {
        this(10);
    }

    /**
     * @return: int
     * @author:
     * @date:
     * @description:获取数组容量
     */
    public int getCapacity() {
        return data.length;
    }


    /**
     * @return: int
     * @author:
     * @date:
     * @description:获取数组中元素个数
     */
    public int getSize() {
        return size;
    }

    /**
     * @return: boolean
     * @author:
     * @date:
     * @description:判断数组是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @param idx: 索引
     * @param e:   待添加的元素
     * @return: void
     * @author:
     * @date:
     * @description:添加元素到指定索引
     */
    public void add(int idx, E e) {
        if (size == data.length){
            resize(data.length * 2);

        }
        if (idx < 0 || idx > size){throw new IllegalArgumentException("Add failed. Illegal index.");}

        for (int i = size - 1; i >= idx; i--) {
            data[i + 1] = data[i];
        }
        data[idx] = e;
        size++;

    }

    /**
     * @param e: 待添加的元素
     * @return: void
     * @author:
     * @date:
     * @description:添加元素到数组头部
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * @param e: 待添加的元素
     * @return: void
     * @author:
     * @date:
     * @description:添加元素到数组末尾
     */
    public void addLast(E e) {
        add(size, e);
    }



    /**
     * @param newCapacity:
     * @return: void
     * @author:
     * @date:
     * @description:动态拓展数组容量
     */
    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }


    /**
     * @return: java.lang.String
     * @author:
     * @date:
     * @description:输出字符串
     */
    @Override
    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append(String.format("Array: capacity is %d, size is %d", data.length, size));
        res.append(" [");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1){res.append(", ");}
        }
        res.append("]");
        return res.toString();
    }


    /**
     * @param idx: 索引
     * @return: E
     * @author:
     * @date:
     * @description:查找指定索引处的元素
     */
    public E get(int idx) {
        if (idx < 0 || idx >= size){throw new IllegalArgumentException("Get failed. Illegal index.");}
        return data[idx];
    }

    /**
     * @param idx: s索引
     * @param e:   元素
     * @return: void
     * @author:
     * @date:
     * @description:修改指定索引处的元素
     */
    public void set(int idx, E e) {
        if (idx < 0 || idx >= size){throw new IllegalArgumentException("Set failed. Illegal index.");}
        data[idx] = e;
    }

    /**
     * @param e: 待查询的元素
     * @return: boolean
     * @author:
     * @date:
     * @description:查找数组中是否包含元素e
     */
    public boolean contain(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])){return true;}
        }
        return false;
    }


    /**
     * @param e: 待查询的元素
     * @return: int
     * @author:
     * @date:
     * @description:查找指定元素的索引，如果不包含该元素，则返回-1
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(data[i])){return i;}
        }
        return -1;
    }

    /**
     * @param idx: 索引
     * @return: int
     * @author:
     * @date:
     * @description:删除指定索引的元素,并返回被删除的元素
     */
    public E remove(int idx) {
        if (idx < 0 || idx >= size){throw new IllegalArgumentException("Remove failed. Illegal index.");}
        E delElement = data[idx];
        for (int i = idx + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;

        if (size == data.length / 4 && data.length / 2 != 0){resize(data.length / 2);}

        return delElement;
    }

    /**
     * @return: int
     * @author:
     * @date:
     * @description:删除头部元素
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * @return: int
     * @author:
     * @date:
     * @description:删除尾部元素
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * @param e:
     * @return: void
     * @author:
     * @date:
     * @description:删除指定元素
     */
    public void removeElement(E e){
        int idx = find(e);
        if (idx != -1){
            E delElement = remove(idx);
        }
    }


}
