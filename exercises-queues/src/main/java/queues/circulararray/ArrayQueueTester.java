package queues.circulararray;

public class ArrayQueueTester {
	static void main(String[] args) {
		System.out.println();
		System.out.println("Circular array implementation of the queue");
		Queue queue2 = new ArrayQueue(4);
		queue2.enqueue(5);
		queue2.enqueue(1);
		queue2.enqueue(2);
		System.out.println(queue2);
		System.out.println("Dequeued: " + queue2.dequeue());
		System.out.println(queue2);
		System.out.println("Dequeued: " + queue2.dequeue());
		System.out.println(queue2);
		System.out.println("Dequeued: " + queue2.dequeue());
		System.out.println(queue2);


	}
}
