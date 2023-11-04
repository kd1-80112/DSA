package com.sunbeam;

public class DescBinarySearch 
{

	public int BinarySearch(int[] arr,int size,int key)
	{
		int left=0;
		int right=size-1;
	
				
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			if(arr[mid]>key)
				left=mid+1;
			
			
			if(arr[mid]<key)
			{
				right =mid-1;
			}
		}
			
		return -1;
		
	}


	}

