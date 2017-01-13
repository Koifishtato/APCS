/**
 * This stores a person's name
 * @author Alexander Loeffler
 *@version 1.0
 */
public class Name {
	private String First;
	private String Middle;
	private String Last;
	private String Title;
	public Name(String First, String Last){
		this.First=First;
		this.Last=Last;
	}
	public String getFirst(){
		return First;
	}
	public String getLast(){
		return Last;
	}
	public void setFirst(String first){
		this.First=first;
	}
	public void setLast(String last){
		this.Last=last;
	}
}
