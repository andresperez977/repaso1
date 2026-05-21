package repaso1;

public class VariableTest {

	public static void main(String[] args) {
		// primitive variables(tipos mas sencillos)
		var num1 = 1.0;
		int num2 = 47;
		var resultado = (int) num1 + num2;
		System.out.println(resultado);
		resultado = Calculator.sum((int) num1, num2);

		double result2 = num1 / num2;
		System.out.println(result2);

		// reference variables

		result2 = Calculator.division(num1, num2);
		System.out.println(result2);
		System.out.println(Calculator.modulus(3.2f, 3));

		

		}

	}
