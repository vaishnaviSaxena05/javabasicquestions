package questions;

import java.util.Scanner;

public class Multiplication {
	
	//Print all the multiplication tables with numbers from 1 to 10
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the table of the number ");
		int n = sc.nextInt();
		for(int i=0;i<=10;i++) {
			int sum = n*i;
			System.out.println(n+" * "+i+" = "+sum);
			
		}

	}

}
