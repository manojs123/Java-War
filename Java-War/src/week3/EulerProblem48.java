package week3;

import java.math.BigInteger;

/*The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.

*/

public class EulerProblem48 
{

	public static void main(String[] args) 
	{
		
		BigInteger result = BigInteger.ZERO;
		BigInteger n=new BigInteger("1000");
		BigInteger div=new BigInteger("10000000000");
		int j=1;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n)<=0; i=i.add(BigInteger.ONE)) 
        {
        	result=result.add(i.pow(j));
        	j++;
        }
        BigInteger sol=result.mod(div);
        System.out.println("The Last 10 Digits:"+sol);
             
		

	}

}
