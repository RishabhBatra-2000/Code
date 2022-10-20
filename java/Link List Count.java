// Traversal and count of elements in the link list

class LinkedList {
	Node head; 
	
	static class Node {
		int data;
		Node next;
		Node(int d)
		{
			this.data = d;
			next = null;
		} 
	}
	public void printList()
	{   
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.println("\n");
		System.out.print("Linked List ^");
	}

	public int getcount()
	    {
		Node temp = head;
		int count = 0;
		while (temp != null) {
		    count++;
		    temp = temp.next;
		}
		return count;
	    }
	
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();

		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

		llist.head.next = second;
		second.next = third; 

        	System.out.println("Elements present in the list = "+ llist.getcount());
		llist.printList();

	}
}
