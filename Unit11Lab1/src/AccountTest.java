
public class AccountTest {
	public static void main(String [] args){
		SavingsAccount sacc = new SavingsAccount(0, 10, 133, 100);
		CheckingAccount cacc = new CheckingAccount(0, 0, 123, 100);
		cacc.deposit(50);
		cacc.withdraw(50);
		cacc.deposit(55);
		cacc.withdraw(10);
		sacc.deposit(50);
		sacc.withdraw(50);
		sacc.deposit(55);
		sacc.withdraw(10);
	}
}
