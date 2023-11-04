package com.sunbeam;

import java.util.Scanner;

public class NonRepeatingEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		for (Integer i : arr) {
			System.out.print(" " + i);

		}

		System.out.println();
		System.out.println("first non reapiting element is="+nonrepeating(arr));

	}

	public static int nonrepeating(int[] arr) 
	{
		int count = 0;
		int nonr = 0;
		for (int i = 0; i < arr.length; i++) {
			count=0;
			for (int j = 0; j < arr.length; j++) 
			{
				if (arr[i] == arr[j]) {
					count++;

					if (count > 1)
					{
						break;
					}

				}

			}
            if(count==1)
            {
            	return arr[i];
            }
		}

		return -1;

	}
}
