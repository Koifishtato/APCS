
public class ArrayIndexOutOfBoundsExceptionCatch {
	public static void catchIt(){
		try{
			ArrayIndexOutOfBoundsExceptionThrown.run();
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException was thrown because of accesing index 5 of an array with 5 elements(because java counts from zero in arrays)");
			System.out.println(e);
		}
	}
}
