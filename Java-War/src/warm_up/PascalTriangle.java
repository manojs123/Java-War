package warm_up;
//Pascal Triangle

import java.util.Scanner;

public class PascalTriangle {

	public static void PT(int n)
	{
		int[] PR;
		int[] CR={1};
		display(CR);
		PR=CR;
		for(int i=2;i<=n;i++)
		{
			CR=new int[i];
			CR[0]=1;
			CR[i-1]=1;
			for(int j=0;j<=i-3;j++)
			{
				CR[j+1]=PR[j]+PR[j+1];
			}
			display(CR);
			PR=CR;
		}
		
	}
	
	public static void display(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+ " ");
		}
		System.out.print("");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please Enter a level:");
		Scanner x=new Scanner(System.in);
		int p=x.nextInt();
		PT(p);
		x.close();
	}
	
}

