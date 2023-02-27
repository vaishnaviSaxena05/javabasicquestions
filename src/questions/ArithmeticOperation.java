package questions;

public class ArithmeticOperation {
//Basic arithmetic operations
	public static void main(String[] args) {

		add();
		System.out.println("");
		subtraction();
        System.out.println();
        multiplication();
		System.out.println();
		division();
		
	}

	public static void add() {

		int num1 = 56;
		int num2 = 45;
		int sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}

	public static void subtraction() {

		int num1 = 79;
		int num2 = 433;
		int sum = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + sum);

	}
    
	public static void multiplication() {
		int num1 = 4678;
		int num2 = 10;
		int sum = num1 *num2;
		System.out.println(num1+" * "+num2+" = "+sum);
	}
	public static void division() {
		double num1 = 20;
		double num2 = 10;
		double sum = num1/num2;
		System.out.println(num1+" / "+num2+" = "+sum);
	}
}
