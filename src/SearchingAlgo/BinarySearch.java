package SearchingAlgo;

/*The Binary Search Algorithm can be implemented in the following two ways

       1. Iterative Binary Search Algorithm :
                Here we use a while loop to continue the process of comparing
                the key and splitting the search space in two halves.
       2. Recursive Binary Search Algorithm :
                Create a recursive function and compare the mid of the search
                space with the key. And based on the result either return the
                index where the key is found or call the recursive function for the next search space.
*/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10,90,200};
        int low=0;
        int high=arr.length-1;
        int mid;
        int key = 6; // Number to Find
        int index=-1;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid]==key) {
                index = mid;
                break;
            }
            if(key>arr[mid])
            {
                low=mid+1;
            }
            if(key<arr[mid])
            {
                high=mid-1;
            }
        }
        if(index==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index :" +index);

    }
}
