import java.util.Scanner;

public class Solution {

	public static int lastIndex(int input[], int x) {
        	if(input.length == 0) {
			return -1;
		}
		
		int[] smallArray = new int[input.length - 1];

		for(int i = 0; i < smallArray.length; i++) {
			smallArray[i] = input[i +1];
		}
		
		
		int smallIndex = lastIndex(smallArray, x);
		
		if(smallIndex != -1) {
			return smallIndex + 1;
		} else {
			if(input[0] == x)
				return 0;
			else 
				return -1;
		}
		 
	}
	
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.lastIndex(input, x));
	}
}