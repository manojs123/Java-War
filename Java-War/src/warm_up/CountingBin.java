package warm_up;
//Counting Number of 1's in a stream of binary  


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingBin 
{

	public static void main(String[] args) throws IOException
	{
		//BufferedReader bf=new BufferedReader(new FileReader("/home/manoj/Desktop/input.txt"));
		int count=0;
		FileReader fr = new FileReader(("/home/manoj/Desktop/input.txt"));
		BufferedReader br = new BufferedReader(fr);
		String line=br.readLine();
		System.out.println(line);
		String[] array = new String[line.length()];
		for(int i = 0; i < line.length(); i++)
		{
			array[i] = String.valueOf(line.charAt(i));
			if(array[i].equals("1"))
			{
				count++;
			}
			
		}
		br.close();
		System.out.println("Total Number of 1's in a given File:"+count);
		
	}
		
}
	