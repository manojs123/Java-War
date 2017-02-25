package week1;

public class Prime 
{

	public static void main(String[] args)
	{
		int i;
		long sum=0;
		
		for(i=2;i<=2000000;i++)
		{
			if(isPrime(i)==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}	
private static int isPrime(int n)
{
			int i;
			for (i = 2; i <= Math.sqrt(n); i++) // to skip all calculations  
			{
				if (n % i == 0)
				{
					return 0;
				}
				
			}
			return 1;
}
		
		
	}


