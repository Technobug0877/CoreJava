public class PalindromeNumber {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	long nums = input.nextLong(), reversedNum = 0, remainder;
	long originalNum = nums;	
	while (nums != 0) {
	remainder = nums % 10;
	reversedNum = reversedNum * 10 + remainder;
	nums /= 10;
	}
	if (originalNum == reversedNum) {
	System.out.println(originalNum + " is Palindrome.");
	}
	else {
	System.out.println(originalNum + " is not Palindrome.");
	}
	}
}
