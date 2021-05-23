package project2;

/**
 * @ClassName CustomerList
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/28 10:09
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;    //用来保存客户对象的数组
    private int total = 0;             //记录已保存客户对象的数量

    /**
     * @param totalCustomer:指定customers数组的最大空间
     * @return: null
     * @author:
     * @date:
     * @description:构造器，用来初始化customers数组
     */
    public CustomerList(int totalCustomer) {
        this.customers = new Customer[totalCustomer];
    }

    /**
     * @param customer: customer指定要添加的客户对象
     * @return: boolean 添加成功返回true；false表示数组已满，无法添加
     * @author:
     * @date:
     * @description:将参数customer添加到数组中最后一个客户对象记录之后
     */
    public boolean addCustomer(Customer customer) {
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * @param index: 指定所替换对象在数组中的位置，从0开始
     * @param cust:  ָ指定替换的新客户对象
     * @return: boolean 替换成功返回true；false表示索引无效，无法替换
     * @author:
     * @date:
     * @description:用参数customer替换数组中由index指定的对象
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @param index:
     * @return: boolean 返回：删除成功返回true；false表示索引无效，无法删除
     * @author:
     * @date:
     * @description:从数组中删除参数index指定索引位置的客户对象记录
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total; i++) {
            customers[i] = customers[i + 1];
        }
        customers[total - 1] = null;
        total--;
        return true;
    }

    /**
     * @return: project2.Customer[] :Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
     * @author:
     * @date:
     * @description:返回数组中记录的所有客户对象
     */
    public Customer[] getAllCustomers() {
        Customer[] cust = new Customer[total];
        for (int i = 0; i < total; i++) {
            cust[i] = this.customers[i];
        }
        return cust;
    }

    /**
     * @param index: index指定所要获取的客户在数组中的索引位置，从0开始
     * @return: project2.Customer 封装了客户信息的Customer对象
     * @author:
     * @date:
     * @description:返回参数index指定索引位置的客户对象记录
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return this.total;
    }

}
