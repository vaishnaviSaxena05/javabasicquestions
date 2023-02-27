package questions;

import java.util.Scanner;

public class Star {
	//Print a single star
	//Print a square of stars
	public static void main(String[] args) {
		
		System.out.println("print single star");
		SingleStar();
		System.out.println("enter the rows and columns");
		SquareStars();
	}

	public static void SingleStar() {
		System.out.println("*");
	}

	public static void SquareStars() {
		Scanner sc = new Scanner(System.in);
		int i, j, my_input;
		my_input = sc.nextInt();
		System.out.println("The length of a side is defined as " + my_input);
		System.out.println("The square pattern : ");
		for (i = 0; i <= my_input; i++) {
			for (j = 1; j <= my_input; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}