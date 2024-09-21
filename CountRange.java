public class CountRange {

    public static void countrange() {
        int sum = 0;
        int start = 20;
        int end = 90;  // Sum from 20 to 89 (end is exclusive)

        for (int i = start; i < end; i++) {
            sum += i;
        }

        System.out.println("The total sum of numbers from 20 to 89 is: " + sum);
    }

    public static void main(String[] args) {
        countrange();
    }
}
