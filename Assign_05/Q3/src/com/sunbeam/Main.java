package com.sunbeam;

public class Main {

	public static void main(String[] args) {
//		List l1=new List();
//		l1.addLast(10);
//		l1.addLast(20);
//		l1.addLast(30);
//		System.out.println("add last");
//		l1.displayAll();
//		System.out.println(" count="+l1.count);
//		System.out.println("");
//		System.out.println("add first");
//		l1.addFirst(40);
//		l1.displayAll();
//		System.out.println(" count="+l1.count);
//		System.out.println("");
//		System.out.println("del last");
//		l1.delLast();
//		l1.displayAll();
//		System.out.println(" count="+l1.count);
//		System.out.println("");
//		System.out.println("del first");
//		l1.delFirst();
//		l1.displayAll();
//		System.out.println(" count="+l1.count);
//		System.out.println("peek="+l1.getelement());
//		
		
		Deque d1=new Deque();
		d1.addLast(10);
		d1.addLast(20);
		d1.addLast(30);
		System.out.println("add last");
		d1.display();
		
		d1.addFirst(40);
		d1.addFirst(50);
		System.out.println();
		System.out.println("add first");
		d1.display();
		
		System.out.println("");
		System.out.println("del first");
		d1.delFirst();
		d1.display();
		System.out.println("");
		System.out.println("del last");
		d1.delLast();
		d1.display();
		
		

	}

}
