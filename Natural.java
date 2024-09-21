import java.util.Scanner;
public class Natural {

    public static void Natural(int n)
    {
        int sum=0;

        for (int i = 0; i < n; i++) {
            sum= sum+i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Natural(n);
    }
}
