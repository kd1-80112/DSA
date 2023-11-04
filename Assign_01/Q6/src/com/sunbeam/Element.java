/*to find rank of an element in a stream of integers.
rank: rank of a given integer "x",
 in stream is "total no. of ele's less than or equal to x (including x).
	
	Input: { 10, 20, 15, 3, 4, 4, 1 }
	Ouput: Rank of 4 is: 4
*/

package com.sunbeam;

import java.util.Scanner;

public class Element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("enter number=");
		int num = sc.nextInt();
		
		System.out.println(ele(arr,num));

	}

	public static int ele(int[] arr, int num) 
	{
		int count=0;
		for (int i = 0; i < arr.length; i++) 
		{
			
			if(arr[i]>=num)
			{
			count++;
			}
			
		}
		return (count);
	}
}