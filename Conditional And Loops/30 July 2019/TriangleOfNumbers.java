import java.util.*;
public class TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        sc.close();
        
        System.out.println();
        System.out.println("The Pattern is:");
        int c=1;
        
        //Printing Pattern
        for(int i=1;i<=n;i++)
        {
            c=i;
               for(int z=n-1;z>=i;z--)
               {
                   System.out.print(" "); 
               }
            for(int j=1;j<=i;j++)
               {
             
                System.out.print(c); 
                c++;
               }
            c--;
            c--;
            for(int h=1;h<i;h++)
            {
                 System.out.print(c);
                c--;  
            }
             System.out.println();  
        }
	
	}
}

