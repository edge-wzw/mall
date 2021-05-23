package supertest;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account(1122, 20000, 0.045);
		
		acc.withdraw(30000);
		acc.withdraw(2500);
		acc.deposit(3000);
		double monthAcc = acc.getMonthlyInterest();
		System.out.println("月利率为：" + monthAcc);
	}
}
