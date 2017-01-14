/**
 * Class to make a counter console menu
 * @author A
 *
 */
import java.util.Scanner;
public class CounterConsoleMenu {
	private static Scanner input = new Scanner(System.in);
	public static void openMenu(Counter a){
		mainMenu(a);
	}
	private static void mainMenu(Counter a){
		while(true){
		System.out.printf("1) Increment Counter%n2) Decrement Counter%n3) Reset Counter%n4) Quit%nCurrent: %d%n",a.get());
		switch(input.nextInt()){
		case 1: a.inc();
				
				break;
		case 2: a.dec();
				
				break;
		case 3: a.set(0);
				
				break;
		case 4: System.exit(1);
				
				break;
		default: 
				System.out.println("INVALID SELECTION!");
				break;
		}
		}	
	}

}
