package stacks;

/** The code is modified from the code of Prof. Galles.
 *  Array-based implementation of Stack ADT.
 */

public class ArrayStack implements Stack {
    public static final int DEFAULT_INITIAL_SIZE = 100;
    private int data[]; // the array to store elements

    // top is the index of the element right after the current top element of the stack
    private int top;
    private int size; // the maximum number of elements in the stack

    /** Initialize as an array of a default size */
    public ArrayStack() {
        data = new int[DEFAULT_INITIAL_SIZE];
        top = 0;
        size = DEFAULT_INITIAL_SIZE;
    }

    /** Initialize as an array of a given size */
    public ArrayStack(int initSize) {
        data = new int[initSize];
        top = 0;
        size = initSize;
    }

    /** Return true if the stack is empty */
    public boolean empty() {
        return top == 0;
    }

    /**
     * Push the element onto the stack.
     * If the stack is full, returns.
     * Optionally, if the stack is full, we could call growStack method
     *
     * @param elem
     * @return
     */
    public int push(int elem) {
        if (top == size) {
            System.out.println("Stack is full");
            return elem;
        }
        data[top] = elem;
        top++;
        return elem;
    }

    /** Pop the element off the top of the stack
     *
     * @return the element on top of the stack
     */
    public int pop() {
        if (top > 0)
            return data[--top];
        else {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE; // nothing to pop, stack is empty
        }
    }

    /** Print elements of the stack */
    public String toString() {
        String result = "[";
        if (top > 0) {
            result = result + data[top - 1];
        }
        for (int i = top - 2; i >= 0; i--) {
            result = result + "," + data[i];
        }
        result = result + "]";
        return result;
    }

    /**
     * Return the value of the element on top of the stack.
     * Do not pop it from the stack.
     * @return top of the stack
     */
    public int peek() {
        if (empty()) {
            System.out.println("Empty stack");
            return Integer.MIN_VALUE;
        }
        return data[top - 1];
    }

    /** Allocate twice as much memory for the array that stores
     * the stack elements */
    protected void growStack() {
        int i;
        int[] newdata;

        newdata = new int[size * 2];
        for (i = 0; i < size; i++)
            newdata[i] = data[i];
        data = newdata;
        size = size * 2;
    }
}

