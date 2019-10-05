import java.util.Scanner;

// highest occurring character in the String.
public class solution {

    static final int ASCII_SIZE = 256; 
	public static char highestOccuringCharacter(String inputString) {
		// Write your code here

        int count[] = new int[ASCII_SIZE]; 
       
        int len = inputString.length(); 
        for (int i=0; i<len; i++) 
            count[inputString.charAt(i)]++; 
       
        int max = -1;  
        char result = ' ';    
       
        for (int i = 0; i < len; i++) { 
            if (max < count[inputString.charAt(i)]) 
            { 
                max = count[inputString.charAt(i)]; 
                result = inputString.charAt(i); 
            }
        }
        return result;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.highestOccuringCharacter(input));
	}
}
