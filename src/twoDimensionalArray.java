import java.util.Arrays;

public class twoDimensionalArray {
    int arr[][];

    public twoDimensionalArray(int row, int column)
    {
        arr = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insertValue(int row,int col, int value)
    {
        try
        {
            if(arr[row][col] == Integer.MIN_VALUE)
            {
                arr[row][col] = value;
            }
            else {
                System.out.println("Already Occupied");
            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index not in range.");
        }
    }

    public void accessCell(int row, int col)
    {
        try
        {
            System.out.println("Cell value is: "+arr[row][col]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index for 2D array");
        }
    }

    public void traverseArray()
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }

    public void searchValue(int value)
    {
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr.length;col++) {
                if(arr[row][col]==value)
                {
                    System.out.println("Value found at Row: "+row+" Col: "+col);
                    return;
                }
            }
        }
        System.out.println("Value is not found at array index");
    }

    public void deleteValueFromArray(int row, int col)
    {
        try
        {
            arr[row][col] = Integer.MIN_VALUE;
            System.out.println("Successfully " +
                    "deleted");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index not found in range");
        }
    }
}
