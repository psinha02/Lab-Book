package Lab1;

import java.util.Scanner;

public class ex1 {
	
	//loop for adding cube numbers
	public static int sumOfN(int n) {
	int sum=0;
	for(int i=1; i<=n;i++)
	sum+=i*i*i;	
	return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);        //input value from user
		System.out.println("enter the value of n");
		int n=sc1.nextInt();                         //n is assigned user input value
		sc1.close();    
		
		System.out.println("sum of cube of n numbers: "+ sumOfN(n));	//sum value is printed
	}
	
	}