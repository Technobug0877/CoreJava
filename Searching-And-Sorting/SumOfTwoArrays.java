import java.util.Scanner;

public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
    int c;
        if(arr1.length>=arr2.length)
        {
            c=arr1.length+1;
        }
        else
        {
            c=arr2.length+1;
        }
        int[] arr=new int[c];
        int j=arr1.length-1,k=arr2.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(j<0&&k<0)
                break;
           else if(j<0)
            {
                arr[i]+=arr2[k];
               k--;
                continue;
            }
           else if(k<0)
            {
                arr[i]+=arr1[j];
               j--;
                continue;
            }
            else
            {
                arr[i]+=arr1[j]+arr2[k];
            j--;
            k--;
                if(arr[i]>9)
                {
                    arr[i]=arr[i]%10;
                    arr[i-1]=1;
                }
            }
        }
        return arr;
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
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		print(SumOfTwoArrays.sumOfTwoArrays(arr1, arr2));
	}
}