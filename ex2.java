package Lab1;

import java.util.Scanner;

public class ex2 {

	public static void main(String srgs[]) {
		String lightColor;
		Scanner sc = new Scanner(System.in);
		
		lightColor = sc.nextLine();
		sc.close();
//		System.out.println(lightColor);
		
		
		if(lightColor.equals("red")) {
			System.out.println("Stop");
		}
		else if(lightColor.equals("yellow")) {
			System.out.println("Ready");
		}
		else if(lightColor.equals("green")) {
			System.out.println("GO");
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}