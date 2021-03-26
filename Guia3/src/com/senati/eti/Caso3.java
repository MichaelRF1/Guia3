package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Ingresando numero
		System.out.print("Ingrese numero: ");
		int num = sc.nextInt();
		
		// Mostrando resultados
		if (num > 7) {
			System.out.println("El numero es superior de 7");
		}
		else
			System.out.printf("El factorial de %d es %.0f ", num, factorial(num));
		
	}
	
	public static double factorial(int n) {
		double aux = 1;
		for(int i = 2; i <= n; i++) {
			aux *= i;
		}
		return aux;
	}

}
