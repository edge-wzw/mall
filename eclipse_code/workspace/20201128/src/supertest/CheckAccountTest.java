package supertest;

public class CheckAccountTest {
	public static void main(String[] args){
		CheckAccount acc = new CheckAccount(1122, 20000, 0.045, 5000);
		
		acc.withdraw(5000);
		acc.withdraw(18000);
		acc.withdraw(3000);
	
	}
}
