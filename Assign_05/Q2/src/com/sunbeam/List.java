package com.sunbeam;

public class List 
{
  public class node
  {
	  private int data;
	  private node next;
	  
	  public node(int value)
	  {
		  data=value;
		  next=null;
	  }
  }
  private node head;
  public int count;
  
  public List()
  {
	  head=null;
	  count=0;
  }
  
  public boolean  isEmpty()
  {
	  return head==null;
  }
  
  public void addLast(int value)
  {
	  node newnode=new node(value);
	  if(isEmpty())
	  {
		  head=newnode;
	  }
	  else
	  {
		  node trav=head;
		  while(trav.next!=null)
		  {
			  trav=trav.next;
		  }
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
	  else if(head.next==null)
	  {
		  head=null;
	  }
	  else
	  {
		  node trav=head;
		  while(trav.next.next!=null)
		  {
			  trav=trav.next;
			  
		  }
		  trav.next=null;
	  }
	  count--;
  }
  
  public void delFirst()
  {
	  if(isEmpty())
	  {
		  System.out.println("list is empty");
	  }
	  else if(head.next==null)
	  {
		  head=null;
	  }
	  else
	  {
		  head=head.next;
	  }
  }
  public int getelement()
  {
	  if(isEmpty())
	  {
		  System.out.println("list is empty");
	  }
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
		  while(trav!=null)
		  {
			  System.out.print(" "+trav.data);
			  trav=trav.next;
		  }
	  }
  }
 }
  
  
  
  
  

