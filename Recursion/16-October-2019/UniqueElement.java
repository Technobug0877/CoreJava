import java.util.Scanner;

public class FindUnique{	

	public static int findUnique(int[] arr){

        int un = 0;
        for(int i = 0; i < arr.length; i++)
        {
            un = un ^ arr[i];
        }
        return un;
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
		System.out.print(FindUnique.findUnique(arr));
	}
}