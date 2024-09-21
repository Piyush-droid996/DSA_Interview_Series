import java.util.Scanner;

public class palindrome {

    // Method to check if a number is a palindrome
    public static void checkPalindrome(int num) {
        int originalNum = num;  // Store the original number
        int reversedNum = 0;    // Variable to store the reversed number
        int remainder;          // Variable to store the remainder when dividing by 10

        // Reverse the number
        while (num != 0) {
            remainder = num % 10;           // Get the last digit
            reversedNum = (reversedNum * 10) + remainder;  // Append the last digit to the reversed number
            num = num / 10;                 // Remove the last digit from the original number
        }

        // Check if the reversed number is equal to the original number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = sc.nextInt();
        checkPalindrome(num);  // Call the method to check for palindrome
    }
}
