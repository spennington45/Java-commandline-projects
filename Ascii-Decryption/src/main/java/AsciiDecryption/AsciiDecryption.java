package AsciiDecryption;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AsciiDecryption {

	public static void main(String[] args) {

		Scanner getInput = new Scanner(System.in);
		System.out.println("Add a list of ints seperated by ,");
		String toDecrypt = getInput.nextLine();
		
		List<String> tempList = Arrays.asList(toDecrypt.split("\\s*,\\s*"));
		String decrypted = "";
		for (String i : tempList) {
			char x  = (char) Integer.parseInt(i);
			decrypted = decrypted + x;
		}
		
		System.out.print(decrypted);

	}

}
