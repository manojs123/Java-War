package week1;

public class Natural 
{
	public static void main(String[] args)
	{
		Long sumOfSquares;
		Long sum;
		Long sumOfNatural;
		Long difference;
		sumOfSquares=(long) ((100*(100+1))*((2*100)+1))/6;
		sum=(long)((100)*(100+1))/2;
		sumOfNatural=(long) sum*sum;
		difference=(long) sumOfNatural-sumOfSquares;
		System.out.println(difference);
	}

}
