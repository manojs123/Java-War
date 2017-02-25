package week1;

public class Factors {

	public static void main(String[] args)
	{
		long start = System.currentTimeMillis();
		int j=0;
		int n=0;
		int numberOfDivisors=0;
		while(numberOfDivisors<=500)
		{
			numberOfDivisors = 0;
            j++;
            n = factors(j);
            
            for (int i = 1; i <= Math.sqrt(n); i++)
                if (n % i == 0)
                    numberOfDivisors++;
            
            numberOfDivisors *= 2;
        }
		System.out.println(n);
		long finish = System.currentTimeMillis();
        System.out.println("Time taken: " + (finish - start));
	}

public static int factors(int n) 
{
        int count = 0;
        for (int i = 1; i <= n; i++) 
        {
            count=count+i;
        }
        return count;

}

}
