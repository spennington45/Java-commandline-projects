import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asciiEncryption {

	public static void main(String[] args) {

		Scanner getInput = new Scanner(System.in);
		System.out.println("Add a string of any value you ant.");
		String toEncrypt = getInput.nextLine();
	
		
		List <Integer> encrypted = new ArrayList <Integer>();
		for (int  i = 0 ; i < toEncrypt.length(); i++) {
			int x  = (int) toEncrypt.charAt(i);
			encrypted.add(x);
		}
		
		System.out.print(encrypted);
		
	}

}
