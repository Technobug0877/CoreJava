import java.util.Scanner;

public class solution {

	public static int sumOfDigits(int input){

        if(input != 0)
        {
            return input%10 + sumOfDigits(input/10);
        }
        else
            return 0;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.sumOfDigits(n));
	}
}
