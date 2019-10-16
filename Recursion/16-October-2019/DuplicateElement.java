import java.util.*;
public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		
        int n = arr.length;
        int temp = 0;
        Arrays.sort(arr);
        for(int i = 0; i < n -1; i++)
        {
           if(arr[i] == arr[i+1])
               temp = arr[i];
        }
        return temp;
        

	}
}

public class Main {
	
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
		int[] arr = takeInput();
		System.out.print(DuplicateInArray.duplicate(arr));
	}
}