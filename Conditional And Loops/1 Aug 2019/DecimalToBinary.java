import java.util.*;
public class DecimalToBinary {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //Allocating Space to Array
        int h[]=new int[100];
        int j=0;
        //Taking Input
        int n=sc.nextInt();
        sc.close();
        while(n>0)
        {
        	//Storing Values in An Array
            h[j]=n%2;
            j++;
            n=n/2;
        }
        for(int i=j-1;i>=0;i--)
        {
        System.out.print(h[i]);
        }
		

	}
}