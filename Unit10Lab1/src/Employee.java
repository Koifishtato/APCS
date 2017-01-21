/**
 * Employee Class to define employee objects.
 * @author Alexander Loeffler
 * @version 1.0
 */
public class Employee extends Person{
	private double salary;
	private Date hire;
	public Employee(String name, String address, String email, String phone, Date bday, double salary, Date hire) {
		super(name, address, email, phone, bday);
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getHire() {
		return hire;
	}
	public void setHire(Date hire) {
		this.hire = hire;
	}
}
