package warm_up;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmStrong
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc;
		BigInteger n=null;
		//BigInteger count = BigInteger.ZERO;
		//BigInteger a;
		BigInteger b; 
		//BigInteger c; 
		BigInteger sum = BigInteger.ZERO;
		sc = new Scanner(System.in);
		try{
		System.out.println("Enter a Number:");
		BigInteger no = sc.nextBigInteger();
		System.out.println("Armstrong Numbers are:\n");
		BigInteger i;
		for (i = BigInteger.ONE; i.compareTo(no)<= 0; i=i.add(BigInteger.ONE))
		//for (i = 1; i <= no; i++)
		{
			n=i;
			while (n.compareTo(new BigInteger("0")) > 0)
			//while (n > 0)
			{
				b = n.remainder(BigInteger.TEN);
				sum = sum.add(b.multiply(b).multiply(b));
				n = n.divide(BigInteger.TEN);
			}
			if (sum.equals(i))
			{
				System.out.print(i + " ");
			}
			sum = BigInteger.ZERO;
		}
		}
		catch(InputMismatchException exception)
		{
			System.out.println("Please Enter Integer Value");
		}
	}
}
