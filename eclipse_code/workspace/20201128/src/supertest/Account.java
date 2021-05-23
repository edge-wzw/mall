package supertest;

public class Account {
	private int id;	//账号
	private double balance;	//余额
	private double annualInterestRate;  //年利率
	
	//构造器
	public Account (int id, double balance, double annualInterestRate ){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	
	
	//set和get方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterest(){
		return this.annualInterestRate / 12;
	};
	
	//存款方法
	public void deposit (double amount){
		if (amount >= 0 ) {
			this.balance += amount;
			System.out.println("您账户的余额为：" + this.balance);
		}
	};
	
	//取款方法
	public void withdraw(double amount){
		if (this.balance - amount >= 0) {
			this.balance -= amount; 
			System.out.println("您账户的余额为：" + this.balance);
		}else {
			System.out.println("余额不足!");
			System.out.println("您账户的余额为：" + this.balance + "\n");
		}
	};
	
}
