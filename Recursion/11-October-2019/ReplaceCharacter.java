import java.util.Scanner;

public class Solution {
    
    static int i = 0;
    static String ch = "";
	public static String replaceCharacter(String input, char c1, char c2) {
		
        if(i < input.length() - 1)
        {
            
            if(input.charAt(i) == c1)
            {
                input = input.substring(0,i) + c2 + input.substring(i + 1);
            }
            
            i++;
            return replaceCharacter(input,c1,c2);
        }
        else
            return input;

	}
}

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		char c1 = s.next().charAt(0);
		char c2 = s.next().charAt(0);
		System.out.println(Solution.replaceCharacter(input, c1, c2));
	}
}
