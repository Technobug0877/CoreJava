import java.util.Scanner;

public class Solution {

    static int i = 0;
	public static int sum(int input[]) {
		
        if(i == input.length - 1)
            return input[i];
        i++;
        return input[i-1] + sum(input);
        
		
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
		System.out.println(Solution.sum(input));
	}
}
