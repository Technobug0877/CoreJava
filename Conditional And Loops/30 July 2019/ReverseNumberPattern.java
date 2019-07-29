import java.util.*;
public class ReverseNumberPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        
        System.out.println("The Pattern is:");
        //Printing Pattern
        for(int i=0;i<n;i++)
        {
           for(int j=i;j>=0;j--)
           {
               System.out.print(j+1);
           }
            System.out.println();
        }	
	}
}
