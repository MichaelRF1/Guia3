package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero 1....: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese numero 2....: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingrese numero 3....: ");
		int n3 = sc.nextInt();
		
		System.out.print("Ingrese numero 4....: ");
		int n4 = sc.nextInt();
		
		System.out.print("Ingrese numero 5....: ");
		int n5 = sc.nextInt();
		
		String estado = "";
		
		if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5)
			estado = "El numero menor es " + n1;

		else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5)
			estado = "El numero menor es " + n2;

		else if (n3 < n1 && 31 < n2 && n3 < n4 && n3 < n5)
			estado = "El numero menor es " + n3;

		else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5)
			estado = "El numero menor es " + n4;

		else if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4)
			estado = "El numero menor es " + n5;
		
		System.out.println("\n" + estado);
		
	

	}

}
