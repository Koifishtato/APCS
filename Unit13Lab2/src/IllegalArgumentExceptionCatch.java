
public class IllegalArgumentExceptionCatch {
	public static void catchIt(){
		try{
			IllegalArgumentExceptionThrown.run();
		}catch(IllegalArgumentException e){
			System.out.println("IllegalArgumentException thrown because you cannot create an integer with null contstructor.");
			System.out.println(e);
		}
	}
}
