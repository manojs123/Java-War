package week2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
//Counitng Number of occurences of each Digint in Mersene Prime Number.

public class MersePrimeCount {

	public static void main(String[] args) throws IOException 
	{
	
		BufferedReader br = new BufferedReader(new FileReader("/home/manoj/Desktop/M74207281.txt"));
		try 
		{
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) 
		    {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String str = sb.toString();
		
		    HashMap<Character, Integer> map = new HashMap<>();
		    	for (char ch : str.toCharArray()) 
		    	{
		    		if (map.containsKey(ch)) 
		    		{	
		    			int val = map.get(ch);
		    			map.put(ch, val + 1);
		    		}
		    		else 
		    		{
		    				map.put(ch, 1);
		    		}
		    	}
		    	System.out.println(map);
		    }
			finally
			{
				br.close();
			}
	}
}	
	