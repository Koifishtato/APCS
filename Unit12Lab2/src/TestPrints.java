import java.util.LinkedList;
import java.util.Scanner;

public class TestPrints {
	static LinkedList<Job> jobs;
	static Scanner input;
	
	public static void main(String[] args) {
		 jobs = new LinkedList<Job>();
		 input=new Scanner(System.in);
		 while(true){
			 menu();
		 }
	}
	
	public static void menu(){
		System.out.printf("(1) Add Job%n(2) Quit%n:");
		int in= input.nextInt();
		switch(in){
		case 1: addJob();
		break;
		case 2: end();
		break;
		case 123:
			for(int x=0; x!=100; x++){
				addJob();
			}
		break;
		default:
			System.out.println("Invalid!");
			break;
		}
	}
	
	public static void addJob(){
		jobs.add(new Job(jobs.size()));
	}
	
	public static void end(){
		for(int x=0; x!=jobs.size(); x++){
			System.out.printf("Job ID #%d: Time: %d%n", jobs.get(x).getNumber(), jobs.get(x).getTime());
		}
		System.exit(1);
	}
}
