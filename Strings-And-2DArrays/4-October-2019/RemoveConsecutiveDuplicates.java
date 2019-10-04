import java.util.Scanner;

public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    for(int i = 0; i < input.length()-1; i++)
        {
            if(input.charAt(i)==input.charAt(i+1))
            {
                input=charRemoveAt(input,i+1);
                i-=1;
            }
        }
        return input;

	}
    public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           } 
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(solution.removeConsecutiveDuplicates(input));
	}
}
