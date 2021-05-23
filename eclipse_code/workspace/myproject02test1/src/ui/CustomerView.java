package ui;

import service.CustomerList;
import util.CMUtility;

/**
 * 
 * @Description
 * @author Edge Email:1558829727@qq.com
 * @version
 * @date 2021年3月27日下午8:43:34
 */
public class CustomerView {
	private CustomerList customerList = new CustomerList(10);

	public void enterMainMenu(){
		boolean isFlag = true;
		while(isFlag){
			System.out.println("-----------------客户信息管理软件-----------------");
			System.out.println("                                     1 添 加 客 户");
			System.out.println("                                     2 修 改 客 户");
			System.out.println("                                     3 删 除 客 户");
			System.out.println("                                     4 客 户 列 表");
			System.out.println("                                     5 退           出");
			System.out.println("                                     请选择（1-5）：");
			
			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				isFlag = false;
				break;
			}
		}
		

        
        
        
        
        

	}; 
	
	/**
	 * 
	* @Description 
	* @author Edge
	* @date 2021年3月27日下午9:33:24
	 */
	private void addNewCustomer(){
		System.out.println("添 加 客 户");
	}; 
	
	/**
	 * 
	* @Description 
	* @author Edge
	* @date 2021年3月27日下午9:33:28
	 */
	private void modifyCustomer(){
		System.out.println("修 改 客 户");
	};
	
	/**
	 * 
	* @Description 
	* @author Edge
	* @date 2021年3月27日下午9:33:33
	 */
	private void deleteCustomer(){
		System.out.println("删 除 客 户");
	};
	
	/**
	 * 
	* @Description 
	* @author Edge
	* @date 2021年3月27日下午9:33:38
	 */
	private void listAllCustomers(){
		System.out.println("客 户 列 表");
	};
	
	/**
	 * 
	* @Description 
	* @author Edge
	* @date 2021年3月27日下午9:33:43
	* @param args
	 */
	public static void main(String[] args){
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	};



}
