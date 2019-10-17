import java.util.Scanner;

public class TripletSum {	

	public static void FindTriplet(int[] arr, int x){
        
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int l=j+1;l<arr.length;l++)
                {
                    sum=arr[i]+arr[j]+arr[l];
                    if(sum==x)
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[l]);
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
		TripletSum.FindTriplet(arr, num);
	}
}