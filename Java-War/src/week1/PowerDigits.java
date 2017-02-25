package week1;

import java.math.BigInteger;

public class PowerDigits {

	public static void main(String[] args) 
	{
		BigInteger n=new BigInteger("2");
		int exponent=1000;
		BigInteger n1;
		n1=n.pow(exponent);
		System.out.println(n1);
		
		BigInteger digit;
	    BigInteger sum = BigInteger.ZERO;
		while (n1.compareTo(BigInteger.ZERO) > 0)
	    {
	        digit = n1.remainder(BigInteger.TEN);
	        sum  = sum.add(digit);
	        n1=n1.divide(BigInteger.TEN);
	    }
		System.out.println(sum);
		
	}
}
