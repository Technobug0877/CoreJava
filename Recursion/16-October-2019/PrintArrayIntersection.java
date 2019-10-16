import java.util.ArrayList;
import java.util.Scanner;

public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		
        if(arr1.length<arr2.length)
        {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]);
                    arr2[j]=-1;
                    break;
                }
            }
        }
        }
        else
        {
         for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr1.length;j++)
            {
                if(arr2[i]==arr1[j])
                {
                    System.out.println(arr2[i]);
                    arr1[j]=-1;
                    break;
                }
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

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		Intersection.intersection(arr1, arr2);
	}
}