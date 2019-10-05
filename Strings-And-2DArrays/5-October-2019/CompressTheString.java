import java.util.Scanner;

import java.util.*;
import java.lang.*;
public class Solution {

	public static String compress(String inputString) {
	

int count = 1;

char last = inputString.charAt(0);

StringBuilder output = new StringBuilder();

for(int i = 1; i < inputString.length(); i++){
    if(inputString.charAt(i) == last){
    count++;
    }else{
        if(count > 1){
            output.append(""+last+count);
            
        }else{
            output.append(last);
            
        }
    count = 1;
    last = inputString.charAt(i);
    }
}
if(count > 1){
    output.append(""+last+count);
    
}else{
    output.append(last);
     
}
return output.toString();

	}

}

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(Solution.compress(input));
	}
}
