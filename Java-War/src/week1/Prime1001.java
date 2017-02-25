package week1;

public class Prime1001 
{

	public static void main(String[] args)
	{
		int prime=1;
		int i=2;
		while(prime<=10001)
		{
			if(isPrime(i))
			{
				i++;
				prime++;
			}
			else
				i++;
		}
		System.out.println("10001 Prime Number is:" +(i-1));
	}
	
private static boolean isPrime(int n)
{
	if ((n % 2 == 0)&&(n != 2))
		return false;	
	
	for (long i = 3; i <= (n^(1/2)+1); i=i+ 2)	// Trying to skip all the even numbers
	{
		if (n % i == 0)
			return false;	
	}
	return true;
}
}