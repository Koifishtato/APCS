import java.util.ArrayList;

public class Palindromes {
	public static void main(String[] args){
		String newPalindrome= "";
		for(String x: args){
			newPalindrome.concat(x);
		}
		System.out.println(testPalindrome(newPalindrome));
		
	}
	public static boolean testPalindrome(String input){
		input.toLowerCase();
		char[] validLetters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
		char[] original = input.toCharArray();
		char[] newArray=original;
		boolean isValid;
		int z=0;
		for(char x : original){
			for(char y:validLetters){
				if(x==y){
					newArray[z]=x;
				}
			}
			z++;
		}
		newArray=((new String(newArray)).trim()).toCharArray();
		char[] output = new char[newArray.length];
		int x = newArray.length-1;
		for(char y:newArray){
			output[x]=y;
			x--;
		}
		if(new String(output).matches(new String(newArray))){
			return true;
		}else{
			return false;
		}
	}
}
