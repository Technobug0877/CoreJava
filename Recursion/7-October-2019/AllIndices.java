import java.util.Scanner;

public class Solution {
	public static int[] allIndexes(int input[], int x) {
		return alIndexes(input,x,0);
	}
	public static int[] alIndexes(int input[], int x, int start)
    {
        if(start>=input.length)
        {
            int[] inp = new int[0];
        return inp;
        }
        if(input[start]==x)
        {
            int[] input2= alIndexes(input,x,start+1);
            int[] input1=new int[input2.length+1];
            input1[0]=start;
            for(int i=1;i<input1.length;i++)
            {
                input1[i]=input2[i-1];
            }
            return input1;
        }
        else
        {
            return alIndexes(input,x,start+1);
        }
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
		int x = s.nextInt();
		int output[] = Solution.allIndexes(input, x);
		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}
