package com.sunbeam;

import java.util.Scanner;

public class Main_01 {

	public static void main(String[] args) 
	{
		Program_01 p1=new Program_01();
		
		int[] arr= {10,20,30,40,50};
		
	    System.out.println("enter key");
	    int key=new Scanner(System.in).nextInt();
	    int size=arr.length;
//	    p1.linearSearch(arr,key,size);
        System.out.println(p1.binarySearch(arr,key,size));
	    
	    
	    
	    
	    	    

	
	}


}
