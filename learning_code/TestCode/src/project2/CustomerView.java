package project2;

/**
 * @ClassName CustomerView
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/28 10:09
 * @Version 1.0
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    /**
     * @return: void
     * @author:
     * @date:
     * @description:用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法（如addNewCustomer），以完成客户信息处理
     */
    public void enterMainMenu() {
        boolean isFlag = true;

        while (isFlag) {
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("1 添 加 客 户");
            System.out.println("2 修 改 客 户");
            System.out.println("3 删 除 客 户");
            System.out.println("4 客 户 列 表");
            System.out.println("5 退       出");
            System.out.print("请选择(1-5)：");

            char selection = CMUtility.readMenuSelection();

            switch (selection) {
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
                    System.out.print("确认是否退出(Y/N)：");
                    char confirmSelection = CMUtility.readConfirmSelection();
                    if (confirmSelection == 'Y') {
                        isFlag = false;
                    }
                    break;
            }

        }

    }

    /**
     * @return: void
     * @author:
     * @date:
     * @description:添加客户
     */
    private void addNewCustomer() {
        System.out.print("姓名：");
        String name = CMUtility.readString(5);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(12);
        System.out.print("邮箱：");
        String email = CMUtility.readString(20);

        Customer cust = new Customer(name, gender, age, phone, email);
        boolean isAdd = customerList.addCustomer(cust);
        if (isAdd) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------添加失败---------------------");
        }

    }

    /**
     * @return: void
     * @author:
     * @date:
     * @description:修改客户
     */
    private void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        System.out.print("请选择待修改客户编号(-1退出)：");
        int modifyIdx = CMUtility.readInt();
        if (modifyIdx == -1) {
            return;
        }

        Customer customerListCustomer = customerList.getCustomer(modifyIdx - 1);
        if (customerListCustomer == null) {
            return;
        }

        System.out.println("姓名：(" + customerListCustomer.getName() + ")");
        String name = CMUtility.readString(5, customerListCustomer.getName());

        System.out.println("性别：(" + customerListCustomer.getGender() + ")");
        char gender = CMUtility.readChar(customerListCustomer.getGender());

        System.out.println("年龄：(" + customerListCustomer.getAge() + ")");
        int age = CMUtility.readInt(customerListCustomer.getAge());

        System.out.println("电话：(" + customerListCustomer.getPhone() + ")");
        String phone = CMUtility.readString(12, customerListCustomer.getPhone());

        System.out.println("邮箱：(" + customerListCustomer.getEmail() + ")");
        String email = CMUtility.readString(20, customerListCustomer.getEmail());

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean isModify = customerList.replaceCustomer(modifyIdx, customer);

        if (isModify) {
            System.out.println("---------------------修改完成---------------------");
        }else {
            System.out.println("---------------------修改失败---------------------");
        }


    }

    /**
     * @return: void
     * @author:
     * @date:
     * @description:删除客户
     */
    private void deleteCustomer() {
        System.out.println("---------------------删除客户---------------------");

        System.out.print("请选择待删除客户编号(-1退出)：");
        int deleteIdx = CMUtility.readInt();
        if (deleteIdx != -1) {
            Customer cust = customerList.getCustomer(deleteIdx - 1);
            if (cust != null) {
                System.out.println("确认是否删除(Y/N)：");
                char isDelete = CMUtility.readConfirmSelection();
                if (isDelete == 'Y') {
                    boolean isDeleteSuccess = customerList.deleteCustomer(deleteIdx - 1);
                    if (isDeleteSuccess) {
                        System.out.println("---------------------删除完成---------------------");
                    } else {
                        System.out.println("---------------------删除失败---------------------");
                    }
                }
            } else {
                System.out.println("---------------------没有找到用户---------------------");
            }
        }

    }

    /**
     * @return: void
     * @author:
     * @date:
     * @description:客户列表
     */
    private void listAllCustomers() {

        int customerListTotal = customerList.getTotal();
        System.out.println("---------------------------客户列表---------------------------");
        System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
        if (customerListTotal == 0) {
            System.out.println("没有客户记录");
        } else {
            Customer[] allCustomers = customerList.getAllCustomers();
            for (int i = 0; i < allCustomers.length; i++) {
                Customer cust = allCustomers[i];
                System.out.println((i + 1) + "\t" + cust.getName() + "\t" + cust.getGender() + "\t" + cust.getAge() + "\t" + cust.getPhone() + "\t" + cust.getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");

    }

    /**
     * @param args:
     * @return: void
     * @author:
     * @date:
     * @description:创建CustomerView实例，并调用 enterMainMenu()方法以执行程序。
     */
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
