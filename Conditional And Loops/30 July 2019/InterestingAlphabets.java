import java.util.*;
public class InterestingAlphabets {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        char ch = 'A';
        sc.close();
        System.out.println();
        System.out.println("The Pattern is:");
        //Printing Pattern
        for(int i=0;i<n;i++)
        {     
           for(int j=i;j>=0;j--)
           {
               System.out.print((char)(ch-j+n-1));
           }
            System.out.println();
        }		
	}

}
