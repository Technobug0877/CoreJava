import java.util.*;
public class NumberPattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows:");
		int n=sc.nextInt();
		System.out.println();
		int count=0;
		sc.close();
		System.out.println();
		System.out.println("The Pattern is:");
		
		//Printing Pattern
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=n-i)
					System.out.print(" ");
				else
				{
					count++;
					System.out.print(count);
					if(j==n && i>=2)
						count=i;
				}
			}
			System.out.println();
		}
	}
}
