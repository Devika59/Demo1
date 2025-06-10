package add_DSA;

import java.util.Scanner;

public class day2_MainAssignment {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String s=sc.next();
		int left=0,right=s.length()-1;
		boolean ispalindrome=true;
		while(left<right) {
			if(s.charAt(left++)!=s.charAt(right--)){
				ispalindrome=false;
				break;
			}
		}
		System.out.println(ispalindrome?"palindrome":"not palindrome");	}
}