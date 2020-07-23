package asciiEncryptionPlus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asciiEncryptionPlus {

	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		System.out.println("Add a string of any value you want.");
		String toEncrypt = getInput.nextLine();
	
		
		List <Double> encrypted = new ArrayList <Double>();
		for (int  i = 0 ; i < toEncrypt.length(); i++) {
			double x  = (double) toEncrypt.charAt(i);
			if (i % 2 == 0) {
				x = (x*13 -7) + Math.random();
				encrypted.add(x);
			} else {
				int y =  (int) (Math.random()*37496) ;
				double j = y;
				j += ((x*13 -7)/100000);
				encrypted.add(j);
			}
		}
		
		System.out.print(encrypted);

	}

}
