package add_DSA;

import java.util.Scanner;

public class Day2_task2 {
	public static int Duplicate(int[]nums) {
		if (nums.length==0) {
			return 0;
		}
		int i=0;
		for (int j=1;j<nums.length;j++) {
			if( nums[j]!=nums[i]){
				i++;
			nums[i]=nums[j];
			
			}
		}
		return i+1;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tha size");
		int n=sc.nextInt();
		int[]nums=new int[n];
		System.out.println("enter the elements");
		for (int i=0;i<n;i++) {
		nums[i]=sc.nextInt();
	}
		int length=Duplicate(nums);
		System.out.println("removed duplicated");
		for(int i=0;i<length;i++) {
			System.out.println(nums[i]);
		}
	
		}

}
