package week2;

import java.util.Scanner;

public class Sorts 
{
	 public static void insertionSort(int a[]) 
	 {
	        int n = a.length;
	        for (int j = 1; j < n; j++) 
	        {
	            int key = a[j];
	            int i = j-1;
	            while ( (i > -1) && ( a[i] > key ) ) 
	            {
	                a[i+1] = a[i];
	                i--;
	            }
	            a[i+1] = key;
	            display(a);
	        }
	    }
	 	
	public static void selectionSort(int[] x)
	{
		for (int i=0; i<x.length-1; i++) 
		{
			for (int j=i+1; j<x.length; j++) 
			{
				if (x[i] > x[j])  //swap Elements 
				{
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			display(x);
		}
	}
	
	public static void bubbleSort(int a[])
	{
		int n = a.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			display(a);
	}
	private static void display(int[] input) 
	 {
		 for (int i = 0; i < input.length; i++) 
		 {
	            System.out.print(input[i] + ", ");
	        }
	        System.out.println("\n");
	 }
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Number of Values");
		int n=s.nextInt();
		int[] a =new int[n];
		System.out.println("Please Enter Values to be Sorted");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Choose Sorting Technique :\n");
		System.out.println("1 : Insertion Sort");
		System.out.println("2 : Selection Sort");
		System.out.println("3 : Bubble Sort");
		System.out.print("\nYour Choice : ");
		int choice = s.nextInt();
		switch(choice)
		{
		case '1': insertionSort(a);
				 // display(a);
				  break;
		case '2': selectionSort(a);
				  //display(a);
				  break;
		case '3': bubbleSort(a);
				  //display(a);
				  break;
				  
		}
		s.close();	
		}
		
	}
	
	