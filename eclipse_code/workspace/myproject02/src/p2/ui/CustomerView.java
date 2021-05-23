package p2.ui;

import p2.bean.Customer;
import p2.service.CustomerList;
import p2.utilty.CMUtility;

/**
 * 
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author Edge Email:1558829727@qq.com
 * @version
 * @date 2020年11月5日上午11:13:17
 */
public class CustomerView {
	// 创建最大包含10个客户对象的CustomerList 对象，供以下各成员方法使用。
	private CustomerList customers = new CustomerList(10);
	
	public CustomerView(){
		Customer customer = new Customer("王明", '男', 18, "1322554545", "wm@qq.com");
		customers.addCustomer(customer);
	}
	
	/**
	 * 
	 * @Description 显示主菜单，响应用户输入，
	 *              根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理。
	 * @author Edge
	 * @date 2020年11月5日上午11:13:48
	 */
	public void enterMainMenu() {

		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n---------------客户信息管理软件---------------");
			System.out.println("				1添加客户");
			System.out.println("				2修改客户");
			System.out.println("				3删除客户");
			System.out.println("				4客户列表");
			System.out.println("				5退出\n");
			System.out.print("				请选择(1-5):");

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
				System.out.println("确认是否退出(Y/N)：");
				char isExit = CMUtility.readConfirmSelection();
				if (isExit == 'Y') {
					isFlag = false;
				}
//				System.out.println("退出");
//				isFlag = false;
//				break;
			}
		}

	}

	
	/**
	 * 
	 * @Description 添加客户
	 * @author Edge
	 * @date 2020年11月5日上午11:14:14
	 */
	private void addNewCustomer() {
		System.out.println("---------------------添加客户---------------------");
		System.out.print("请输入姓名");
		String name = CMUtility.readString(10);
		System.out.print("请输入性别");
		char gender = CMUtility.readChar();
		System.out.print("请输入年龄");
		int age = CMUtility.readInt();
		System.out.print("请输入电话");
		String phone = CMUtility.readString(15);
		System.out.print("请输入邮箱");
		String email = CMUtility.readString(15);
		
		Customer cust = new Customer(name, gender, age, phone, email);
		boolean isFlag = customers.addCustomer(cust);
		if (isFlag) {
			System.out.println("---------------------添加完成---------------------");
		} else {
			System.out.println("---------------------添加失败---------------------");
		}
		
	}

	/**
	 * 
	 * @Description 修改客户
	 * @author Edge
	 * @date 2020年11月5日上午11:14:22
	 */
	private void modifyCustomer() {
		System.out.println("---------------------修改客户---------------------");
		
		int index = 0;
		Customer cust = null;
		for(;;){
			System.out.print("请选择待修改客户编号(-1退出)：");
			index = CMUtility.readInt();
			if (index == -1) {
				return;
			}
			
			cust = customers.getCustomer(index -1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else {
				break;
			}	
		}
		
		
		System.out.print("姓名(" + cust.getName() + "):");
		String name = CMUtility.readString(10, cust.getName());
		System.out.print("性别(" + cust.getGender() + "):");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.print("年龄(" + cust.getAge() + "):");
		int age = CMUtility.readInt(cust.getAge());
		System.out.print("电话(" + cust.getPhone() + "):");
		String phone = CMUtility.readString(15, cust.getPhone());
		System.out.print("邮箱(" + cust.getEmail() + "):");
		String email = CMUtility.readString(15, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		boolean isReplace =  customers.replaceCustomer(index - 1, newCust);
		if (isReplace) {
			System.out.println("---------------------修改完成---------------------");
		} else {
			System.out.println("---------------------修改失败---------------------");
		}
		
	}

	/**
	 * 
	 * @Description 删除客户
	 * @author Edge
	 * @date 2020年11月5日上午11:14:26
	 */
	private void deleteCustomer() {
		System.out.println("---------------------删除客户---------------------");
		
		int index = 0;
		Customer cust = null;
		for(;;){
			System.out.print("请选择待删除客户编号(-1退出)：");
			index = CMUtility.readInt();
			if (index == -1) {
				return;
			}
			
			cust = customers.getCustomer(index -1);
			if (cust == null) {
				System.out.println("无法找到指定客户！");
			} else {
				break;
			}	
		}
		
		System.out.println("是否确认删除(Y/N):");
		char isDeleat = CMUtility.readConfirmSelection();
		if (isDeleat == 'N') {
			return;
		}
		
		boolean flag = customers.deleteCustomer(index - 1);
		if (flag) {
			System.out.println("---------------------删除完成---------------------");
		} else {
			System.out.println("---------------------删除失败---------------------");
		}
	}

	
	/**
	 * 
	 * @Description 显示客户列表
	 * @author Edge
	 * @date 2020年11月5日上午11:14:32
	 */
	private void listAllCustomers() {
		System.out.println("---------------客户信息管理软件---------------");
		
		int total = customers.getTotal();
		if (total == 0) {
			System.out.println("没有客户信息");
		}else{
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = customers.getAllCustomers();
			for (int i = 0; i < custs.length; i++) {
				Customer cust = custs[i];
				System.out.print((i + 1) + "\t" + cust.getName() 
				+ "\t" + cust.getGender() + "\t" + cust.getAge() 
				+ "\t" + cust.getPhone() + "\t" + cust.getEmail() + "\n");
			}
			
		}
		
		System.out.println("---------------客户列表完成---------------");
	}

	/**
	 * 
	 * @Description
	 * @author Edge
	 * @date 2020年11月5日上午11:14:38
	 * @param args
	 */
	public static void main(String[] args) {
		CustomerView view = new CustomerView();
		view.enterMainMenu();
	}

}
