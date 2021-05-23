package day10.test2;

/**
 * @author Edge
 * @create 2021$-32$-05$-21:32$
 * @description:
 * 3.写一个测试程序。
 * （1） 创建一个 Customer ，名字叫 Jane Smith, 他有一个账号为 1000，余额为 2000 元，
 * 年利率为 1.23％ 的账户。
 * （2） 对 Jane Smith 操作。
 * 存入 100 元，再取出 960 元。再取出 2000 元。
 * 打印出 Jane Smith 的基本信息
 * 尚硅谷 Java 基础编程 宋红康
 * 成功存入 ：100.0
 * 成功取出：960.0
 * 余额不足，取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23％, balance is
 * 1140.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Jane", "Smith");
        Account account1 = new Account(100,2000, 0.0123);
        cust1.setAccount(account1);

        account1.deposit(100);
        account1.withdraw(960);
        account1.withdraw(2000);
        System.out.println("Customer [" + cust1.getFirstname() + "," + cust1.getLastname() +  "] has a account: id is " + account1.getId() +
                "," + "annualInterestRate is " + account1.getAnnualInterestRate() * 100 + "％, balance is " + account1.getBalance());

    }



}
