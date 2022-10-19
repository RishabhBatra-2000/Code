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
  
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println("\nLink list ^\n");
    }
  
    public void insert_at_front(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insert_after(Node prev_node, int new_data) {

        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }
    
    public void insert_at_end(int new_data) {
        Node new_node = new Node(new_data);
    
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
   
        new_node.next = null;
   
        Node last = head;
        while (last.next != null)
            last = last.next;
  
        last.next = new_node;
        return;
    }
    
    public void delete_at_pos(int position)
    {

        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next = temp.next.next;
        temp.next = next; 
    }
    
    public void delete_at_end() {
        if (head == null){
            System.out.println("Link list cannot be empty.");
        }
        
        Node temp = head;
        
        while (temp.next != null) {
            temp = temp.next;
		}
		temp.next = null;
    }
    
    public void delete_at_start(){
        if(head == null){
            System.out.println("list empty");
        }
        
        Node temp = head;
        head = head.next;
        temp = null;
        
    }
    
    public static void main(String[] args)
    {

        LinkedList llist = new LinkedList();
  
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
  
        llist.head.next = second; 
        second.next = third;

        System.out.println("\n");
        llist.printList();

        llist.insert_at_front(77);
        llist.printList();
        llist.insert_after(second,66);
        llist.printList();
        llist.insert_at_end(900);
        llist.printList();
        llist.delete_at_pos(5);
        llist.printList();
        llist.delete_at_end();
        llist.printList();
        llist.delete_at_start();
        llist.printList();
    }
}
