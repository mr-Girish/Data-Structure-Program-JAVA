class Node {
    int data; // data part of node
    Node next; // address part of node

    Node CreationLinkedlist(int d, Node head) // function for creation of linked list
    {
        Node newnode = new Node(); // creating a new node
        newnode.data = d; // data part of the node
        newnode.next = null; // address part of the node

        if (head == null) {
            head = newnode;
            return head;
        }
        Node temp = head; // creating a temporary variable
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        return head;

    }
    Node InsertAtFirst(int d,Node head) // function for insert node at first
    {
        Node newnode=new Node();  //creating the node
        newnode.data=d;
        newnode.next=null;
        newnode.next=head;
        head=newnode;
        return head;

    }

    void DisplayLinkedList(Node head) /// this functions is for display the whole linkedlist
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " "); // we have to access/print the part of data part
            temp = temp.next; // point next address
        }
    }
}

public class InsertAtFirst {
    public static void main(String[] args) {
        Node obj = new Node(); // object of class
        Node head = null; // creatin the null part
        // creatin the node value;
        int d = 20;
        head = obj.CreationLinkedlist(d, head); // calling the function and passing datapart and next part

        // for second node
        d = 30;
        head = obj.CreationLinkedlist(d, head);

        d = 40;
        head = obj.CreationLinkedlist(d, head);

        d = 50;
        head = obj.CreationLinkedlist(d, head);
        System.out.println("this is linked list");
        obj.DisplayLinkedList(head); 
        System.out.println(); // calling the Display function which will display your whole linkedlist
        System.out.println("after insertin the node at First the Linked list is;");
        
        // this is the  node to be inserted at First 
        d=90;
        head=obj.InsertAtFirst(d, head);
        obj.DisplayLinkedList(head);
    }
}
