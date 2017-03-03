package week2;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.StringTokenizer;  

public class StringToken {

	public static void main(String args[]) 
	{
		StringTokenizer str=new StringTokenizer("Iam, proud of my sister","");
		while(str.hasMoreTokens())
		{
			System.out.println(str.nextToken(","));
		}
		
		int range=20;
		Random r=new Random();
		for(int i=0;i<20;i++)
		{
			int x=r.nextInt(100);
			 System.out.println(x);
				
			
		}
		
		Date date=new Date(range);
		
		System.out.println(date.toString());
		SimpleDateFormat ft = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss");
		System.out.println(ft.format(date));
		
		
	}

}
