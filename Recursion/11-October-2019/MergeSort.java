import java.util.Scanner;

public class solution {

    public static void mergeSort(int[] input) {
        mergesort(input, 0, input.length-1);
    	}

    public static void mergesort(int[] input, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;
        mergesort(input, start, middle);
        mergesort(input, middle + 1, end);
        merge(input, start, end,middle);
    }

    public static void merge(int[] a, int beg, int end,int mid) {
        
        int i=beg,j=mid+1,k,index = beg;  
        int[] temp = new int[a.length];
    while(i<=mid && j<=end)  
    {  
        if(a[i]<a[j])  
        {  
            temp[index] = a[i];  
            i = i+1;  
        }  
        else   
        {  
            temp[index] = a[j];  
            j = j+1;   
        }  
        index++;  
    }  
    if(i>mid)  
    {  
        while(j<=end)  
        {  
            temp[index] = a[j];  
            index++;  
            j++;  
        }  
    }  
    else   
    {  
        while(i<=mid)  
        {  
            temp[index] = a[i];  
            index++;  
            i++;  
        }  
    }  
    k = beg;  
    while(k<index)  
    {  
        a[k]=temp[k];  
        k++;  
    }      
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
	
	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		solution.mergeSort(input);
		printArray(input);
	}
}
