import java.util.*;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Taking Inputs
        int n = sc.nextInt();
        sc.close();
        
        int dec=0,count=0;
        for(int i=n;i!=0;i/=10)
        {
            //Multiplying The binary by 2^n
            dec+=(i%10)*Math.pow(2,count);
            count++;
        }
        //Printing the converted Number
        System.out.print(dec);
	}
}
