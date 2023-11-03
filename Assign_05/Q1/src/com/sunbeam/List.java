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
public int count;

public List()
{
	head=null;
	count=0;
}
public boolean isEmpty()
{
	return head==null;
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
			System.out.print(" "+trav.data+"->");
			trav=trav.next;
		}while(trav!=head);
	}
}

public void addLast(int value)
{
	node newnode=new node(value);
	if(isEmpty())
	{
	  head=newnode;
	  head.next=newnode;
	  head.prev=newnode;
	}
	else
	{
		newnode.next=head;
		newnode.prev=head.prev;
		head.prev.next=newnode;
		head.prev=newnode;
	}
	count++;
}
public void addFirst(int value)
{
	node newnode=new node(value);
	if(isEmpty())
	{
		  head=newnode;
		  head.next=newnode;
		  head.prev=newnode;
		
    }
	else
	{
		newnode.next=head;
		newnode.prev=head.prev;
		head.prev.next=newnode;
		head=newnode;
	}
	count++;
}
public void addPosition(int value,int pos)
{
	node newnode=new node(value);
	if(isEmpty())
	{
		head=newnode;
		head.prev=newnode;
		head.next=newnode;
	}
	else if(pos<=1)
	{
	
			addFirst(value);
			return;
	}
	else if(pos>=count)
		{
			addLast(value);
			return;
		}
		else
		{
			node trav=head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
			}
			newnode.prev=trav;
			newnode.next=trav.next;
			trav.next.prev=newnode;
			trav.next=newnode;
			
			
		}
	   count++;
	}
	public void delLast()
	{
		if(isEmpty())
		{
			System.out.println("list is empty");
		}
		else if(head.next==head)
		{
			head=null;
			
		}
		else
		{
			node trav=head;
			do
			{
				trav=trav.next;
			}
			while(trav.next.next!=head);
			trav.next=head;
			head.prev=trav;
		}
			count--;
	}
	public void delFirst()
	{
		if(isEmpty())
		{
			System.out.println("list is empty");
		}
		else if(head.next==head)
		{
			head=null;
		}
		else
		{
		  head.prev.next=	head.next;
		  head.next.prev=head.next;
		  head=head.next;
		}
		count--;
	}
	public void delposition(int position)
	{
		if(isEmpty())
		{
			System.out.println("list is empty");
		}
		else if(position<=1)
		{
			delFirst();
			return;
		}
		else if(position>=count)
		{
			delLast();
			return;
		}
		else
		{
			node trav=head;
			for(int i=1;i<position;i++)
			{
				trav=trav.next;
			}
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
		}
		count--;
	}
	    
}









