package Lab3;

import java.util.Scanner;

public class ex2 {

	public static void main(String args[]) {
		StringBuffer inputString;
		ex2 ex = new ex2();
		Scanner sc  = new Scanner(System.in);
		inputString = new StringBuffer();
		
		System.out.println("Enter the String: ");
		inputString.append(sc.nextLine());
		System.out.print(inputString+"|");
		ex.getImage(inputString);
		System.out.print(inputString);
		
		sc.close();
	}
	
	void getImage(StringBuffer str) {
		str.reverse();
	}
}