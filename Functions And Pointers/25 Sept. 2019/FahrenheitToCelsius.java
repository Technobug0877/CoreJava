import java.util.Scanner;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		
        	for(int i=start; i<=end; i+=step)
        	{
            		double c = (double)((5.0/9)*(double)(i-32));
            		System.out.println(i+"    "+(int)c);
        	}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		Solution.printFahrenheitTable(start, end, step);
	}
}