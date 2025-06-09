package add_DSA;

import java.util.Scanner;

public class Task7 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String n=sc.next();
		int i=0;
		int j=n.length()-1;
		if (i==j) {
			System.out.println("t");
		
		}
		else {
			System.out.println("f");
		}
	}
}
