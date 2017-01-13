/**
 * Date exercise to test the date class
 * @author Alexander Loeffler
 *@version 1.0
 */
public class DateExercise {

	public static void main(String[] args) {
		Date date = new Date(14,10,2002);
		date.displayDate();
		date.setDay(Input.getInt("What is the day?"));
		date.setMonth(Input.getInt("What is the Month?"));
		date.setYear(Input.getInt("What is the Year?"));
		date.displayDate("According to you the day is ");
	}

}
