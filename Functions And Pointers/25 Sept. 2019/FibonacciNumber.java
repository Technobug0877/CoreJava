import java.util.Scanner;
public class Solution {
	
	public static boolean checkMember(int n){				
        	int t=0,t1=1,digit=0,flag=0;
        	for(int i=0;i<10000;i++)
        	{
            		digit=t+t1;
            		t=t1;
            		t1=digit;
            		if(digit==n)
            		{
                		flag=1;
                		break;
            		}
        	}
        	if(flag==1)
            		return true;
        	else
            		return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(Solution.checkMember(n));
	}
}