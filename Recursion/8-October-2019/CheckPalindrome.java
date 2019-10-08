import java.util.*;
public class solution {
    static boolean c = false;
	public static boolean isStringPalindrome(String input) {
		// Write your code here

        String reverse = "";
        
        
        for(int i = input.length() - 1; i >= 0; i--)
        {
            reverse = reverse + input.charAt(i);
        }
        return reverse.equals(input);
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.isStringPalindrome(input));
	}
}
