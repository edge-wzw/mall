package service;

import bean.Customer;

/**
 * 
 * @Description
 * @author Edge Email:1558829727@qq.com
 * @version
 * @date 2021年3月27日下午8:43:43
 */
public class CustomerList {
//	用来保存客户对象的数组
	private Customer[] customers;
//	记录已保存客户对象的数量
	private int total = 0;                 

	/**
	 * 用来初始化数组的长度
	 * @param totalCustomer:指定数组的长度
	 */
	public CustomerList(int totalCustomer){
		total = totalCustomer;
	};
	
	/**
	 * 
	* @Description 添加客户
	* @author Edge
	* @date 2021年3月27日下午9:07:14
	* @param customer
	* @return true:添加成功；false:添加失败
	 */
	public boolean addCustomer(Customer customer){
		if(customers.length - 1 == total){
			System.out.print("数组已满，无法添加！");
			return false;
		}
		customers[total++] = customer;
		return true;
	}; 
	
	/**
	 * 
	* @Description 修改指定位置的客户信息
	* @author Edge
	* @date 2021年3月27日下午9:07:36
	* @param index 被替换的索引
	* @param cust 替换后的值
	* @return true:修改成功；false:修改失败
	 */
	public boolean replaceCustomer(int index, Customer cust){
		if(index < 0 || index >= total){
			System.out.println("索引无效");
			return false;
		}
		customers[index] = cust;
		return true;
	};
	
	/**
	 * 
	* @Description 从数组中删除参数index指定索引位置的客户对象记录
	* @author Edge
	* @date 2021年3月27日下午9:10:09
	* @param index 指定所删除对象在数组中的索引位置，从0开始
	* @return	删除成功返回true；false表示索引无效，无法删除
	 */
	public boolean deleteCustomer(int index){
		if(index < 0 || index >= total){
			return false;
		}

		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i+1];
		}
		customers[--total] = null;
		return true;
	};
	
	/**
	 * 
	* @Description 
	* @author Edge
	* @date 2021年3月27日下午9:25:44
	* @return
	 */
	public Customer[] getAllCustomers(){
		Customer [] cust = new Customer [total];
		for (int i = 0; i < total - 1; i++) {
			cust[i] = customers[i];
		}
		return cust;
	};
	
	
	
	public Customer getCustomer(int index){
		if(index < 0 || index >= total){
			return null;
		}
		return customers[index];
		
	};
	public int getTotal(){
		return total;
	};
}
