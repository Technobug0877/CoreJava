import java.util.*;
public class Sum_or_Product {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        //Taking Inputs
        int n=sc.nextInt();
        int ch=sc.nextInt();
        sc.close();
        long res=1;
        
        // 1 for Addition, 2 for Multiplication and 3 for Any Other Case
        switch(ch){
            case 1:
                res-=1;
                for(int i=1;i<=n;i++)
                    res+=i;
                break;
            case 2:
                for(int i=1;i<=n;i++)
                    res*=i;
                break;
            default:
                res=-1;
                break;
        }
        
        //Printing Values
        System.out.print(res);

	}
}
