package practice;

import java.math.BigInteger;

public class LychrelNumber {

	public static void main(String[] args) 
	{
		int start = 10;
        int limit = 10000;
        int result = 0;
        
        for (int i = start; i < limit; i++) 
        {
            if (IsLychrel(i)) 
            	result++;
        }
        
        
        System.out.println("The sum of Lychrel numbers less than 1000 is:" +result);
        
    }

    private static boolean IsLychrel(int number) 
    {

        BigInteger testNumber = new BigInteger(String.valueOf(number));
        for (int i = 0; i < 50; i++) 
        {
            testNumber = testNumber.add(ReverseNumber(testNumber));
            if (IsPalindrome(testNumber)) 
            	return false;
        }

        return true;
    }

    private static BigInteger ReverseNumber(BigInteger number) 
    {
        BigInteger reversed = BigInteger.ZERO;
        BigInteger k = number;

        while (k.compareTo(BigInteger.ONE) >0) //while (k > 0) 
        {
            reversed = reversed.multiply(BigInteger.TEN).add(k.remainder(BigInteger.TEN));
            k=k.divide(BigInteger.TEN);
        }
        return reversed;
    }

    private static boolean IsPalindrome(BigInteger number) 
    {
        return number == ReverseNumber(number);
    }

}



