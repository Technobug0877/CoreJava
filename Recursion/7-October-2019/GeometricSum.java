import java.text.DecimalFormat;
import java.util.Scanner;

public class solution {

    static double i = 0;
	public static double findGeometricSum(int k){
        if(i<=k){
            i++;
            return (1/Math.pow(2,i-1)) + findGeometricSum(k);
        }
        else
            return 0;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = solution.findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}
}
