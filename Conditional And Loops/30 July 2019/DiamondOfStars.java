import java.util.*;
public class DiamondOfStars {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows:");
        int n = sc.nextInt();
        sc.close();
        System.out.println();
        System.out.println("The Pattern is:");
        int c=0,k=0;
        
        //Finding Mid-Point
        if(n%2==0)
            c=n/2;
        else
            c=(n+1)/2;
        
        
        //Printing Pattern
        for(int i=1;i<=n;i++)
        {
            if(i<=c)
                   k=i;
                else
                    k=n+1-i;
            
            for(int j=1;j<=n;j++)
            {                
                if(j<=(c-k) || j>=(c+k))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }  
	}
}

