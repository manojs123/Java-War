package warm_up;
//Roman to Decimal

import java.util.Scanner;
public class RomanToDecimal 
{
	public static void main(String[] args)
	{
		    Scanner scan = new Scanner(System.in);
            System.out.print("Enter a Roman number: ");
            String RN = scan.nextLine();
            RN = RN.toUpperCase();
            int DN = 0;
            int l=  RN.length();
            int num=0;
            int previousnum = 0;
            for (int i=l-1;i>=0;i--)
            { 
                    char x =  RN.charAt(i);
                    x = Character.toUpperCase(x);
                    switch(x)
                    {  
                            case 'I':
                            	previousnum = num;
                            num = 1;
                            break;
                            case 'V':
                                 previousnum = num;
                            num = 5;
                            break;
                            case 'X':
                                    previousnum = num;
                            num = 10;
                            break;
                            case 'L':
                            		previousnum = num;
                            num = 50;
                    }
                    if (num<previousnum)
                    {
                    	DN= DN-num;
                    }
                    else
                    	DN= DN+num;
            }
            System.out.println(DN);
            scan.close();
	}
    
}

