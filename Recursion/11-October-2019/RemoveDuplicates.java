import java.util.Scanner;

public class Solution {
    
    static int i = 0;
	public static String removeConsecutiveDuplicates(String s) {
		
        if(i < s.length() - 1  && i <= 1000)
        {
            if(s.charAt(i) == s.charAt(i + 1))
            {
                s = s.substring(0,i) + s.substring(i+1);
                i--;
            }
            i++;
            return removeConsecutiveDuplicates(s);
        }
        else
            return s;
	}
}

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
    	String input = s.next();
    	System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}