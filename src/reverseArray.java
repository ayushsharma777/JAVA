import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
    }
    public static void reverse(int[] arr)
    {
        int temp=0;
        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
