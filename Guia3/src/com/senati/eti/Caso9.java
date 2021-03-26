package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", estado = "", continuar = "S";
		int num_reg = 0 , n1 = 0, n2 = 0, n3 = 0 , prom = 0 , asi = 0 ;
		float asis = 0;
		
		while(continuar.equals("S") || continuar.equals("s")) {
			num_reg++;
			
			System.out.println("---------------");
			System.out.println("Registro [" + num_reg + "]: ");
			System.out.println("---------------");
			
			System.out.print("Nombre del almuno: ");
			nombre = sc.nextLine();
			
			System.out.print("Nota 1: ");
			n1 = sc.nextInt();
			
			
			System.out.print("Nota 2: ");
			n2 = sc.nextInt();
			
			System.out.print("Nota 2: ");
			n3 = sc.nextInt();
			
			System.out.print("Asistencia [1-12]: ");
			asi = sc.nextInt();
			
			prom = (n1+n2+n3)/3;
			  
			
			
			if (prom > 13 && asi > 8) { 
				estado = "Obtiene Certificado";
			}
			
			else
				estado = "Sin Certificado";
			
			asis = (asi * 100) / 12;
			
			System.out.println("----------------");
			System.out.println("---Resultados---");
			System.out.println("----------------");
			
			System.out.println("Promedio.....: " + prom);
			System.out.println("Asistencia...: " + asis + "%");
			System.out.println("Estado.......: " + estado);
			
			
			//Reinicio de la lectura
			sc.nextLine();
			System.out.print("\n¿Registrar otro? [S/N]: ");
			continuar = sc.nextLine();
			
			
		}
		
	}

}