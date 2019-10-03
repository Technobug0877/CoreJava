import java.util.Scanner;

public class Solution {
	public static String reverseWordWise(String input) {
		
        String str="",st="";
            for(int i=0;i<input.length();i++)
        {
         
            str=str+input.charAt(i);
                if(i==input.length()-1)
                {
                    str=str+" ";
                    st=str+st;
                }
                   if(input.charAt(i)==' ')
            {
                st=str+st;
                str="";
            }
        }
return st;
	}
}


public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.reverseWordWise(input));
	}
}
