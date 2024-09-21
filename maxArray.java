public class maxArray {
    public static void main(String[] args) {
        int[] arr={10,203,40,50,50};
        int min=arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("minimum elemnt is "+min);
    }
}
