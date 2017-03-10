package week3;

public class LinkedStack 
{

	LinkedList linkedList=new LinkedList();
		
	public void push(int data) 
	{
	    linkedList.add(data);
	}
	public void pop() 
	{
	    if(!linkedList.isEmpty())
	    {
		    linkedList.removeAtEnd();
		}
	}
	public void displayStack() 
	{
		    System.out.println("  ");
		    linkedList.printList();
	}
}
