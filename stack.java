class stack {
    private int[] stack;  // Array to hold stack elements
    private int top;      // Points to the top element in the stack
    private static final int MAX_SIZE = 10;  // Maximum size of the stack

    // Constructor to initialize the stack
    public stack() {
        stack = new int[MAX_SIZE];
        top = -1;  // Stack is initially empty
    }

    // Method to push an element into the stack
    public void push(int value) {
        if (top >= MAX_SIZE - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow! No elements to pop.");
            return -1;
        } else {
            int value = stack[top--];
            System.out.println(value + " popped from the stack.");
            return value;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check the element at the top of the stack
    public int peek() {
        if (top < 0) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }

    public static void main(String[] args) {
        stack stack = new stack();

        // Perform push operations
        stack.push(5);
        stack.push(10);
        stack.push(20);

        // Perform pop operations
        stack.pop();
        stack.pop();

        // Check the top element
        System.out.println("Top element is: " + stack.peek());

        // Try popping from an empty stack
        stack.pop();
        stack.pop();
    }
} 