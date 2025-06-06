package add_DSA;
import java.util.Scanner;

public class Task3 {
	



	

		



		

		    public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);



		        

		        System.out.print("Enter number of elements: ");

		        int size = scanner.nextInt();



		       

		        int[] array = new int[size];

		        System.out.println("Enter " + size + " elements:");

		        for (int i = 0; i < size; i++) {

		            array[i] = scanner.nextInt();

		        }



		        

		        int min = array[0];

		        int max = array[0];



		        

		        for (int i = 1; i < size; i++) {

		            if (array[i] < min) {

		                min = array[i];

		            }

		            if (array[i] > max) {

		                max = array[i];

		            }

		        }



		       

		        System.out.println("Minimum element: " + min);

		        System.out.println("Maximum element: " + max);



		        scanner.close();

		    }

		}








