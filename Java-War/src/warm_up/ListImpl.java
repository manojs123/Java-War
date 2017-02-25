package warm_up;
//List Implementation


import java.util.ArrayList;
import java.util.Scanner;

public class ListImpl
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Please Enter Number of Values:");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		if(n==0)
		{
			System.out.println("Good Bye");
		}
		else
		{
			System.out.println("Please Enter Values:");
			for(int i=0;i<n;i++)
			{
				
				list.add(scan.nextInt());
				
			}
			System.out.println("Values in Your List:"+list);
			
		}
	
				
		boolean d;
		if(d=list.isEmpty())
		{	
			System.out.println("List is Empty?");
			System.out.println(d);;
		}
		else
		{
			System.out.println("Please enter a number to be found:");
			
			int f=scan.nextInt();
			boolean z = list.contains(f);
			System.out.println(z);
				
		}
		
		scan.close();
		
	}
	

}
