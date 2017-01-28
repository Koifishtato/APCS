/**
 * Class to contain Student Objects
 * @author Alexander Loeffler
 * @version 1.0
 */
public class Student extends Person {
	
	protected Class class_;
	public enum Class {
		FRESHMAN,
		SOPHMORE,
		JUNIOR,
		SENIOR
	}	
	
	public Student(String name, String address, String email, String phone, Date bday, Class class_ ) {
		super(name,address, email,phone,bday);
		this.class_=class_;
	}
	
	public void setClass(Class class_){
		this.class_=class_;
	}
	public Class getSClass(){
		return class_;
	}
	@Override
	public String toString(){
		return getName().concat(" is a Student");
	}
}
