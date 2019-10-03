import java.util.Scanner;

public class Solution {

	public static boolean checkPalindrome(String str){
		boolean k = false;
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
              k = true;
            else
            {
                k = false;
                break;
            }
        }
        return k;

	}
}

public class Runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(Solution.checkPalindrome(str));
	}


}
