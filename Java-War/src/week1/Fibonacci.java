package week1;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a=1;
		int sum=0;
		int total=0;
		int b=2;
		System.out.println(a);
		System.out.println(b);
		while(true)
		{
			int c=a+b;
			a=b;
			b=c;
			if(c<4000000)
			{
				sum=sum+c;
				
				if(c%2==0)
				{
					total=total+c;
				}
			}
			else
				break;
			System.out.println(c);
		}
		total=total+2;
		System.out.println("Sum of Even Valued Number's:"+total);
			
	}

}
