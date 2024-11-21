package fibonacci;

public class fibonnacci {
	
public static void fibonnacci(int n) {
		
		/*
		 * Basado en el de Wikipedia
		 */
		
		// c = a + b
		int a = 0, b = 1, c;
		
		
		for(int i = 0; i < n; i++) {
			
			c = a + b;
			
			System.out.print(a + " ");
			
			b = a;
			a = c;
		}
	}
}
