/**
 * Class to make a counter console menu
 * @author Alexander Loeffler
 * @version 1.0
 */
import java.util.Scanner;
public class CounterConsoleMenu {
	private static Scanner input = new Scanner(System.in);
	public static void openMenu(Memcounter a){
		mainMenu(a);
	}
	/**
	 * Opens the Main menu
	 * @param a
	 * Counter to work with
	 *
	 */
	private static void mainMenu(Memcounter a){
		while(true){
		System.out.printf("1) Increment Counter%n2) Decrement Counter%n3) Reset Counter%n4)Set Memory%n5)Recall Memory%n6) Quit%nCurrent: %d%nMemory:%d%n",a.get(),a.getMemory());
		switch(input.nextInt()){
		case 1: a.inc();
				
				break;
		case 2: a.dec();
				
				break;
		case 3: a.set(0);
				
				break;
		case 4: a.setMemory();
				break;
				
		case 5: a.set(a.getMemory());
				break;
		case 6: System.exit(1);
				
				break;
		default: 
				System.out.println("INVALID SELECTION!");
				break;
		}
		}	
	}

}
