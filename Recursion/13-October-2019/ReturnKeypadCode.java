import java.util.*;
public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
        if(n==0 || n==1)
        {
            String ans[]=new String[0];
            return ans;
        }
        
        String num = Integer.toString(n);
        ArrayList<String> out = outputFun(num);
        String ans[]=new String[out.size()];
        for(int i=0;i<out.size();i++)
        {
            ans[i]=out.get(i);
        }
        return ans;
	}
    public static ArrayList<String> outputFun(String num)
    {
        if(num.length()==0)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch=num.charAt(0);
        String str=num.substring(1);
        ArrayList<String> per=outputFun(str);
        ArrayList<String> res=new ArrayList<>();
        String code=helper[ch-'0'];
        for(String val : per)
        {
            for(int i=0;i<code.length();i++)
            {
                res.add(code.charAt(i)+val);
            }
        }
        return res;
    }
    static final String helper[] 
        = { "","", "abc", "def", 
            "ghi", "jkl", "mno", 
            "pqrs", "tuv", "wxyz"}; 
    /*public static String helper(String  n)
    {
        switch(n)
        {
            
            case 2:
                return "abc";
                break;
            case 3:
                return  "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            
        }
        return "";
    }*/
	
}

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = solution.keypad(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
