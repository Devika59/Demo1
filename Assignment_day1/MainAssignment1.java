package add_DSA;
import java.util.Scanner;

public class MainAssignment1 {
	







		

		    static int[] array = new int[100]; 

		    static int size = 0; 

		    static Scanner scanner = new Scanner(System.in);



		    public static void main(String[] args) {

		        System.out.print("Enter initial number of elements: ");

		        size = scanner.nextInt();



		        System.out.println("Enter " + size + " elements:");

		        for (int i = 0; i < size; i++) {

		            array[i] = scanner.nextInt();

		        }



		        menu(); 

		    }



		    

		    public static void menu() {

		        System.out.println("\n--- MENU ---");

		        System.out.println("1. Insert Element");

		        System.out.println("2. Delete Element");

		        System.out.println("3. Find Min and Max");

		        System.out.println("4. Display Array");

		        System.out.println("5. Exit");

		        System.out.print("Choose an option: ");



		        int choice = scanner.nextInt();



		        switch (choice) {

		            case 1 -> insert();

		            case 2 -> delete();

		            case 3 -> findMinMax();

		            case 4 -> display(0);

		            case 5 -> {

		                System.out.println("Exiting...");

		                return;

		            }

		            default -> System.out.println("Invalid choice!");

		        }



		        menu(); 

		    }



		   

		    public static void insert() {

		        System.out.print("Enter element to insert: ");

		        int element = scanner.nextInt();

		        System.out.print("Enter position (0 to " + size + "): ");

		        int pos = scanner.nextInt();



		        if (pos < 0 || pos > size) {

		            System.out.println("Invalid position!");

		            return;

		        }



		        for (int i = size; i > pos; i--) {

		            array[i] = array[i - 1];

		        }

		        array[pos] = element;

		        size++;

		        System.out.println("Element inserted.");

		    }



		    

		    public static void delete() {

		        System.out.print("Enter position to delete (0 to " + (size - 1) + "): ");

		        int pos = scanner.nextInt();



		        if (pos < 0 || pos >= size) {

		            System.out.println("Invalid position!");

		            return;

		        }



		        for (int i = pos; i < size - 1; i++) {

		            array[i] = array[i + 1];

		        }

		        size--;

		        System.out.println("Element deleted.");

		    }



		   

		    public static void findMinMax() {

		        int min = findMin(0, array[0]);

		        int max = findMax(0, array[0]);



		        System.out.println("Minimum: " + min);

		        System.out.println("Maximum: " + max);

		    }



		    public static int findMin(int index, int currentMin) {

		        if (index == size) return currentMin;

		        return findMin(index + 1, Math.min(currentMin, array[index]));

		    }



		    public static int findMax(int index, int currentMax) {

		        if (index == size) return currentMax;

		        return findMax(index + 1, Math.max(currentMax, array[index]));

		    }



		    public static void display(int index) {

		        if (index == size) {

		            System.out.println();

		            return;

		        }

		        System.out.print(array[index] + " ");

		        display(index + 1);

		    }

		}








