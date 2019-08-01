import java.util.*;
public class Terms_of_AP {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking Input
        int n = sc.nextInt();
        sc.close();
        int k=0;
        for(int i=1;i<=n+k;i++)
        {
        	//Checking if the AP term is a multiple of 4.
            if(((3*i)+2)%4!=0)
            	//Printing Output
                System.out.print((3*i)+2+" ");
            else
            	//If a number is Divisible by 4
                k++;
        }

	}
}
