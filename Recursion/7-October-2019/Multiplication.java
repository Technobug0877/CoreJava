import java.util.Scanner;

public class solution {

    static int i = 0;
	public static int multiplyTwoIntegers(int m, int n){
        
        if(i != n){
            i++;
            return m + multiplyTwoIntegers(m,n);  
        }   
        else
            return 0;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(solution.multiplyTwoIntegers(m, n));
	}
}
