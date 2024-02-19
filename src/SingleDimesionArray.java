import java.util.Arrays;

public class SingleDimesionArray {
    int arr[]=null;
    public SingleDimesionArray(int sizeOfArray)
    {
        arr = new int[sizeOfArray];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    public void insert(int location, int value)
    {
        try
        {
            if(arr[location] == Integer.MIN_VALUE)
            {
                arr[location] = value;
                System.out.println("Successfully inserted");
            }

            else
                System.out.println("Already Occupied");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array is full!");
        }
    }
    public void traverseArray()
    {
        System.out.println(Arrays.toString(arr));
    }

    public void searchArray (int valueToSearch)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == valueToSearch)
            {
                System.out.println("Value is found at index: "+i);
                return;
            }
        }
        System.out.println(valueToSearch+" is not found.");
    }

    public void deleteValue(int valueToDeleteIndex)
    {
        try
        {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The value that is provided is not in the range of array.");
        }
    }
}
