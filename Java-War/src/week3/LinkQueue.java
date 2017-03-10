package week3;

public class LinkQueue 
{

		LinkedList newLinkList = new LinkedList();

	    public void enqueue(int data) 
	    {
	        newLinkList.add(data);
	    }

	    public void dequeue() 
	    {
	        if(!newLinkList.isEmpty())
	            newLinkList.remove();
	    }

	    public void displayQueue() 
	    {
	        newLinkList.printList();
	        System.out.println();
	    }

	    public boolean isEmpty(){
	        return newLinkList.isEmpty();
	    }
}
