package repaso1;

import java.util.Scanner;

public class Algorithm1 {

	public static void main(String[] args) {
		// inputs : 3 numbers, can be represented b 3 variables

		int a, b, c;
		Scanner sc = new Scanner(System.in);// leer datos de consola
		a = sc.nextInt();// leer linea de dato y converti linea a int
		b = sc.nextInt();
		c = sc.nextInt();
		
		 Long currentTime=System.nanoTime();
		System.out.println("the result is" + combineDigits(a, b, c));
		 Long endTime=System.nanoTime();
		sc.close();
	}
/**
 * a the highest digit
 * @param a
 * @param b
 * @param c the lowest digit 
 * @return the combined integer 
 */
	private static int combineDigits(int a, int b, int c) {
		// logical operator: or ||,and &&, not !
		// Validation
		if (a > 9 || a < 0 || b < 9 || b < 0 || c > 9 || c < 0) {
			System.out.println("Your number should be single digit and non negative");
			return 0;	
			
		}  
		//if (a <= 9 && a > 0 && b <= 9 && b >= 0 && c <= 9 && c > 0 ) {
			
			
		//}
		
		// a=a * 100;
		a *= 100;
		b *= 10;
		// output
		return a + b + c;

	 } 
}
