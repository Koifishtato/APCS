import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		while (true){
			try{
				System.out.printf("What is the Neumerator?: %n" );//I hope I spelled these right...
				int x=inputs.nextInt();
				System.out.printf("What is the Denominator?: " );
				int y = inputs.nextInt();
				System.out.println(divide(x,y));
				break;
			}catch(DivideByZeroException e){
				System.out.println("Don't Try to Divide By Zero! Try Again!");
			}catch(InputMismatchException e){
				System.out.println("That's not even an Integer! Try Again!");
				inputs.next();
			}
		}
	}
	
	public static int divide(int x, int y) throws DivideByZeroException{
		int result = 0;
		
		try{
			result=x/y;
		}catch(ArithmeticException e){
			throw new DivideByZeroException();
		}
		return result;
	}

}
