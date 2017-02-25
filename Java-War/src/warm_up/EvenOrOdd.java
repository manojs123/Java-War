package warm_up;
//Even or Odd & Add & Sub Using XOR

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) 
	{
		System.out.println("Please Enter a Number A:");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		
		System.out.println("Please Enter a Number B:");
		Scanner inn=new Scanner(System.in);
		int b=inn.nextInt();
		
		System.out.println(a=a^b);
		System.out.println(b=a^b);
		System.out.println(a=a^b);
		
		if((a&1)==0)
		{
			System.out.println("A is EVEN");
		}
		
		else
		{
			System.out.println("A is ODD");
		}
		if((b&1)==0)
		{
			System.out.println("B is EVEN");
		}
		else
		{
			System.out.println("B is ODD");
		}
		
		System.out.println("Elements Before Swappping");
		System.out.println("A:" +a);
		System.out.println("B:" +b);
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("Elements After Swappping");
		System.out.println("A:" +a);
		System.out.println("B:" +b);
		
		in.close();
		inn.close();
		
		
			
		
	}

}
