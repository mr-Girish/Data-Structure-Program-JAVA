class Node{
    int data;
    Node next;
    // this function is for creation of the linked list
    Node creation(int d, Node head)
    {
        Node newnode=new Node();
        newnode.data=d;
        newnode.next=null;

        if(head==null)
        {
            head=newnode;
            return head;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    // this function is for reverse a linked list
    Node ReverseLinkedList(Node head)
    {
        Node current=head;
        Node previous=null;
        while(current!=null)
        {
            Node temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
            
        }
        return previous;
    } 

    // this funciton is for Display the linked list
    void DisplayLinkedList(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class ReverseOfLinkedList {
    public static void main(String[] args) {
        Node obj=new Node();
        Node head=null;
        int d=20;
        head=obj.creation(d, head);

         d=30;
        head=obj.creation(d, head);

         d=40;
        head=obj.creation(d, head);

         d=50;
        head=obj.creation(d, head);
        System.out.println("Linked List is:");
        obj.DisplayLinkedList(head);
        System.out.println();

        System.out.println("REverse of Linked list iss:");
        head=obj.ReverseLinkedList(head);  //calling the reverse function
        obj.DisplayLinkedList(head);
    }    
}
