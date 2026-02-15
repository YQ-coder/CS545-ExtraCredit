package queues.stackwith2queues;

import stacks.Stack;

public class StackWithTwoQueuesTester {
    static void main(String[] args) {
        Stack stack = new StackWithTwoQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop()); // 4
        System.out.println(stack.pop()); // 3
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       // System.out.println(stack.pop());

    }
}
