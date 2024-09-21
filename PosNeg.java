public class PosNeg {

    // Make the method static to call it from the static main method
    public static void posneg(int a) {
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Neither positive nor negative");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        // Call the static method directly
        posneg(a);
    }
}
