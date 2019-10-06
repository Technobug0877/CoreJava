import java.util.Scanner;

public class Solution {
	
    static int i = 0;
	public static boolean checkNumber(int input[], int x) {
		
        if(i == input.length-1 && x == input[i])
            return true;
        else if(i == input.length-1 && x != input[i])
            return false;
        i++;
        if(x == input[i - 1])
            return true;
        else
            return checkNumber(input , x);
            
	}
}

public class Runner {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(Solution.checkNumber(input, x));
	}
}
