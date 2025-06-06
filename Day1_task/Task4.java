package add_DSA;
import java.util.Scanner;

public class Task4 {
	



	




		



		    

		    public static int fibonacci(int n) {

		        if (n <= 1) {

		            return n;

		        }

		        return fibonacci(n - 1) + fibonacci(n - 2);

		    }



		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);



		       

		        System.out.print("Enter the number of terms: ");

		        int terms = scanner.nextInt();



		        System.out.println("Fibonacci Series up to " + terms + " terms:");

		        for (int i = 0; i < terms; i++) {

		            System.out.print(fibonacci(i) + " ");

		        }



		        scanner.close();

		    }

		}








