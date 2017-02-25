package warm_up;
//Multiplication and Division Using Addition & Subtraction

import java.util.Scanner;

public class MulUsingAddSub 
{
	public static void main(String[] args)
	{
		int c=0;
		System.out.println("Please Enter a Number:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		System.out.println("Please Enter a Number:");
		Scanner scan1 = new Scanner(System.in);
		int b = scan.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=0;i<b;i++)
		{
			c+=a;
		}
		System.out.println("A*B=" +c);
		
		int i=0;
		try
		{
			while(a>=b)
			{
				a=a-b;
				i++;
			}
			System.out.println("Qoutient is:" +i);
			System.out.println("Remainder is:" +a);
		}
		catch(Exception e) 
		{
			System.out.println("Divide By Zero Exception");
		}
		scan.close();
		scan1.close();
		
	}
}
