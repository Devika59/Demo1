package Day8;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
	public  static void binarysearch(int arr[]) {
		
		System.out.println("Enter the number to find ");
		Scanner s=new Scanner(System.in);
		int find=s.nextInt();
	 int left=0;
	 int right=arr.length-1;
	 int mid;
	 boolean flag=false;
	 while(left<=right) {
		 mid=(left+right)/2;
		 if(arr[mid]==find) {
			 System.out.println("value found" +arr[mid] +"at index"+mid);
			 flag=true;
			 break;
		 } 
	 
		
		 
		 else if(find>arr[mid]) {
			 left=mid+1;
			 
			 
		 }
		 else if (find<arr[mid]) {
			 right=mid-1;
		 } 
		 }

	 if(flag==false) {
		 System.out.println("value not found");
	 } 

}


	public static void main(String[]args) {
		int arr1[]= {1,9,5,7,3,6,8,2,64,98};
		
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		binarysearch(arr1);
		
	}
	
		}