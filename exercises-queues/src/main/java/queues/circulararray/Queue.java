package queues.circulararray;

public interface Queue {
	void enqueue(int elem);
	int dequeue();
	boolean empty();
}