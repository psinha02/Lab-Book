package Lab1;

import java.util.Scanner;

public class CheckNumberPower2 {
	
	public static boolean checkNumber(int n){
		while(n%2==0){
			n=n/2;
		}
		
		if(n==1) {
			return true;
		} else
		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		sc.close();
		System.out.println(checkNumber(n));
	}

}
