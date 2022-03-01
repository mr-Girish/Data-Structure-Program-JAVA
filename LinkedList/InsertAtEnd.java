class Node{
    int data;
    Node next; 
    Node creation(int d,Node head)
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

    Node insertATEnnd(int d,Node head)
    {
        Node newnode=new Node();
        newnode.data=d;
        newnode.next=null;
        if(head==null)
        {
            head=newnode;           // creation of linkedlist and add node at last both are same
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

public class InsertAtEnd {
    public static void main(String[] args) {
            Node obj=new Node();
            Node head=null;
            int d=30;
            head=obj.creation(d, head);

             d=40;
            head=obj.creation(d, head);

             d=50;
            head=obj.creation(d, head);
             d=60;
            head=obj.creation(d, head);
            System.out.println("the Linked list is:");
            obj.DisplayLinkedList(head);
            System.out.println();
            System.out.println("after insert node at End the linked list is:");
            d=980;
            head=obj.insertATEnnd(d,head);
            obj.DisplayLinkedList(head);
    }
}
