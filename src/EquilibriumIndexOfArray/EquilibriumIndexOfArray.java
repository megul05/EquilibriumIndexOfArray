package EquilibriumIndexOfArray;

import java.util.Scanner;

public class EquilibriumIndexOfArray {
	
	public static int EquilibriumIndex(int[] arr,int size)
	{
		int[] array = new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum += arr[i];
			array[i] = sum;
		}
		
		for(int i=1;i<size;i++)
		{
			array[i] = array[i-1]+arr[i];
		}
		for(int i=1;i<size;i++)
		{
			if(array[i-1] == array[size-1]-array[i])
			{
				return i;
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Size of the Array :");
		int number = scan.nextInt();
		System.out.println("Enter elements of the Array :");
		int[] arr = new int[number];
		for(int i =0;i<number;i++)
		{
			arr[i]=scan.nextInt();
		}
		int size = arr.length;
		int result =  EquilibriumIndex(arr,size);
		System.out.println(result);

	}

}
