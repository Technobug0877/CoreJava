import java.util.Scanner;

public class solution {

public static int convertStringToInt(String input){
        
  int result = Integer.valueOf(input);
        return result;
}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.convertStringToInt(input));
	}
}
