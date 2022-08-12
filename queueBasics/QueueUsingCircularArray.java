package queueBasics;

public class QueueUsingCircularArray {

	int front, rear;
	int a[];
	int n;
	
	public QueueUsingCircularArray(int n) {
		front = rear = -1;
		a = new int[n];
		this.n = n;
	}
	
	void enqueue(int data) throws Exception {
		if(isFull()) throw new Exception("Queue Array is Full");
		if(isEmpty()) {
			front = 0;
		}
		rear = (rear+1)%n;
		a[rear] = data;
	}
	
	int dequeue() throws Exception {
		if(isEmpty()) throw new Exception("Queue Array is Empty");
		if(front == rear) { // to check if one element only
			int ans = a[front];
			front = -1;
			rear = -1;
			return ans;
		}
		int ans = a[front];
		front = (front+1) % n;
		return ans;
	}
	
	int getSize() {
		return isEmpty() ? 0 : (n-front+rear) % n + 1;
	}
	
	private boolean isFull() {
		return (rear+1) % n == front;
	}
	
	boolean isEmpty() {
		return front == -1;
	}
}
