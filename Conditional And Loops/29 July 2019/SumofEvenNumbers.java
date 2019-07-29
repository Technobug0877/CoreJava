import java.util.Scanner;
public class SumofEvenNumbers {

	
	

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    sc.close();
	    
	    //Checking Sum
	    for(int i=0; i<=n; i++)
	    {
	    	if(i%2==0)
	        sum+=i;
	    }
	    
	    //Printing Sum
	    System.out.print(sum);

			
	}

}


