package repaso1;

public class Algorithm3 {

	public static void main(String[] args) {
		int[] integers = {2,324,34,3,0,3453, 453};
		System.out.println(integers.length);
		//create an array with capacity 20000
		int[] ints = new int [20000];
		ints[499] = 34234;
		System.out.println(ints[499]);
		float[] fls = {324,234};
		Calculator[] cls = {new Calculator(), new Calculator()};
		System.out.println(cls[0]);
		System.out.println(cls[1]);
		
		
		
		
		int numero_mayor = integers[0];
		int second_max= integers[0]; 
		
		
		
		
		for (int i = 0; i < integers.length; i++) {
			if (numero_mayor < integers[i]) {
			
			second_max = numero_mayor;
			numero_mayor = integers[i];
				
			}
			
			else if (integers[i] >  second_max ) {
				second_max = integers[i];
				
				
			}
		
			
		
		
		System.out.println(numero_mayor);
		System.out.println(second_max);
			
			
			
		
		}
	}
}

	
	
			
		
	
		
	
	
	
	

 