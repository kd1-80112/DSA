package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(10);
		l1.display();
		System.out.println("");
		System.out.println(l1.count);
		System.out.println("-----");
		l1.addLast(20);
		l1.display();
		System.out.println("");
		System.out.println(l1.count);
		System.out.println("-----");
		l1.addLast(40);
		l1.display();
		System.out.println("");
		System.out.println(l1.count);
		System.out.println("-----");
		l1.addPosition(30, 0);
		l1.addPosition(50, 0);
		l1.addPosition(60, 7);
		l1.display();
		System.out.println("");
		System.out.println(l1.count);
		System.out.println("-----");
	}

}
