package Lab1;
import java.util.Scanner;


public class CalculateSum {
	
	//calculate sum
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0 && i%5==0) {
				sum+=i;
			}else {
				continue;
			}	
		}
		return sum;	
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number ");
	int n=sc.nextInt();
	sc.close();
	System.out.println(calculateSum(n));
	}

}
