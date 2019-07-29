import java.util.*;
public class StarPattern{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Number of Rows:");
        int n = sc.nextInt();
        sc.close();
        
        System.out.println();
        System.out.println("The Pattern is:");
        
        //Printing Pattern
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<(2*n);j++)
            {
                if(i+j<=n)
                    System.out.print(" ");
                else if(n+i-j>0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }	
	}
}
