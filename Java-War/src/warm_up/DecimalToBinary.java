package warm_up;
//Decimal to binary

import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Number to be Converted to Binary");
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		StringBuffer a=new StringBuffer();
		
		while(x>0)
		{
			int y=x%2;
			a.append(y);
			x=x/2;
		}
		
		System.out.println(a.reverse());
		s.close();
	}
}
