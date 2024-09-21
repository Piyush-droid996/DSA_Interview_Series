import java.util.Scanner;
public class ProgrameEven {
     public static void evenodd(int a)
     {
        if(a%2==0)
        {
         System.out.println("Number is even");
        }
        else{
            System.out.println("Hence IT is odd");
        }
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        evenodd(a);

       
    }
}
