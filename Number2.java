public class StackBasic {
    private int maxSize;
    private int top;
    private int[] stackArray;
        // constructor
    public StackBasic(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // initially stack is empty
    }
        // Add element to top of stack
    public void push(int value) {
        if(top + 1 == maxSize){
            System.out.println("Stack Overflow");
        }
        else{
            
        }
    }
        // Remove element from top of stack
    public void pop() {

    }
        // Return top of stack
    public int peek() {

    }
    public static void main(String args[]) {
        StackBasic stack = new StackBasic(3);
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.peek());
        stack.pop();
        System.out.println("Top element: " + stack.peek());
    }
}