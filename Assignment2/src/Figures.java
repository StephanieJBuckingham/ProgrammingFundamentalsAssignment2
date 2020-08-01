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

		// program label
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Stephanie Buckingham");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		System.out.println();

		// prompt user to enter figure size
		System.out.print("Enter a number for the size of the figure (odd number): ");
		Scanner scan1 = new Scanner(System.in);
		int size;
		size = scan1.nextInt();

		// if figure size isn't odd prompt user to reenter figure size
		if (size % 2 != 1) {
			System.out.print(
					"Invalid figure size- must be an odd number" + "\n" + "\n" + "Reenter the size of the figure: ");
			size = scan1.nextInt();
		}
		Scanner scan2 = new Scanner(System.in);
		System.out.println();

		// show figure MENU to user and prompt them to select a figure
		System.out.println("MENU:" + "\n" + "1. Print box" + "\n" + "2. Print diamond" + "\n" + "3. Print X" + "\n"
				+ "4. Quit program");
		System.out.print("\n");
		System.out.print("Please select an option: ");
		int option;
		option = scan2.nextInt();

		// if user inputs an invalid option prompt them to renter option
		if (option > 4 || option < 1) {
			System.out.println("Invalid option- please select from options 1-4");
			System.out.print("Please reselect an option: ");
			option = scan2.nextInt();
		}

		// if user selects option 1 invoke method printBox and send user into MENU loop
		if (option == 1) {
			printBox(size);
			System.out.println("");
			System.out.println("MENU:" + "\n" + "1. Print box" + "\n" + "2. Print diamond" + "\n" + "3. Print X" + "\n"
					+ "4. Quit program");
			System.out.print("\n");
			System.out.print("Please select an option: ");
			option = scan2.nextInt();
		}

		// if user selects option 2 invoke method printDiamond and send user into MENU
		// loop
		if (option == 2) {
			printDiamond(size);
			System.out.println("");
			System.out.println("MENU:" + "\n" + "1. Print box" + "\n" + "2. Print diamond" + "\n" + "3. Print X" + "\n"
					+ "4. Quit program");
			System.out.print("\n");
			System.out.print("Please select an option: ");
			option = scan2.nextInt();
			System.out.println("");
		}

		// if user selects option 3 invoke method printX and send user into MENU loop
		if (option == 3) {
			printX(size);
			System.out.println("");
			System.out.println("MENU:" + "\n" + "1. Print box" + "\n" + "2. Print diamond" + "\n" + "3. Print X" + "\n"
					+ "4. Quit program");
			System.out.print("\n");
			System.out.print("Please select an option: ");
			option = scan2.nextInt();
			System.out.println("");
		}

		// if user selects option 4 print "Good bye!"
		if (option == 4) {
			System.out.println("Good bye!");
			System.exit(0);
		}
		scan1.close();
		scan2.close();
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