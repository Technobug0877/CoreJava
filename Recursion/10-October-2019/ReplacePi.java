import java.util.Scanner;

public class solution {

    static String ch = "";
    static int i = 0;
	public static String replace(String input){
      
            return input.replace("pi","3.14");        
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(solution.replace(input));
	}
}
