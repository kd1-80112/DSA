/*1. Write a program to print no of comparisions done to search a key in
	i. linear search
	ii. binary serach
*/

package com.sunbeam;

public class Program_01 {
	public void linearSearch(int[] arr, int key, int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if (key == arr[i]) {
				System.out.println("key is found at " + i);
				System.out.println("no of comaprisinon in linear search    " + count);
			}

		}

	}

	public int binarySearch(int[] arr, int key, int size) {
		int left = 0;
		int right = size - 1;
		int count=0;
		while (left <= right) 
		{
			count ++;
			int mid = (left + right) / 2;
			if (key == arr[mid]) 
			{
				System.out.println("count="+count);
             return mid; 
			}
			if (key> arr[mid]) 
			{
             left=mid+1;
			}
			if (key< arr[mid]) 
			{
             right=mid-1;
			}
		}
		return -1;

	}
}
