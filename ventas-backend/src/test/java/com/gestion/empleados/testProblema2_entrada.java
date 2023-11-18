package com.gestion.empleados;

import java.util.Scanner;

public class testProblema2_entrada {

	/*
Este código utiliza una búsqueda binaria para encontrar la cantidad mínima de personas necesarias. 
Toma los valores de entrada y utiliza la función personasNecesarias para calcular esta cantidad mínima.

El algoritmo se basa en encontrar la cantidad de mejores amigos 
y compañeros necesarios para cubrir la distancia requerida. Luego, 
ajusta los límites izquierdo y derecho de la búsqueda binaria según sea necesario para encontrar la solución óptima.

Esto debería ayudar a Leopoldo a determinar la cantidad mínima de personas 
que necesita molestar para conseguir sus libros.
	 */
	 public static void main(String[] args) {
	
		String s = "8 1 15 1 10";
	    Scanner scanner = new Scanner(s);		// System.in
	
	    long distanciaLibros = scanner.nextLong();
	    int cantMejoresAmigos = scanner.nextInt();
	    long distanciaMejoresAmigos = scanner.nextLong();
	    int cantOtrosCompaneros = scanner.nextInt();
	    long distanciaOtrosCompaneros = scanner.nextLong();
	
	    long minPersonas = personasNecesarias(distanciaLibros, cantMejoresAmigos, distanciaMejoresAmigos,
	            cantOtrosCompaneros, distanciaOtrosCompaneros);
	
	    System.out.println(minPersonas);
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
