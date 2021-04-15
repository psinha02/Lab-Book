package Arrayss;

import java.util.Scanner;

public class ArrayOne {
	int getSecondSmallest(String[] arr) {
	
		int size;
        String temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter size of Array:");
        size= scan.nextInt();
        
        String str[] = new String[size];
        
        Scanner scan2 = new Scanner(System.in);
        
        
        System.out.println("Enter the elements");
        for(int i = 0; i < size; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
      
        for (int i = 0; i < size; i++) 
        {
            for (int j = i + 1; j < size; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        if(size%2!=0) {
        	for (int i=0;i<((size/2)+1); i++) {
        	}
        }
		
		return 0;
		}
	public static void main(String[] args) {
		ArrayOne ss =new ArrayOne();
		System.out.println(ss.getSecondSmallest(args));


	}

}
