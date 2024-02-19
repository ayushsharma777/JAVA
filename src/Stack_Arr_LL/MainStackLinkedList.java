package Stack_Arr_LL;

public class MainStackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.peek();
        stack.pop();
        stack.isFull();
        stack.isEmpty();
        stack.delete();

    }
}
