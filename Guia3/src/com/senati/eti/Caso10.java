package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre = "", estado = "", continuar = "S";
		int num_reg = 0 , ht = 0, th= 0, mt = 0 , s_bru = 0;
		float bon = 0 , desc = 0 ,s_net = 0 , alca = 0;
		
		while(continuar.equals("S") || continuar.equals("s")) {
			num_reg++;
			
			System.out.println("*******************************");
			System.out.println("Registro de Empleados(" + num_reg + ")");
			System.out.println("*******************************");
			
			System.out.print("Empleado: ");
			nombre = sc.nextLine();
			
			System.out.print("Horas trabajadas: ");
			ht = sc.nextInt();
			
			System.out.print("Tarifa por hora: ");
			th = sc.nextInt();
			
			System.out.print("Minutos de tardanzas: ");
			mt = sc.nextInt();
			
			System.out.println("**********************");
			
			s_bru = ht*th;
			
			if (ht <= 50) {
				bon = s_bru*0.02f;
			}
			
			else if (ht > 50 && ht <= 60) {
				bon = s_bru*0.08f;	
			}
			
			else if (ht > 70 && ht <= 80) {
				bon = s_bru*0.13f;	
			}
			else if (ht > 80 ) {
				bon = s_bru*0.15f;	
			}
			
			if (mt <= 15) {
				desc = 0;
			}
			
			else if (mt > 15 && mt <= 30) {
				desc = s_bru*0.003f;
			}
			
			else if (mt > 30) {
				desc = s_bru*0.005f;
			}
			
		    s_net = (s_bru+bon)-desc;
			
		    alca = (ht * 100) / 80;
			
			System.out.println("****************");
			System.out.println("   Resultados   ");
			System.out.println("****************");
			System.out.println("Sueldo bruto    : " + s_bru);
			System.out.println("Bonificacion    : " + bon);
			System.out.println("Descuento       : " + desc);
			System.out.println("Sueldo neto     : " + s_net);
			System.out.println("%Alcanzado      : " + alca);
			System.out.println("************************");
			
			//Reinicio de la lectura
			sc.nextLine();
			System.out.print("\n¿Nuevo empleado? [S/N]: ");
			System.out.print("\n*********************** ");
			continuar = sc.nextLine();
			

		}

	}

}