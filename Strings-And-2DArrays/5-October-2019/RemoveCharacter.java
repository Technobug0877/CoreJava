import java.util.Scanner;

public class solution {

	public static String removeAllOccurrencesOfChar(String input, char c) {
        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == c)
            {
                input = remove(input,c,i);
                i-=1;
            }    
        }
        return input; 
    }
        public static String remove(String str, char ch, int i)
        {
            return str.substring(0,i) + str.substring(i+1);
        }
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c = s.next().charAt(0);
		System.out.println(solution.removeAllOccurrencesOfChar(input, c));
	}
}
