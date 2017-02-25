package week1;

// Prime factors of a given i/p

public class PrimeFactors {

	public static void main(String[] args) 
	{
		long givenNumber=600851475143L;
		int flag=0;
		long greatPrime=0;
		System.out.println("Given Number is: "+givenNumber);
		//System.out.println("Maximum Value is:"+Collections.max(finalResult));
		for(long i=1;i<=givenNumber;i++)
		{
			long result=givenNumber%i;
			if(result==0)
			{
				//System.out.println(i);
				
				long test=i/2;
				for(long j=2;j<=test;j++)
				{
					if(i%j==0)
					{
						 flag=1;
						 break;
					}
				}
				if(flag==0)
				{	
					long result1=i;
					System.out.println("Prime Factors of a Given Number are:"+result1);
					if(result1>greatPrime)
						greatPrime=result1;
				}
			
			}
		}	
			
	
	System.out.println(greatPrime);		
}		
}
