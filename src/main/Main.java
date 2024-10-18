/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opc = 0;

		do {
			System.out.println("¿Que deseas hacer?");
			System.out.println("1. Sumar.");
			System.out.println("2. Restar.");
			System.out.println("3. Multiplicar.");
			System.out.println("4. Dividir.");
			System.out.println("5. Salir.");
			System.out.println("Elige una opcion.");

			opc = getIntInput(sc);

			switch (opc) {
			case 1:
				suma(sc);
				break;
			case 2:
				resta(sc);
				break;
			case 3:
				multiplicacion(sc);
				break;
			case 4:
				division(sc);
				break;
			case 5:
				System.out.println("Saliendo de la calculadora...");
			default:
				System.out.println("Introduce una opción correcta.");
				break;
			}

		} while (opc != 5);
		
		sc.close();
	}

	private static int getIntInput(Scanner sc) {
		// TODO Auto-generated method stub
		while (true) {
			
			try {
				return sc.nextInt();
				
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Por favor, introduce un número válido. ");
				sc.next();
			}


		}
	}

	private static void suma(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el primer sumando");
		int num1 = getIntInput(sc);
		System.out.println("Introduce el segundo sumando");
		int num2 = getIntInput(sc);

		int resultado = num1 + num2;

		System.out.println("El resultado de la suma es : " + resultado);
	}

	private static void resta(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el minuendo");
		int num1 = getIntInput(sc);
		System.out.println("Introduce el sustraendo");
		int num2 = getIntInput(sc);

		int resultado = num1 - num2;

		System.out.println("El resultado de la resta es : " + resultado);
	}

	private static void multiplicacion(Scanner sc) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el multiplicando");
		int num1 = getIntInput(sc);
		System.out.println("Introduce el multiplicador");
		int num2 = getIntInput(sc);

		int resultado = num1 * num2;

		System.out.println("El resultado de la multiplicacion es : " + resultado);

	}

	private static void division(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Introduce el dividendo");
		int num1 = getIntInput(sc);
		System.out.println("Introduce el divisor");
		int num2 = getIntInput(sc);
		
		if(num2 == 0) {
			System.out.println("Error, no se puede dividir entre 0.");
			
		} else {
			
			int resultado = num1 / num2;
			System.out.println("El resultado de la division es : " + resultado);
			
		}


	}

}