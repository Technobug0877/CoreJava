import java.util.Scanner;

public class Sort012{	

	public static void sort012(int[] arr){
		int nextZero = 0;
        int nextTwo = arr.length - 1;
        int i = 0;
        while(i <= nextTwo){
            if(arr[i] == 0)
            {
                int temp = arr[nextZero];
                arr[nextZero] = arr[i];
                arr[i] = temp;
                i++;
                nextZero++;
            }
            else if(arr[i] == 2)
            {
                int temp = arr[nextTwo];
                arr[nextTwo] = arr[i];
                arr[i] = temp;
                nextTwo--;
            }
            else
                i++;
        }
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

	public static void print(int[] arr){
		for(int i=0; i<arr.length; i++){
			System.out.print(+arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		Sort012.sort012(arr);
		print(arr);
	}
}