package p2.service;

import p2.bean.Customer;
/**
 * 
 * @author 15588
 *
 */
public class CustomerList {
	private Customer[] customers;	//记录保存客户对象的数组
	private int total;				//记录已保存客户对象的数量

	/**
	 * 用途：构造器，用来初始化customers数组
	 * @param totalCustomer：指定customers数组的最大空间
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	
	/**
	 * 
	* @Description 将参数customer添加到数组中最后一个客户对象记录之后
	* @author Edge
	* @date 2020年11月5日上午10:38:47
	* @param customer 指定要添加的客户对象 
	* @return 添加成功返回true；false表示数组已满，无法添加
	 */
	public boolean addCustomer(Customer customer) {
		if (total >= customers.length) {
			return false;
		}
		
		customers[total] = customer;
		total++;
		//customers[total++] = customer;
		return true;
		
	}
	
	
	/**
	 * 
	* @Description 用参数customer替换数组中由index指定的对象
	* @author Edge
	* @date 2020年11月5日上午10:47:49
	* @param index	 index指定所替换对象在数组中的位置，从0开始
	* @param cust  customer指定替换的新客户对象 
	* @return 替换成功返回true；false表示索引无效，无法替换
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total){
			return false;
		}
		
		customers[index] = cust;
		return true;
	}

	/**
	 * 
	* @Description 从数组中删除参数index指定索引位置的客户对象记录
	* @author Edge
	* @date 2020年11月5日上午10:54:03
	* @param index  index指定所删除对象在数组中的索引位置，从0开始
	* @return 删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index) {
		if (index < 0 || index >= total) {
			return false;
		}
		
		for (int i = index; i <= total; i++) {
			customers[index] = customers[i+1];
		}
		customers[total - 1] = null;
		total--;
		//customers[--total] = null;
		return true;
	}

	/**
	 * 
	* @Description 返回数组中记录的所有客户对象
	* @author Edge
	* @date 2020年11月5日上午10:54:41
	* @return Customer[] 数组中包含了当前所有客户对象，该数组长度与对象个数相同。
	 */
	public Customer[] getAllCustomers() {
		
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i];
		}
		return custs;
	}

	/**
	 * 
	* @Description 返回参数index指定索引位置的客户对象记录
	* @author Edge
	* @date 2020年11月5日上午10:55:24
	* @param index 指定所要获取的客户在数组中的索引位置，从0开始
	* @return 封装了客户信息的Customer对象
	 */
	public Customer getCustomer(int index) {
		if (index < 0 || index >= total) {
			return null;
		}
		
		return customers[index];
	}

	/**
	 * 
	* @Description 获取客户数量
	* @author Edge
	* @date 2020年11月5日上午11:09:30
	* @return
	 */
	public int getTotal() {
		return total;
	}

}
