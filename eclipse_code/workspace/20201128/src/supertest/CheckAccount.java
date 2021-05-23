package supertest;

public class CheckAccount extends Account {
	
	private double overdraft;//可以透支的余额
	
	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	//重写构造器
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	//重写提款方法
	public void withdraw(double amount){
		if (amount < getBalance()) {
			super.withdraw(amount);
			System.out.println("您的可透支余额为:" + this.overdraft);
		} else {
			if (amount < getBalance() + this.overdraft) {
				this.overdraft -= (amount - getBalance());
				super.withdraw(getBalance());
				System.out.println("您的可透支余额为:" + this.overdraft);
			} else {
				System.out.println("超出可透支限额!");
			}
		}
	};
}
