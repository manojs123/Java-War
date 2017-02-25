package warm_up;
// Decimal to roman

import java.util.Scanner;

public class Dec_to_Roman 
{

	public static void main(String[] args) 
	{
		System.out.println("Please Enter a Number less than 40:");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		String ten[]={"","X","XX","XXX"};
		String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		int t=(a/10)%10;
		int u=a%10;
		
		System.out.println("Roman Equivalent =" +ten[t]+unit[u]);
		scan.close();
	}
		
		
		
		
}


