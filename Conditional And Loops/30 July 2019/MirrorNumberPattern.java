import java.util.*;
public class MirrorNumberPattern {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows:");
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        
        System.out.println("The Pattern is:");
        
        //Printing Pattern
        for(int i=0;i<n;i++)
        {
            int k=0;
           for(int j=0;j<n;j++)
           {
               if(i+j<n-1)
                   System.out.print(" ");
               else
               {
                   k++;
                  System.out.print(k); 
               }
                   
           }
            System.out.println();
        }	
	}
}

