import java.util.Scanner;

public class solution {

	// Return the changed string
    static String ch = "";
    static int i = 0;
	public static String removeX(String input){
		
        if(i < input.length())
        {
            if(input.charAt(i) != 'x')
                ch = ch + input.charAt(i);
            i++;
            return removeX(input);
        }
        else
            return ch;

	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.removeX(input));
	}
}
