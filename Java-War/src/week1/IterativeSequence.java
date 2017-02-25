package week1;


public class IterativeSequence 
{

	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		long max = 0, num = 0;
			for (long i = 1; i < 1000000; i++)
		    {
				if (Is(i) > max)
		        {
					max = Is(i);
		            num = i;
		           }
		      }
		      System.out.println(num);
		      long finish = System.currentTimeMillis();
		      System.out.println("Time taken: " + (finish - start));
		   }
	
public static long Is (long n)
{
	long count = 0;
	while (n != 1)
	{
		if (n % 2 == 0)
               n = n / 2;
        else
        	
        	n = 3 * n + 1;
		count++;
    }
	return count;
}
}
		
		