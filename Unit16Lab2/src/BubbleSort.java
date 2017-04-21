import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int num[]= new int[100];
		for(int x=0;x!=num.length-1;x++){
			num[x]=rand.nextInt();
		}
		System.out.println(Arrays.toString(num));
		int out[]=bubbleSort(num);
		System.out.println(Arrays.toString(out));
		System.out.println(checkSort(out));
	}
	public static int[] bubbleSort(int[] input){
		 int j;
	     boolean isDone = false;
	     int temp;
	     while ( !isDone ){
	    	 isDone= true;   
	    	 for( j=0;  j < input.length -1;  j++ ){
	            	if ( input[j+1] < input[j] ){
	                	   temp = input[ j+1 ];              
	                	   input[ j+1 ] = input[ j ];
	                	   input[ j ] = temp;
	                	   isDone=false;
	            	} 
	    	 } 
	     } 
	     return input;
		
	}
	public static boolean checkSort(int[] input){
		boolean isSorted=true;
		for(int x=0; x!=input.length-2; x++){
			if(!(input[x+1]>=input[x])){
				isSorted=false;
			}
		}
		return isSorted;
	}
}
