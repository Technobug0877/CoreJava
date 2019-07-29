import java.util.*;
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		
		//Input Values
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Point:");
	    int s = sc.nextInt();
	    System.out.println("");
	    System.out.println("Enter End Point:");
	    int e = sc.nextInt();
	    System.out.println("");
	    System.out.println("Enter Step:");
	    int w = sc.nextInt();
	    int c=0;
	    sc.close();
	        
	    //Conversion and Printing
	    for(int i=s; i<=e; i+=w)
	    {
	        c=(int)((double)(5.0/9*(i-32)));
	        System.out.println(i+"    "+c);
	    }
	}

}
