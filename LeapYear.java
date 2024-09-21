import java.util.Scanner;

public class LeapYear {
    public static void LeapYear(int num)
    {
        if(num%4==0)
        {
         System.out.println("Given Year is Leap Year");
        }
        else if(num%100==0)
        {
            System.out.println("give Year is leap it is used to check if year is century");
        }
        else if(num%400==0)
        {
            System.out.println("if above condition is true so both are true");
        }
        else
        {
            System.out.println("invalid");
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your number");
    int num = sc.nextInt();
    
    LeapYear(num);
}    
}
