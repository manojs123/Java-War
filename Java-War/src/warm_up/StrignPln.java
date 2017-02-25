package warm_up;
//String is Palindrome or not

import java.util.Scanner;

public class StrignPln {

	public static void main(String[] args)
	{
		System.out.println("Please Enter a String");
		Scanner s=new Scanner(System.in);
		StringBuffer x= new StringBuffer();
		String y="";
		String z="";
		z=x.append(s.nextLine()).toString();
		y=x.reverse().toString();
		System.out.println(z);
		System.out.println(y);
		
		if(z.equals(y))
		{
			System.out.println("Entered String is a Palindrome");
		}
		
		else
			System.out.println("Not a Palindrome");
		s.close();
	}

}
