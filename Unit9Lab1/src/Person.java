/**
 * This is a Person
 * @author Alexander Loeffler
 *@version 1.0
 */
public class Person {
	public Name name;
	public Date BDay;
	
	public Person(String Name, String BDay){
		this.name = new Name();
		SetSplitName(Name);
		this.BDay= new Date();
		setBdayStr(BDay);
	}
	private void SetSplitName(String Name){
		String [] splitname = Name.split(" ");
		if (splitname.length==2){
			name.setFirst(splitname[0]);
			name.setLast(splitname[1]);
		}
		if (splitname.length == 3){
			name.setFirst(splitname[0]);
			name.setMiddle(splitname[1]);
			name.setLast(splitname[2]);
		}
	}
	private void setBdayStr(String Bday){
		String [] split=Bday.split("/");
		BDay.setDay(Integer.parseInt(split[1]));
		BDay.setMonth(Integer.parseInt(split[0]));
		BDay.setYear(Integer.parseInt(split[2]));
	}
	public String getFirst(){
		return name.getFirst();
	}
	public String getLast(){
		return name.getLast();
	}
	public void setFirst(String first){
		name.setFirst(first);
	}
	public void setLast(String last){
		name.setLast(last);
	}
	public String getMiddle(){
		return name.getMiddle();
	}
	public void setMiddle(String middle){
		name.setMiddle(middle);
	}
	public String getBDay(){
		return BDay.returnDate();
	}
	public String getName(){
		return name.getFirst().concat(" ".concat(name.getLast()));
	}
}
