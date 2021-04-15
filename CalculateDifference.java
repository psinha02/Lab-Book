package Lab1;

import java.util.Scanner;

public class CalculateDifference {
 
	//calculate the difference
	public static int calculateDifference(int n) {
		int sum=0;
		int sqrSum=0;
		int sumSqr=0;
		for(int i=0;i<=n;i++) {
			sqrSum+=i*i;
			sumSqr+=i;
		}
		sum=sqrSum-(sumSqr*sumSqr);
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=sc.nextInt();
		sc.close();
		System.out.println(calculateDifference(n));
		}
}
