package es.mavenproject1;

import java.util.Scanner;

public class ProgramaSaludo {
	public static void main(String[] args) {
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		int intentos = 0; 
		do {
			
			if(intentos >= 3) {
				System.out.println("\nOye que para salirte hay que darle al 3....\n");
			}
			
			System.out.println("Dame alguna opción:");
			System.out.println("1) Saludar");
			System.out.println("2) Dar las gracias");
			System.out.println("3) Despedirse");
			System.out.print("Opcion: ");
			
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Hola buenas");
				break;
			case 2:
				System.out.println("¡De nada!");
				break;
			case 3:
				System.out.println("¡Adios!");
				break;
			default:
				System.out.println("¡ERROR!");
				break;
			}
			intentos++;
		}while(opcion != 3);
	}
}
