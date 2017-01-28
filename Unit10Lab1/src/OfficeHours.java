/**
 * Class to model office hours
 * @author a
 *
 */
public class OfficeHours {
	private int Start;
	private int End;
	private boolean days[];
	public OfficeHours(int Start, int End, boolean [] days){
		this.Start=Start;
		this.End=End;
		this.days=days;
	}
	public void setEnd(int end) {
		End = end;
	}
	public int getEnd() {
		return End;
	}
	public void setStart(int start) {
		Start = start;
	}
	public int getStart() {
		return Start;
	}
	public boolean[] getDays() {
		return days;
	}
	public void setDays(boolean[] days) {
		this.days = days;
	}
	
}
