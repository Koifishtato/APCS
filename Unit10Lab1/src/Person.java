

/**
 * Class of people objects
 * @author Alexander Loeffler
 *@version 1.0
 */
public class Person {
	protected String name;
	protected String address;
	protected String email;
	protected String phone;
	protected Date bday;
	
	public Person(String name){
		this.name=name;
	}
	public Person(String name, String address, String email, String phone, Date bday){
		setName(name);
		setAddress(address);
		setEmail(email);
		setPhone(phone);
		setBday(bday);
	}
	public void setAddress(String addr){
		address=addr;
	}
	public String getAddress(){
		return address;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public void setPhone(String phone){
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setBday(Date bday){
		this.bday=bday;
	}
	public String getBday(){
		return bday.returnDate();
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	private void setBdayStr(String Bday){
		String [] split=Bday.split("/");
		bday.setDay(Integer.parseInt(split[1]));
		bday.setMonth(Integer.parseInt(split[0]));
		bday.setYear(Integer.parseInt(split[2]));
	}
}
