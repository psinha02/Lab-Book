package Lab9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ex2 {
	
	boolean isValidString(String str) {
		boolean isValid = false;
		isValid  = Pattern.matches("[a-z]{8,}[job]", str);
		return isValid;
	}
	
	public static void main(String[] args) {
		String username;
		Scanner sc = new Scanner(System.in);
		username = sc.nextLine();
		username = username.toLowerCase();
		ex2 ex = new ex2();
		System.out.println(ex.isValidString(username));
		sc.close();
	}
}