package day10.test2;

/**
 * @author Edge
 * @create 2021$-20$-05$-21:20$
 * @description:
 * 写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
 * 账号 id，余额 balance，年利率 annualInterestRate；包含的方法：访问器方法（getter 和 setter
 * 方法），取款方法 withdraw()，存款方法 deposit()。
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw (double amount){
        /*
         * @param amount: 取出的钱
         * @return: void
         * @author:
         * @date:
         * @description: 取钱
         */
        if (amount >= 0 && ((balance - amount) >= 0)) {
            this.balance -= amount;
            System.out.println("成功取出：" + amount);
        }else {
            System.out.println("余额不足，取款失败");
        }
    }

    public void deposit(double amount){
        /*
         * @param amount: 存入的钱
         * @return: void
         * @author:
         * @date:
         * @description: 存钱
         */
        if (amount >= 0) {
            System.out.println("成功存入：" + amount);
            this.balance += amount;
        }
    }

}
