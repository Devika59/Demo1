package add_DSA;
import java.util.Scanner;

public class Task5 {
	



	

		



		

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);



		     

		        System.out.print("Enter a year: ");

		        int year = scanner.nextInt();



		      

		        if (isLeapYear(year)) {

		            System.out.println(year + " is a Leap Year.");

		        } else {

		            System.out.println(year + " is Not a Leap Year.");

		        }



		        scanner.close();

		    }



		   

		    public static boolean isLeapYear(int year) {

		        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

		    }

		}








