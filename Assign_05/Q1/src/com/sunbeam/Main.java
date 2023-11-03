package com.sunbeam;

public class Main {

	public static void main(String[] args) 
	{
      
		List l1=new List();
		l1.addLast(10);
		l1.addLast(20);
		l1.addLast(30);
		l1.addLast(40);
		System.out.println("display all add last");
		l1.displayAll();
		System.out.println(" count="+l1.count);
		System.out.println("");
		System.out.println("add first");
		l1.addFirst(50);
		l1.displayAll();
		System.out.println(" count="+l1.count);
		System.out.println("");
		System.out.println("add position");
        l1.addPosition(60,10);
        l1.displayAll();
		System.out.println(" count="+l1.count);
		System.out.println("");
		System.out.println("del last");
		l1.delLast();
		l1.displayAll();
		System.out.println(" count="+l1.count);
		System.out.println("");
		System.out.println("del first");
		l1.delFirst();
		l1.displayAll();
		System.out.println(" count="+l1.count);
		System.out.println("");
		System.out.println("del position");
		l1.delposition(3);
		l1.displayAll();
		System.out.println(" count="+l1.count);
		
		
		

	}

}
