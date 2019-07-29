import java.util.*;
public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of rows:");
		int n = sc.nextInt();
		sc.close();
		System.out.println();
		int count=0;
		System.out.println("The Pattern is:");
		//Printing Pattern
		for(int i=1; i<=n; i++)
		{
			for(int j=1;j<=i;j++)
			{
				count=i+j-1;
	            System.out.print(count);
			}    
	        System.out.println();
	    }
	}
}
