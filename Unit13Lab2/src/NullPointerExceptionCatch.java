
public class NullPointerExceptionCatch {
	public static void catchit(){
		try{
		NullPointerExceptionThrown.run();
		}catch(NullPointerException e){
			System.out.println("NullPointerException was thrown because of calling to char array on a null string.");
			System.out.println(e);
		}
	}
}
