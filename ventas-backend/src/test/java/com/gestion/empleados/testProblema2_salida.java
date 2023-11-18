package com.gestion.empleados;

import java.util.Scanner;

public class testProblema2_salida {
/*
 Este código modificado maneja el caso en el que Leopoldo no puede conseguir 
 los libros con las personas disponibles, imprimiendo -1 en ese caso específico. 
 Para todos los demás escenarios, imprime la cantidad mínima de personas necesarias 
 para conseguir los libros.
  
 */
	    public static void main(String[] args) {
	    	
	    	String s = "8 1 15 1 10";
	        Scanner scanner = new Scanner(s);

	        long distanciaLibros = scanner.nextLong();
	        int cantMejoresAmigos = scanner.nextInt();
	        long distanciaMejoresAmigos = scanner.nextLong();
	        int cantOtrosCompaneros = scanner.nextInt();
	        long distanciaOtrosCompaneros = scanner.nextLong();

	        long minPersonas = personasNecesarias(distanciaLibros, cantMejoresAmigos, distanciaMejoresAmigos,
	                cantOtrosCompaneros, distanciaOtrosCompaneros);

	        if (minPersonas == Long.MAX_VALUE) {
	            System.out.println(-1); // No se pueden conseguir los libros con las personas disponibles
	        } else {
	            System.out.println(minPersonas);
	        }
	        scanner.close();
	    }

	    public static long personasNecesarias(long distanciaLibros, int cantMejoresAmigos, long distanciaMejoresAmigos,
	                                          int cantOtrosCompaneros, long distanciaOtrosCompaneros) {
	        long left = 0;
	        long right = distanciaLibros;

	        long minPersonas = Long.MAX_VALUE;

	        while (left <= right) {
	            long mid = left + (right - left) / 2;

	            long personasMejoresAmigos = Math.min(cantMejoresAmigos, mid / distanciaMejoresAmigos);
	            long personasOtrosCompaneros = Math.min(cantOtrosCompaneros, (distanciaLibros - mid) / distanciaOtrosCompaneros);

	            if (personasMejoresAmigos + personasOtrosCompaneros >= distanciaLibros) {
	                minPersonas = Math.min(minPersonas, personasMejoresAmigos + personasOtrosCompaneros);
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }

	        return minPersonas;
	    }
	
	
}
