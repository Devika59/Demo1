package add_DSA;

import java.util.Scanner;

public class day2_task3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String s=sc.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
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