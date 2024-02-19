package Stack_Arr_LL;

public class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size)
    {
        arr =  new int[size];
        topOfStack=-1;
    }
    public boolean isEmpty()
    {
        if(topOfStack==-1)
            return true;
        else
            return false;
    }
    public boolean isFull()
    {
        if(topOfStack==arr.length-1)
            return true;
        else
            return false;

    }

    public void push(int value)
    {
        if(isFull())
            System.out.println("The stack is full");
        else {

            arr[++topOfStack]=value;

            System.out.println("The value has been inserted");
        }
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("The stack is empty");
        else {
            System.out.println("Removed element "+arr[topOfStack]);
            topOfStack--;
        }
    }
    public void showStack()
    {

    }

    public void peek()
    {
        if(isEmpty())
            System.out.println("The Stack is Empty");
        else {
            System.out.println(arr[topOfStack]);
        }
    }
    public void delete()
    {
        arr=null;
        topOfStack=-1;
    }

}
