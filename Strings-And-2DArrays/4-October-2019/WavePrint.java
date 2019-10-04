import java.util.Scanner;

public class Solution {
	// input - input 2D array
	public static void wavePrint(int input[][]){	
	for(int j = 0; j < input[0].length; j++)
        {
            if(j%2 == 0)
            {
                for(int i = 0; i < input.length; i++)
                {
                    System.out.print(input[i][j] + " ");
                }
            }
            else
            {
                for(int i = input.length-1; i >= 0; i--)
                {
                    System.out.print(input[i][j] + " ");
                }                

            }
        }
	}	
}

public class Main {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static int[][] takeInput2D(){
		
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}
	
	
	public static void main(String[] args) {
	
		int input[][] = takeInput2D();
		Solution.wavePrint(input);
		
	}

}

