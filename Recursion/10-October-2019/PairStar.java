
import java.util.Scanner;

public class solution {

    static int i = 0;
	public static String addStars(String s) {
        if(i < s.length() - 1)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                s = s.substring(0,i+1) + "*" + s.substring(i+1);
            }
            i++;
            return addStars(s);
        }
        else
            return s;

	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.addStars(input));
	}
}
