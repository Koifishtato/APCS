/**
 * Models a account.
 * @author Alexander Loeffler
 *
 */
public abstract class Account {
	private int number;
	private double balance;
	private double rate;
	
	
	public Account(double bal, double rate, int number){
		this.balance=bal;
		this.rate=rate;
		this.number=number;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
	public double getRate() {
		return rate;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public void deposit(double money){
		balance=balance+money;
	}
	public void withdraw(double money){
		balance=balance-money;
	}
}
