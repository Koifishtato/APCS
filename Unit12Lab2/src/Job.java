import java.util.Random;
/**
 * Job Class For creating Print Jobs
 * @author Alexander Loeffler
 *
 */

public class Job {
	private int number;
	
	private int printTime;
	
	private Random rand;
	public Job(int number, int time){
		this.number=number;
		this.printTime=time;
	}
	
	public Job(int number){
		this.number=number;
		rand= new Random(number);
		this.printTime=rand.nextInt(990)+10;
	}
	

	public int getNumber() {
		return number;
	}
	public int getTime() {
		return printTime;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setTime(int time) {
		this.printTime = time;
	}
}
