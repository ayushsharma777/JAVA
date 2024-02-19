import java.util.Arrays;

public class twoDimensionalArray_Main {
    public static void main(String[] args)
    {
        twoDimensionalArray td = new twoDimensionalArray(3,3);
//        for(int i =0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                td.insertValue(i,j,i);
//            }
//        }
        td.insertValue(0,0,1);
        td.insertValue(0,1,2);
        td.insertValue(0,2,3);
        td.insertValue(1,0,4);
        td.insertValue(1,1,5);
        td.insertValue(1,2,6);
        td.insertValue(2,0,7);
        td.insertValue(2,1,8);
        td.insertValue(2,2,9);
        System.out.println(Arrays.deepToString(td.arr));
        td.accessCell(0,1);
        td.traverseArray();
        td.searchValue(5);
        td.deleteValueFromArray(1,1);
        td.traverseArray();
    }
}
