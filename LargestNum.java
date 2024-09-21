// Q2: Write a java program to find  largest element in an array
// of integers?

public class LargestNum {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int max=arr[0];

        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
    
        }
        System.out.println(max);
    }
}
