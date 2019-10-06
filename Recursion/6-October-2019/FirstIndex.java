import java.util.Scanner;

public class Solution {

    static int i = 0;
	public static int firstIndex(int input[], int x) {
		
        if(i == input.length - 1 && x == input[i])
            return i;
        else if(i == input.length - 1 && x != input[i])
            return -1;
        i++;
        if(x == input[i-1])
            return i-1;
        else
            return firstIndex(input , x);
		
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
		System.out.println(Solution.firstIndex(input, x));
	}
}