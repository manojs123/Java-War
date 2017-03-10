package javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffRead {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // to convert bytes to chars
		String c;
		do
		{
			c=br.readLine();
			System.out.println(c);
		}
		while(!c.equals("q")); // QUIT
		
		

	}

}
