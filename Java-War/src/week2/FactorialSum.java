package week2;

public class FactorialSum {

	public static void main(String[] args) 
	{
		int result = 0;
		for (int i = 10; i < 3000000; i++) {
		    int sum = 0;
		    int n = i;
		    while (n > 0) 
		    {
		        int d = n % 10;
		        n /= 10;
		        sum =sum+ factorial(d);
		    }
		 
		    if (sum == i) 
		    {
		        result += i;
		        System.out.println(result);
		    }
		    
		}
		

	}
	private static int factorial(int n) 
	{
	    if (n == 0) 
	    {
	        return 1;
	    }
	    int y = n;
	    for (int i = 1; i < n; i++) 
	    {
	        y *= i;
	    }
	    return y;
	    
	}

}
