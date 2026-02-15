package queues.circulararray;

import java.util.NoSuchElementException;

/** A class that implements a Queue ADT using a circular array
 */
public class ArrayQueue implements Queue {
	private int data[]; // the array that will store the queue
	private int head;
	private int currSize; // # of elements in the queue

	public ArrayQueue(int maxsize) {
        data = new int[maxsize];
		head = 0;
		currSize = 0;
	}

	/** Add an element to the end of the queue, if it's not full
	 *
	 * @param elem element to enqueue
	 */
	public void enqueue(int elem) {
		// FILL IN CODE:
        // TODO: check id there is space
        if (currSize == data.length) {
            throw new IllegalArgumentException();
        }
        data[(head + currSize) % data.length] = elem;
        currSize++;
	}

	/**
	 * Dequeues the element from the queue
	 * @return element that was dequeued
	 */
	public int dequeue() {
		int retval = data[head];
		// FILL IN CODE:
        if (currSize == 0) {
            throw new NoSuchElementException();
        }
        head = (head + 1) % data.length;
        currSize--;
		return retval;
	}

	/**
	 * Check if the queue is empty
	 * @return true if the queue is empty and false otherwise
	 */
	public boolean empty() {
		// FILL IN CODE
		return (currSize == 0); // change
	}

    /**
	 * Return a string representation of the queue
	 * @return string
	 */
	public String toString() {
		String result = "[";
		int tmpHead = head;
		int count = 0;
		while (count < currSize) {
			result = result + data[tmpHead];
			if (count < currSize - 1)
				result = result + ",";
			tmpHead = (tmpHead + 1) % data.length;
			count++;
		}
		result = result + "]";
		return result;
	}

}
