package Day8;
import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {
	public static void main (String[]args)
	{
	int arr[]= {12,2,4,56,8,5,90};
	System.out.println(Arrays.toString(arr));
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value to find");
	int find=sc.nextInt();
	boolean flag =true;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==find) {
			System.out.println("value found:"+arr[i]+"at index "+i);
		flag=true;
		break;
			 }	
		}
		 if (flag==false) {
		System.out.println("value not found");
	}
		 }
}
