import java.util.*;
public class AlphaPattern {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
		int n = sc.nextInt();
        char ch='A';
        sc.close();
        System.out.println();
        System.out.println("The Pattern is:");
        
        //Printing Pattern
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<=i;j++)
           {
               System.out.print((char)(ch+i));
           }
            System.out.println();
        }	
	}
}

