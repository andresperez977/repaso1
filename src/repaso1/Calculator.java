package repaso1;



public class Calculator {
	
	public static final double PI = 3.14;
	public final double PI_2 = 3.14;
	public static int number = 0;
	public int number2= 0;
	
	public static float modulus(float num1, int num2) {
		number = 10;
		return num1 %num2;
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double division(double num1, double num2) {
		return num1 / num2;
	}
	public  float modulus1(float num1, int num2) {
		number2= 10;
		modulus(23, 30);
		return num1 %num2;
	}
}
 

