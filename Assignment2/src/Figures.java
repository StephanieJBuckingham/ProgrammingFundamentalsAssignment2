/* Programming Fundamentals
 * Stephanie Buckingham
 * Programming Assignment 2
 * 8/1/2020
 */

import java.util.Scanner;

public class Figures {

	// initialize size variable
	public int size = 0;

	public static void main(String[] args) {

		int size;
		int option = 0;
		Scanner scan = new Scanner(System.in);

		// program label
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Stephanie Buckingham");
		System.out.println("PROGRAMMING ASSIGNMENT 2\n");

		// prompt user to enter figure size
		System.out.print("Enter a number for the size of the figure (odd number): ");
		size = scan.nextInt();


		// if figure size isn't odd prompt user to reenter figure size
		while (size % 2 != 1) {
			System.out.println("Invalid figure size- must be an odd number\n");
			System.out.print("Reenter the size of the figure: ");
			size = scan.nextInt();
		}

		// if user inputs an invalid option prompt them to renter option
		while (option != 4) {
			
			// show figure MENU to user and prompt them to select a figure
			System.out.print("\n");
			System.out.println("MENU:\n" + "1. Print box\n" + "2. Print X\n" + "3. Print diamond\n"
					+ "4. Quit program\n");
			System.out.print("Please select an option: ");
			option = scan.nextInt();
			System.out.print("\n");
			
			// if user selects option 1 invoke method printBox and send user into MENU loop
			if (option == 1) {
				printBox(size);
			}

			// if user selects option 2 invoke method printDiamond and send user into MENU
			// loop
			if (option == 2) {
				printDiamond(size);
			}

			// if user selects option 3 invoke method printX and send user into MENU loop
			if (option == 3) {
				printX(size);
			}

			// if user selects option 4 print "Good bye!"
			if (option == 4) {
				System.out.println("Good bye!");
				System.exit(0);
			}

		}
	}

	// printBox method
	public static void printBox(int size) {

		for (int i = 0; i < size; i++) {
			{
				for (int j = 0; j < size; j++) {
					System.out.print('X');
				}
				System.out.println();
			}
		}
	}

	// printX method
	private static void printX(int size) {
		for (int i = 0; i < size; i++) {
			int j = size - 1 - i;
			for (int k = 0; k < size; k++) {
				if (k == i || k == j)
					System.out.print("X");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	// printDiamond method
	private static void printDiamond(int size) {

		int j, i, k, a;
		a = (size / 2) + 1;
		for (i = 1; i <= a; i++) {
			for (j = a; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (k = 0; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			System.out.println("X");
		}
		for (i = a - 1; i >= 1; i--) {
			for (j = a; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (k = 0; k < 2 * (i - 1); k++) {
				System.out.print(" ");
			}
			System.out.println("X");
		}
	}
}