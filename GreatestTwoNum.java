// Find the Greatest of the Two Numbers in Java
import java.util.Scanner;

public class GreatestTwoNum {
    public static void GreatestTwoNum(int num1, int num2)
    {
            if(num1==num2)
            {
                System.out.println("No are Equal");
            }
            else if(num1>num2)
            {
                System.out.println("num1 is grater");
            }
            else if( num2> num1)
            {
                System.out.println("num2 is grater");
            }
            else
            {
                System.out.println("invalid input");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number 1");
        int num1= sc.nextInt();
        System.out.println("Enter Your Number 2");
        int num2=sc.nextInt();
        GreatestTwoNum(num1,num2);
        
    }
}
