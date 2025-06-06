package add_DSA;

import java.util.Arrays;
import java.util.Scanner;


public class fact {






	public static int fact(int n) {
		
		if (n==0||n==1) {
			return 1;
		}
		else 
				return n*fact(n-1);
			 
		
	}	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

        	System.out.println("Enter number");
        	int num=sc.nextInt();
        	System.out.println(fact(num));
        	

}		
		

}
