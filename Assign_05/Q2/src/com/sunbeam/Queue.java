package com.sunbeam;

public class Queue 
{
  private List l1;
  
  public Queue()
  {
	  l1=new List();
	  
  }
   public void push(int value)
   {
	   l1.addLast(value);
   }
   public void pop()
   {
	   l1.delFirst();
   }
   public int peek()
   {
	   return l1.getelement();
   }
   public void display()
   {
	   l1.displayAll();
   }
}
