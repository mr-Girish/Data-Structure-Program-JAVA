package LinkedListt;

import java.util.Scanner;

class Node
{
	int data; // data part
	Node next; // here created object type as Node
	
	Node insertEnd(int d,Node head)
	{
		Node newnode = new Node();
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
	void display(Node head){
		Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
	}
	
	
}

public class CreationofLinkedlist {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Nodes:");
		int n=sc.nextInt();
		
		Node head=null; //create a head type as node
		Node obj=new Node(); //creatinng obj of node class
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the element to be inserted");
			int d=sc.nextInt();
			head=obj.insertEnd(d,head); //calliing a function
		}
			
			
			
//			
//			
//			 d=100;
//			head=obj.insertEnd(d,head); //calliing a function
//			
//			 d=130;
//			head=obj.insertEnd(d,head); //calliing a function
			
			
			obj.display(head);
		
	}

}
