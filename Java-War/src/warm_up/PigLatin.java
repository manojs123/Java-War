package warm_up;
//PigLatin

import java.util.Scanner;

public class PigLatin 
{

	public static void main(String[] args) 
	{
		System.out.println("Please Enter a Sentence");
		Scanner in = new Scanner(System.in);
		String  x=in.nextLine();
		String[] y=x.split(" ");
		for(int i=0; i<y.length;i++)
		{
			String p=y[i];
			char[] f = p.toCharArray(); 
			char[] z=new char[(f.length)+2];
			z[z.length-1]='y';
			z[z.length-2]='a';
			z[z.length-3]=f[0];
				
				for(int j=0;j<(z.length)-3;j++)
				{
					z[j]=f[j+1];
				}
				String NS=new String(z);
				System.out.print(NS+"\t");
		}in.close();

	}	
}
