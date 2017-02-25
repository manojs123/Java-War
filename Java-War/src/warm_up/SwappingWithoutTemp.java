package warm_up;
//Swapping two numbers without temp

import java.util.Scanner;

public class SwappingWithoutTemp {

	public static void main(String[] args)
	{
		System.out.println("Please Enter First NUmber");
		Scanner in=new Scanner(System.in);
		int a =in.nextInt();
		System.out.println("Please Enter Second NUmber");
		Scanner inn=new Scanner(System.in);
		int b =inn.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		
		in.close();
		inn.close();
	}

}
