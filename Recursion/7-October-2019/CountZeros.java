import java.util.Scanner;

public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        int k = input%10;
        
        if(k == 0 && input != 0)
            return 1 + countZerosRec(input/10);
        else if(input != 0)
            return countZerosRec(input/10);
        else
            return 0;
        
            
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(solution.countZerosRec(n));
	}
}
