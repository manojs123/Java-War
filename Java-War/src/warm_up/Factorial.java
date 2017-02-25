package warm_up;
import java.math.BigInteger;
import java.util.Scanner;

class FactorialRecursion
{
	BigInteger fact(BigInteger n)
	{
		BigInteger result;
		
		if(n.intValue()==1)
			return BigInteger.ONE;
			
		result=fact(n.subtract(BigInteger.ONE)).multiply(n);
		return result;
	}
	
}

public class Factorial {

	private static Scanner s;

	public static void main(String[] args)
	{
		FactorialRecursion a = new FactorialRecursion();
		System.out.println("Please Enter a Number");
		s = new Scanner(System.in);
		BigInteger n =s.nextBigInteger();
		BigInteger f=a.fact(n);
		System.out.println(f);
		
	}

}
