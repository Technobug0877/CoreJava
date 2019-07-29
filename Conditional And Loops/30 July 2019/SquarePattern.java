import java.util.*;
public class SquarePattern {


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
            for(int j=0;j<n;j++)
            {
                System.out.print(n);
            }
            System.out.println();
        }

		
	}

}



