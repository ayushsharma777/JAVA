import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{5,5,6,3,2,9,1,3,4,7,1};
        arr= sortAscending(arr);
        arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] removeDuplicates(int[] arr)
    {
        int newIndex=0;
        int newArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            boolean isDuplicate = false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
            {
                newArr[newIndex++]=arr[i];
            }
        }
        return Arrays.copyOf(newArr,newIndex);
    }
    public static int[] sortAscending(int[] arr)
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
