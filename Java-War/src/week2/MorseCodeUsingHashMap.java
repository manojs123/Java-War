package week2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeUsingHashMap {
	public static void main(String[] args) {
		System.out.println("Please Enter a Message");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		Map<String, String> word = new HashMap<String, String>();

		word.put("a", ".-");
		word.put("b", "-...");
		word.put("c", "-.-");
		word.put("d", "-..");
		word.put("e", ".");
		word.put("f", "..-.");
		word.put("g", "--.");
		word.put("h", "....");
		word.put("i", "..");
		word.put("j", ".---");
		word.put("k", "-.");
		word.put("l", ".-..");
		word.put("m", "--");
		word.put("n", "-.");
		word.put("o", "---");
		word.put("p", ".--.");
		word.put("q", "--.-");
		word.put("r", ".-.");
		word.put("s", "...");
		word.put("t", "-");
		word.put("u", "..-");
		word.put("v", "...-");
		word.put("w", ".--");
		word.put("x", "-..-");
		word.put("y", "-.--");
		word.put("z", "--..");
		word.put("1", ".----");
		word.put("2", "..---");
		word.put("3", "...--");
		word.put("4", "....-");
		word.put("5", "..…");
		word.put("6", "-....");
		word.put("7", "--...");
		word.put("8", "---..");
		word.put("9", "----.");
		word.put("0", "-----");

		String convert = "";

		for (int i = 0; i < input.length(); i++) 
		{
			String check = Character.toString(input.charAt(i));

			if (word.containsKey(check)) 
			{
				convert += word.get(check);
			}
			else 
			{
				convert += check;
			}
			
		}
		System.out.println(convert);

	}
}
