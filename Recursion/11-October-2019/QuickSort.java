import java.util.Scanner;

public class Solution {
	
	public static void quickSort(int[] input) {
        quick(input,0,input.length-1);
		
	}
    public static void quick(int[] input,int low,int high)
    {
        if(low<high)
        {
            int pi=partition(input,low,high);
            quick(input,low,pi-1);
            quick(input,pi+1,high);
        }
    }
    public static int partition(int[] input,int low, int high)
    {
        int pivot=input[high];
        int i=low-1;
        for(int j=low;j<high;j++)
        {
            if(input[j]<=pivot)
            {
                i++;
                int t=input[i];
                input[i]=input[j];
                input[j]=t;
            }
        }
        int t=input[i+1];
        input[i+1]=input[high];
        input[high]=t;
        return (i+1);
    }
	
}

public class Runner {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		Solution.quickSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
}        