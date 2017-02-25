package week1;

public class PythagoreanTriplet {

	public static void main(String[] args)
	{
		int a=0;
		int b=0;
		int c=0;
		for(a=0;a<=1000;a++)
		{
			for(b=a+1;b<=1000;b++) //a<b<c
			{
				for(c=b+1;c<=1000;c++) //a<b<c
				{
					if(((a*a)+(b*b))==(c*c) && a+b+c==1000)
					{
						System.out.println(a);
						System.out.println(b);
						System.out.println(c);
					}
						
				}
			}
		}
	}

}
