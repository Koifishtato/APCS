
public class Contact {
	private String First;
	private String Last;
	private String Email;
	private String Phone;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFirst() {
		return First;
	}
	public void setFirst(String first) {
		First = first;
	}
	public String getPhone() {
		return Phone;
	}
	public void setLast(String last) {
		Last = last;
	}
	public String getLast() {
		return Last;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Contact(String [] input){
		this.First=input[0];
		this.Last=input[1];
		this.Email=input[2];
		this.Phone=input[3];
	}
	public String[] get(){
		return  new String[] {First,Last,Email,Phone};
	}
}
