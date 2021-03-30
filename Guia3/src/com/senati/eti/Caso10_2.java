package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso10_2 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        String continuar = "S";
        int i = 1, si = 0;
        float ht =0 , tp = 0,s_bruto = 0, dsc = 0, minu = 0, bon = 0, alc = 0, men = 0 , may = 0;
        String mayor = "", menor = "", cm = "";
        
       
        String con = continuar.toUpperCase();
        // Con de continuar
        while ( con.equals("S")) {
        
        System.out.println("\n------------------------------");
        System.out.println("Registro de empleado ("+ (i) + "):");
        System.out.println("------------------------------");
        
        System.out.print("Empleado: ");
        String name = sc.nextLine();
        
        System.out.print("Horas trabajadas: ");
        ht = sc.nextFloat();
        System.out.print("Tarifa por hora :  ");
        tp = sc.nextFloat();
        
        Float [] arrmin = new Float[i];
        
        System.out.print("Minutos de tardanza :  ");
        arrmin[i-1] = sc.nextFloat();
        
        sc.nextLine();
        
        s_bruto = ht * tp;
        
        
        if ( ht > 80) 
        	bon = s_bruto *0.15f;
        else if ( ht > 70 && ht <= 80) 
        	bon = s_bruto * 0.13f;
        else if ( ht > 60 && ht <= 70) 
        	bon = s_bruto * 0.08f;
        else if ( ht > 50 && ht <= 60) 
        	bon = s_bruto * 0.02f;
        else bon = 0;
        
        
        if (arrmin[i-1] <= 15) 
        	dsc = 0;
        else if ( arrmin[i-1]  > 15 && arrmin[i-1]  <=  30) 
        	dsc = arrmin[i-1] * (s_bruto*0.03f);
        else if ( arrmin[i-1]  > 30) 
        	dsc = arrmin[i-1] * (s_bruto*0.05f);
        
        Float [] arrneto = new Float[i];
       
        arrneto [i-1] = s_bruto + bon - dsc;
        
        alc = (ht * 100f)/80f;
        
       
        if ( (i-1) == 0) {
            may = arrneto[i-1];
            men = arrneto[i-1];
            minu = arrmin[i-1];
            mayor = name;
            menor = name;
            cm = name;
          }
        //Las condiciones para hallar los netos mayoresa,menores y minutos mayores con sus respectivos nombres
        if (arrneto[i-1] < men) {
            men = arrneto[ i-1];
            menor = name;
          }
        if (arrneto[i-1] > may) {
            may = arrneto[ i-1];
            mayor = name;
          }
        if (arrmin[i-1] > minu) {
            minu = arrmin[ i-1];
            cm = name;
          }
         
         //Utilizamos el contador para poder saber cuantas personas superaron o igualaron el 90 %
         if ( alc >= 90) si = si +1;
         
         //Expresamos el resultado
         System.out.println("\n-------------");
         System.out.println("Resultados");
         System.out.println("\n-------------");
         System.out.println("Sueldo bruto: "+df.format(s_bruto));
         System.out.println("Bonificacion : "+df.format(bon));
         System.out.println("Descuento : "+ df.format(dsc));
         System.out.println("Suelto neto : "+df.format(arrneto[i-1]));
         System.out.println("Asistencia  : "+df.format(alc) + "%");
         System.out.println("*******************************");
         i++;//Se aumenta en uno el contador
         
         System.out.println("\n-------------");
         System.out.print("\n¿Nuevo empleado? [ S/N ] : ");
         continuar = sc.nextLine();
         //Utilizamos el metodo toUpperCase() para convertir  un String  en mayuscula
         con = continuar.toUpperCase();
         
         }
        
         //Expresamos el resumen
         System.out.println("\n-------------------------");
         System.out.println("\nRESUMEN");
         System.out.println("\n-------------------------");
         System.out.println("Número de empleados: "+(i-1) );
         System.out.println("Sueldo neto mayor : "+ df.format(may) + " pertenece a: " + mayor);
         System.out.println("Sueldo neto menor: "+ df.format(men) + " pertenece a: " + menor);
         System.out.println("Empleado con la mayor cantidad de minutos de tandanza : "+ cm + "( " + df.format(minu)+ " min.)" );
         System.out.println("Cantidad de empleados con más del 90% de la meta: "+ si );

 

    }
}
