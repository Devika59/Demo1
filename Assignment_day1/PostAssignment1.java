package add_DSA;
import java.util.Scanner;

public class PostAssignment1 {
	





		



		



		    

		    public static int sumDigits(int n) {

		        if (n == 0)

		            return 0;

		        return (n % 10) + sumDigits(n / 10);

		    }



		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);



		       

		        System.out.print("Enter a number: ");

		        int number = scanner.nextInt();



		       

		        int sum = sumDigits(number);



		        

		        System.out.println("Sum of digits: " + sum);



		        scanner.close();

		    }

		}






	


