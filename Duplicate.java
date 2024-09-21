// package ArrPrograms;
// Q1: Write a java program to find duplicate elements in an array?
public class Duplicate {
    // Your class implementation here
    public static void main(String[] args)
    {
        int[] arr={10,20,30,10,20,40};
        System.out.println("Duplicates ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }


    }
}
