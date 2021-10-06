public class PalindromeNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
long num = input.nextLong(), reversedNum = 0, remainder;
long originalNum = num;
while (num != 0) {
remainder = num % 10;
reversedNum = reversedNum * 10 + remainder;
num /= 10;
}
if (originalNum == reversedNum) {
System.out.println(originalNum + " is Palindrome.");
}
else {
System.out.println(originalNum + " is not Palindrome.");
}
}
}