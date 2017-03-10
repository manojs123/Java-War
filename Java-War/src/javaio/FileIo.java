package javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIo {

	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream = null;
		FileOutputStream fileOutputStream = null;
		int i;
		
		 	 fileInputStream = new FileInputStream("/home/manoj/Desktop/testin.txt");
			 fileOutputStream = new FileOutputStream("/home/manoj/Desktop/testout.txt");
			 do 
			 {
				 i = fileInputStream.read();
				 if(i != -1) 
					 fileOutputStream.write(i);
			 } while(i != -1);

	}
}	




