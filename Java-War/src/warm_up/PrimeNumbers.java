package warm_up;
import java.util.InputMismatchException;
import java.math.*;
import java.util.Scanner;

class PrimeNumbers
{
   	private static Scanner s;

	public static void main (String[] args)
	{		
		StringBuilder sbr = new StringBuilder();
   		s = new Scanner(System.in);
   		//BigInteger i =BigInteger.ZERO;
   		//BigInteger x;
   		BigInteger num;
   		//String primeNumbers=" "; //should push all resulted prime numbers to this
   		try
   		{
   			System.out.println("Enter the value of n:");
   			BigInteger n = s.nextBigInteger();
   			for (BigInteger i1 =BigInteger.ONE; i1.compareTo(n)<= 0; i1=i1.add(BigInteger.ONE))  	   
   			{ 		 		  
   				BigInteger count=BigInteger.ZERO; 		  
   				for(num=i1; num.compareTo(num)>=1; num=num.subtract(BigInteger.ONE))
   				{
   					if(i1.remainder(num)==(BigInteger.ZERO))
   					{
   						count = count.add(BigInteger.ONE);
   					}
   				}
   				if (count==BigInteger.valueOf(2))
   				{
   					BigInteger i11 = BigInteger.ZERO;
					sbr.append(i11.toString());
					sbr.append("\n");
   				}	
   			}
   			System.out.format("Prime numbers from 1 to %d are :",n);
   	   		System.out.println(sbr.toString());
   		}
        catch(InputMismatchException exception)
   		{
              System.out.println("This is not an integer");
   		}
   		num=BigInteger.ZERO;
   		//System.out.println(num.compareTo(num)>=1);
   		//System.out.println(num.compareTo(BigInteger.ONE));
   	}
}