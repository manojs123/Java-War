package week3;

public class LinkedList 
{
	private static Node head;

	private int size;

	public LinkedList() {
		head = new Node();
		head.setLink(null);

		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public int getSize() {
		return this.size;
	}

	public void clearList() {
		head.setLink(null);
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (size == 0) {
			head.setLink(newNode);
			newNode.setLink(null);
			size++;
		} else {
			Node temp = head.getLink();
			Node currentNode = temp;
			while (temp != null) {
				currentNode = temp;
				temp = temp.getLink();
			}
			currentNode.setLink(newNode);
			newNode.setLink(null);
			size++;
		}
	}

	public void removeAtEnd() {

		if (size == 0) {
			System.out.println("List is empty");

		} else {
			
			Node current = head;
			Node link = head.getLink();
			while (link != null) 
			{
				current = link;
				link = link.getLink().getLink();
			}
			current.setLink(null);
		}

	}
	
	public Node insert(Node head, int data, int position) 
	{
		Node newNode = new Node();
	    newNode.data = data;
	    newNode.link = null;

	    if(head == null && position != 0) 
	    {
	        return head;
	    } 
	    else if(head == null && position == 0) 
	    {
	        head = newNode;
	        return head;
	    }
	    if(position == 0) 
	    {
	        newNode.n = head;
	        head = newNode;
	        return head;
	    }

	    Node current = head;
	    Node previous = null;
	    int i = 0;

	    for(i = 0; i < position; i++) {
	        previous = current;
	        current = current.link;
	        if(current == null)
	            break;
	    }

	    newNode.link = current;
	    previous.link = newNode;
	    size++;
	    return head;

	}
	
	void deleteNode(int position)
    {
        if (head == null)
            return;
 
        Node temp = head;
 
        // If head needs to be removed
        if (position == 0)
        {
            head = temp.link;   // Change head
            return;
        }
 
        for (int i=0; temp!=null && i<position-1; i++) // Finding the previous node of the node to be deleted
            temp = temp.link;
 
        if (temp == null || temp.link == null)
            return;
 
        Node next = temp.link.link;  // Node temp->next is the node to be deleted
        							// Store pointer to the next of node to be deleted
 
        temp.link = next;  
     }
	
	 public boolean search(Node head, int x)
	    {
	        Node current = head;    //Initialize current
	        while (current != null)
	        {
	            if (current.data == x)
	                return true;    //data found
	            current = current.link;
	        }
	        return false;   //data not found
	    }

	public void printList() {
		if (size == 0)
			System.out.println("List is Empty");
		else {
			Node temp = head.getLink();
			System.out.println("Size of List is:\t" + size);
			while (temp != null) {
				System.out.println(temp.getData() + "->");
				temp = temp.getLink();
			}
		}
	}
	

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.printList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.printList();
		list.insert(head, 5, 1);
		list.printList();
		list.deleteNode(3);
		list.search(head, 7);
		list.insert(head, 7, 5);
		list.removeAtEnd();
		//list.removeAtEnd();
		list.printList();
		
	}

}