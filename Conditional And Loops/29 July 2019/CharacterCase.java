import java.util.Scanner;
public class CharacterCase {

	public static void main(String[] args) {
		
		System.out.println("Enter The Character:");
		Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();
        //Check For UpperCase & LowerCase
        if(ch >= 'a' && ch <= 'z')
        	//For LowerCase
        	System.out.print(0);
		else if(ch >= 'A' && ch <= 'Z')
			//For UpperCase
		    System.out.print(1);
		else
			//For any Other Value
		    System.out.print(-1);
      }
}


	


