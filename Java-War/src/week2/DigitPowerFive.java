package week2;

//Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:
//1634 = 14 + 64 + 34 + 44
//8208 = 84 + 24 + 04 + 84
//9474 = 94 + 44 + 74 + 44
//As 1 = 14 is not a sum it is not included.
//The sum of these numbers is 1634 + 8208 + 9474 = 19316.
//
//Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

public class DigitPowerFive {

	public static void main(String[] args) 
	{
		
		int result = 0;
		for(int i=2; i<354294; i++)
		{
			if(check(i))
			{
				result += i;      
			}
			
		}
		
		
		System.out.println(result);
	}

public static boolean check(int num)
{

    int temp = num;
    int sum = 0;

    while(temp>=1)
    {

        int value = temp%10;
        temp /= 10;

        sum=(int) (sum+ Math.pow(value,5));

        if(sum>num)
        	break;

    }

    if(sum==num)
    {
    	System.out.println(num);
    	return true;
    }

    else 
        return false;
}
	}
