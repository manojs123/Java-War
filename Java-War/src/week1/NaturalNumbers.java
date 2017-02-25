package week1;

public class NaturalNumbers {

	
	public static void main(String[] args) 
	{
		System.out.println("All the Natural Numbers up to 1000:");
		int sum=0;
		int b[]=new int[1000];
		int a[]=new int[1001];
		for(int i=0;i<999;i++)
		{
			a[i]=i+1;
			if(a[i]%3==0 || a[i]%5==0)
			{
				b[i]=a[i];
				System.out.println(b[i]);
				sum=sum+b[i];
			}
		}	
		System.out.println("Sum of all Multiples of 3 & 5:"+sum);
		
	}

}
