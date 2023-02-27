package questions;

import java.util.Scanner;

public class SumOfTwoNum {
//	Sum of two numbers
public static void main(String[] args) {
	Sum();
}
	public static int Sum() {
		Scanner sc = new Scanner(System.in);
		int sum;
		System.out.println("enter num and num2");
        int num = sc.nextInt();
		int num2 = sc.nextInt();
	    	sum = num +num2;
	    	System.out.println("sum is --> "+sum);
	    	return sum;
	}
}
