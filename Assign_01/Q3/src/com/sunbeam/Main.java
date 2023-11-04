package com.sunbeam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	
		DescBinarySearch dbs=new DescBinarySearch();
		
		int[] arr= {50,40,30,20,10};
		
	    System.out.println("enter key");
	    int key=new Scanner(System.in).nextInt();
	    int size=arr.length;
//	    p1.linearSearch(arr,key,size);
        System.out.println(dbs.BinarySearch(arr,size,key));
	}

}
