
public class ClassCastExceptionCatch {
	public static void catchIt(){
		try{
			ClassCastExceptionThrown.run();
		}
		catch(ClassCastException e){
			System.out.println("ClassCastException thrown because you cannot cast a Double object to a String because string is not an instance of double.");
			System.out.println(e);
		}
	}
}
