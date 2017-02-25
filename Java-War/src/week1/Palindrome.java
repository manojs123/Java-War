package week1;

public class Palindrome {

	public static void main(String[] args) {
		int greaterPal = 0;
		for (int i = 100; i <= 999; i++)
		{
			for (int j = 100; j <= 999; j++) 
			{
				int result = i * j;
				if (isPalin(result)) 
				{
					if (result > greaterPal)
						greaterPal = result;
					

					// String[] test=(String[]) list.toArray();

					// System.out.println(getMaxValue(list));
				}
			} // StringBuilder s1=new StringBuilder(result);
				// String s2=""+result;
				// s1.reverse();
		} // if(s2.equals(s1.toString()))
			// {
			// System.out.println(result);
			// }
		System.out.println("The Maximum Palindromic Number is:" +greaterPal);
	}
	
	// break outer;
	// System.out.println(+Collections.max(list));

private static boolean isPalin(final int product) 
{
		int p = product;
		int reverse = 0;
		while (p != 0) 
		{
			reverse = reverse * 10;
			reverse += p % 10;
			p = p / 10;
		}
		if (reverse == product)
			return true;
		else
			return false;
	}

}	