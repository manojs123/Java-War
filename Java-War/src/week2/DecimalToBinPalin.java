package week2;

import java.util.Scanner;

public class DecimalToBinPalin {

	public static void main(String[] args) 
	{
				System.out.println("Enter Number");
				Scanner s = new Scanner(System.in);
				int x=s.nextInt();
				StringBuilder a=new StringBuilder();
				
				while(x>0)
				{
					int y=x%2;
					a.append(y);
					x=x/2;
				}
				
				String st=a.toString();
				
				String str;
				str=a.reverse().toString();
				System.out.println("Binary Value of a Given Decimal Number:"+str);
				System.out.println("Reverse of the Binary Value:"+st);
				
				if(st.equals(str))
				{
					System.out.println("PALIN");
				}
				else
				{
					System.out.println("Not A Palin");
				}
				s.close();
	}
}
	