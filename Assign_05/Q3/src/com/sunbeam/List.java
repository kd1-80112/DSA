package com.sunbeam;

public class List 
{
	public class node
	{
     private int data;
     private node next;
     private node prev;
	
	 public node(int value)
	 {
		data=value;
		next=null;
		prev=null;
	 	
	 }
	}
	private node head;
	private node tail;
	public int count;
	public List()
	{
		head=null;
		tail=null;
		count=0;
	}
 
	public boolean isEmpty()
	{
		return head==null && tail==null;
	}
	
	public void addLast(int value)
	{
		node newnode=new node(value);
		if(isEmpty())
		{
		  head=newnode;
		  tail=newnode;
		}
		else 
		{
			newnode.prev=tail;
			newnode.next=head;
			head.prev=newnode;
			tail.next=newnode;
			tail=newnode;
		}
		count++;
	}
	
	public void addFirst(int value)
	{
		node newnode=new node(value);
		if(isEmpty())
		{
			head=newnode;
			tail=newnode;
			head.next=head;
			head.prev=head;
		}
		else
		{
			newnode.prev=tail;
			newnode.next=head;
			tail.next=newnode;
			head.prev=newnode;
			head=newnode;
		}
		count++;
	}
	public void delLast()
	{
		if(isEmpty())
		{
			System.out.println("list is empty");
		}
		else if(head.next==tail)
		{
			head=tail=null;
		}
		else
		{
			tail.prev.next=head;
			head.prev=tail.prev;
			tail=tail.prev;
		}
		count--;
	}
	
	public void delFirst()
	{
		if(isEmpty())
		{
			System.out.println("list is empty");
		}
		else if(head.next==tail)
		{
			head=tail=null;
		}
		else
		{
			head.next.prev=tail;
			tail.next=head.next;
			head=head.next;
		}
		count--;
	}
	public int getelement()
	{
		return head.data;
	}
	public void displayAll()
	{
		if(isEmpty())
		{
			System.out.println("list is empty");
			
		}
		else
		{
			node trav=head;
			do
			{
				System.out.print(" "+trav.data);
				trav=trav.next;
			}while(trav!=head);
		}
	}
	
}
