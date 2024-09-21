import java.util.Scanner;

public class Reversenum {
    public static void reverse(int num)
    {
        int rev=1;
        int temp=num;//123
        int rem = 0;
        while(temp!=0)
        {
          rem= temp%10;//3 2
          rev= rev * 10 +rem;//3 
          temp= temp/10;//12
        }
        System.out.println(num);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num");
        int num = sc.nextInt();
        reverse(num);

    }
}
