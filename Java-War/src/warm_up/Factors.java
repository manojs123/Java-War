package warm_up;
//Factors of a given number 

import java.util.Scanner;

public class Factors {

	public static void main(String[] args)
	{
		System.out.println("Please Enter a Number");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		for(int i=1;i<=a;i++)
		{
			int x=a%i;
			if(x==0)
			{
				
				System.out.println(i);
			}
		}in.close();
		

	}

}
