import java.util.Scanner;

public class solution {
    static int start = 0;
	public static void printSubsets(int arr[]) {
		
        int ans[][] = subsets(arr,0);
        
        for(int[] inner : ans) {
			for(int elem : inner) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
      }
    
    public static int[][] subsets(int arr[], int start) {
		
		if(start == arr.length) {
			return new int[1][0];
		}
		
		int[][] smallSubsets = subsets(arr, start+1);
		int[][] finalAns = new int[2*smallSubsets.length][];
		
		for(int i = 0; i < smallSubsets.length; i++) {
			int[] arrayInsideSmallSubset = smallSubsets[i];
			
			finalAns[i] = arrayInsideSmallSubset;
			
			int[] temp = new int[arrayInsideSmallSubset.length + 1];
			temp[0] = arr[start];
			
			for(int j = 1; j < temp.length; j++) {
				temp[j] = arrayInsideSmallSubset[j-1];
			}
			
			finalAns[i + smallSubsets.length] = temp;
		}	
		return finalAns;
		
	}
}

public class runner {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.printSubsets(input);
	}
}
