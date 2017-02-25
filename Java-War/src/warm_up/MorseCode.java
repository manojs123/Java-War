package warm_up;
import java.util.Scanner;

public class MorseCode
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		 
		String[] morse =  { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
                "-....", "--...", "---..", "----.", "-----", "|" };

			System.out.println("Please Enter a Message to be Converted");
	        String x=scan.nextLine();
	        
	        for(int i=0;i<x.length();i++)
	        {
	        	char  ch = x.charAt(i);
	        	
	        	switch(ch)
	        	{
	        		case 'a':
	        		case 'A':
	        			System.out.print(morse[0]); 
	        			break;
	        		
	        		case 'b':
	        		case 'B':
	        			System.out.print(morse[1]); 
	        			break;
	        			
	        		case 'c':
	        		case 'C':
	        			System.out.print(morse[2]); 
	        			break;	
	        	
	        		case 'd':
	        		case 'D':
	        			System.out.print(morse[3]); 
	        			break;
	        			
	        		case 'e':
	        		case 'E':
	        			System.out.print(morse[4]); 
	        			break;	
	        
	        		case 'f':
	        		case 'F':
	        			System.out.print(morse[5]); 
	        			break;
	        		
	        		case 'g':
	        		case 'G':
	        			System.out.print(morse[6]); 
	        			break;
	        			
	        		case 'h':
	        		case 'H':
	        			System.out.print(morse[7]); 
	        			break;
	        			
	        		case 'i':
	        		case 'I':
	        			System.out.print(morse[8]); 
	        			break;
	        		
	        		case 'j':
	        		case 'J':
	        			System.out.print(morse[9]); 
	        			break;
	        			
	        		case 'k':
	        		case 'K':
	        			System.out.print(morse[10]); 
	        			break;
	        			
	        		case 'l':
	        		case 'L':
	        			System.out.print(morse[11]); 
	        			break;
	        		
	        		case 'm':
	        		case 'M':
	        			System.out.print(morse[12]); 
	        			break;
	        		
	        		case 'n':
	        		case 'N':
	        			System.out.print(morse[13]); 
	        			break;
	        		
	        		case 'o':
	        		case 'O':
	        			System.out.print(morse[14]); 
	        			break;
	        		
	        		case 'p':
	        		case 'P':
	        			System.out.print(morse[15]); 
	        			break;
	        		
	        		case 'q':
	        		case 'Q':
	        			System.out.print(morse[16]); 
	        			break;
	        		
	        		case 'r':
	        		case 'R':
	        			System.out.print(morse[17]);
	        			break;
	        		
	        		case 's':
	        		case 'S':
	        			System.out.print(morse[18]);
	        			break;
	        		
	        		case 't':
	        		case 'T':
	        			System.out.print(morse[19]);
	        			break;
	        		
	        		case 'u':
	        		case 'U':
	        			System.out.print(morse[20]); 
	        			break;
	        			
	        		case 'v':
	        		case 'V':
	        			System.out.print(morse[21]); 
	        			break;
	        			
	        		case 'w':
	        		case 'W':
	        			System.out.print(morse[22]);
	        			break;
	        			
	        		case 'x':
	        		case 'X':
	        			System.out.print(morse[23]); 
	        			break;
	        		
	        		case 'y':
	        		case 'Y':
	        			System.out.print(morse[24]); 
	        			break;
	        			
	        		case 'z':
	        		case 'Z':
	        			System.out.print(morse[25]); 
	        			break;
	        			
	        		case '1':
	        			System.out.print(morse[26]); 
	        			break;
	        			
	        		case '2':
	        			System.out.print(morse[27]); 
	        			break;
	        		
	        		case '3':
	        			System.out.print(morse[28]); 
	        			break;	
	        			
	        		case '4':
	        			System.out.print(morse[29]); 
	        			break;	
	        		
	        		case '5':
	        			System.out.print(morse[30]); 
	        			break;
	        			
	        		case '6':
	        			System.out.print(morse[31]); 
	        			break;
	        		
	        		case '7':
	        			System.out.print(morse[32]); 
	        			break;	
	        		
	        		case '8':
	        			System.out.print(morse[33]); 
	        			break;	
	        		
	        		case '9':
	        			System.out.print(morse[34]); 
	        			break;	
	        	
	        		case '0':
	        			System.out.print(morse[35]); 
	        			break;	
	        		
	        	}
	        			
	        }      		 			
	        			 
 		scan.close();
	}        			
}	
	        			 
	        			
