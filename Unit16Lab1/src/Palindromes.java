import java.util.ArrayList;

public class Palindromes {
	public static void main(String[] args){
		String newPalindrome= "";
		for(String x: args){
			newPalindrome+=(x);
		}
		
		System.out.println(testPalindrome(newPalindrome));
		
	}
	public static boolean testPalindrome(String input){
		input=input.toLowerCase();
		char[] validLetters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
		char[] original = input.toCharArray();
		String newArray="";
		boolean isValid;
		int z=0;
		for(char x : original){
			for(char y:validLetters){
				if(x==y){
					newArray+=x;
				}
			}
		}
		System.out.println(newArray);
		char []newArrays=((newArray)).trim().toCharArray();
		char[] output = new char[newArrays.length];
		int x = newArrays.length-1;
		for(char y:newArrays){
			output[x]=y;
			x--;
		}
		System.out.println(new String(output));
		if(new String(output).matches(new String(newArrays))){
			return true;
		}else{
			return false;
		}
	}
}
