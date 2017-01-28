/**
 * Class to create Faculty Employee objects
 * @author Alexander Loeffler
 * @version 1.0
 */
public class Faculty extends Employee{

	enum rank{
		Instructor,
		AProfessor,
		Professor
	}
	private rank Rank;
	private OfficeHours Hours;
	public Faculty(String name, String address, String email, String phone, Date bday, double salary, Date hire,rank Rank,OfficeHours hours) {
		super(name, address, email, phone, bday, salary, hire);
		this.Rank=Rank;
		Hours=hours;
		
	}
	public rank getRank() {
		return Rank;
	}
	public void setRank(rank rank) {
		Rank = rank;
	}
	@Override
	public String toString(){
		return getName().concat(" is a Faculty Member");
	}
	
}
