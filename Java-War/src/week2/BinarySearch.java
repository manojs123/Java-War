package week2;

import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Number of elements");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Please Enter Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Please Enter Number to be Searched");
		int x=scan.nextInt();
		scan.close();
		binary(a, x);
	}


public  static void binary(int[] a,int x)
{
	int first  = 0;
    int last   = a.length - 1;
    int middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( a[middle] < x )
        first = middle + 1;    
      else if ( a[middle] == x ) 
      {
        System.out.println(x + " found at location " + (middle + 1));
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(x + " is not present in the list.\n");

}

}