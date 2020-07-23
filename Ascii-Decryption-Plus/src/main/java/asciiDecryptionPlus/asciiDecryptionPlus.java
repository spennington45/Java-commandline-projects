package asciiDecryptionPlus;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class asciiDecryptionPlus {

	public static void main(String[] args) {
		
		
		Scanner getInput = new Scanner(System.in);
		System.out.println("Add a list of ints seperated by ,");
		String toDecrypt = getInput.nextLine();
		
		List<String> tempList = Arrays.asList(toDecrypt.split("\\s*,\\s*"));
		String decrypted = "";
		for (int i = 0; i < tempList.size(); i++) {
			if (i % 2 == 0) {
				double k = Double.parseDouble(tempList.get(i));
				int j = (int) (k + 7)/13;
				char x = (char) j;
				decrypted = decrypted + x;
			} else {
				double k = Double.parseDouble(tempList.get(i));
				k -= (int) k;
				k = (k*100000 + 7)/13;
				if (k - (int) k >= 0.5) {
					k = Math.ceil(k);
				}
				int j = (int) k;
				char x = (char) j;
				decrypted = decrypted + x;		
			}
		}
		
		System.out.print(decrypted);


	}

}
