package week3;

public class QueueImplementation {

	public static void main(String[] args)
	{
		    LinkQueue queueImpl = new LinkQueue();

	        queueImpl.enqueue(1);
	        queueImpl.enqueue(2);
	        queueImpl.enqueue(3);
	        queueImpl.enqueue(4);
	        queueImpl.displayQueue();
	        queueImpl.dequeue();
	        queueImpl.enqueue(7);
	        queueImpl.enqueue(8);
	        queueImpl.displayQueue();
	        queueImpl.dequeue();
	        queueImpl.displayQueue();

	    }

	}