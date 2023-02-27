package questions;

public class Factorial {
	public static void main(String[] args) {

		int sum = 1;
		int n = 10;
		for (int i = n; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println("factorial of 10!--> "+sum);
	}
}
