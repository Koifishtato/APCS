
public class Staff extends Employee {
	private String title;
	public Staff(String name, String address, String email, String phone, Date bday, double salary, Date hire,String title) {
		super(name, address, email, phone, bday, salary, hire);
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString(){
		return getName().concat(" is a Staff Member");
	}

}
