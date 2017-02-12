
public class CheckingAccount extends Account {
	private double max;
	private double currentspent=0;
	public CheckingAccount(double bal, double rate, int number,double max){
		super(bal,rate,number);
		this.max=max;
	}
	public void deposit(double ammount){
		if((currentspent+ammount)>max){
			System.out.println("Too much money, exceeds limit!");
		}
		else{
			currentspent+=ammount;
			super.deposit(ammount);
		}
	}
}
