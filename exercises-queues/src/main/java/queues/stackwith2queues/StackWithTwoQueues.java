package queues.stackwith2queues;

import queues.circulararray.ArrayQueue;
import queues.circulararray.Queue;
import stacks.Stack;

import java.util.NoSuchElementException;

// Implement a stack (push, pop, empty) with 2 queues and no additional memory
public class StackWithTwoQueues implements Stack {
    private Queue queue1 = new ArrayQueue(100);
    private Queue queue2 = new ArrayQueue(100);

    @Override
    public int push(int elem) {
       // FILL IN CODE:
        queue1.enqueue(elem);
        return elem;
    }

    @Override
    public int pop() {
        if (queue1.empty())
            throw new NoSuchElementException("Empty stack");
        // FILL IN CODE:
        boolean lastFound = false;
        int lastNum = 0;
        while (!queue1.empty()) {
            int cur = queue1.dequeue();
            if (!lastFound) {
                lastFound = true;
                lastNum = cur;
            } else {
                queue2.enqueue(lastNum);
                lastNum = cur;
            }
        }
        Queue temp;
        temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return lastNum; // change
    }

    @Override
    public boolean empty() {
        // FILL IN CODE
        return queue1.empty(); // change
    }

    @Override
    public int peek() {
        // Do not worry about this one
        throw new UnsupportedOperationException();
    }
}
