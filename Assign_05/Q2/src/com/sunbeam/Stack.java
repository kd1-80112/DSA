package com.sunbeam;

public class Stack 
{
 private List l1;
 public Stack()
 {
	 l1=new List();
 }
 
 public void push(int value)
 {
	 l1.addLast(value);
 }
 public void pop()
 {
	 l1.delLast();
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
