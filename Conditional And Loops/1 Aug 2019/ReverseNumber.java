import java.util.*;
public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Taking Input
        int n = sc.nextInt();
        sc.close();
        int rev=0;
        
        //
        for(int i=n; i!=0; i/=10)
        {
        	//Storing The Ones Place Digit in an Integer
            rev+=i%10;
            rev*=10;
        }
        // Printing the Number Reversed
        System.out.print(rev/10);
	}
}
