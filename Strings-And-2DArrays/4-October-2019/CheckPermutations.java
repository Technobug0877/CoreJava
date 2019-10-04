import java.util.Scanner;

public class solution {

	public static boolean isPermutation(String input1, String input2) {
	    if(input1.length()==input2.length())
        {
            char[] ar=input1.toCharArray();
            char[] arr=input2.toCharArray();
            char a;
            int count=0;
            for(int i=0;i<ar.length;i++)
            {
                count=0;
               a=ar[i]; 
              for(int j=0;j<arr.length;j++)
              {
                  if(a==arr[j])
                  {
                      count++;
                      arr[j]='0';
                      break;
                  }
              }
                if(count==0)
                    return false; 
            }
            return true;
        }
        else
            return false;
	}
}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.next();
		String input2 = s.next();
		System.out.println(solution.isPermutation(input1, input2));
	}
}
