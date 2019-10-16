
import java.util.*;

public class PairSum{	

	public static void pairSum(int[] arr, int num){
	
      	Arrays.sort(arr);
      	for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==num){
              System.out.println(arr[i]+" "+arr[j]);
            }
          }
        }
	}
}

public class Main {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		PairSum.pairSum(arr, num);
	}
}