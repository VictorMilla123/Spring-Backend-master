package com.gestion.empleados;

public class testProblema1_revisar {


	    public static int calcularSalarios(String[] relaciones) {
//	        int[] salarios = new int[relaciones.length];
	        int[] salarios = {100, 200, 300, 400};
	        boolean[] tieneSubordinados = new boolean[relaciones.length];

	        for (int i = 0; i < relaciones.length; i++) {
	            int subordinados = 0;
	            for (int j = 0; j < relaciones[i].length(); j++) {
	                if (relaciones[i].charAt(j) == 'Y') {
	                    subordinados++;
//	                    salarios[j]++;
	                }
	            }
	            tieneSubordinados[i] = subordinados > 0;
	        }

	        int totalSalarios = 0;
	        for (int i = 0; i < relaciones.length; i++) {
//	            if (!tieneSubordinados[i]) {
//	                totalSalarios += salarios[i];
//	            }
	            if (tieneSubordinados[i]) {
	                totalSalarios += salarios[i];
	            }
	        }

	        return totalSalarios;
	    }

	    public static void main(String[] args) {
	        // Ejemplo de relaciones entre empleados
	        String[] relaciones = {
	        		"NNYN",
	        		"NNYN",
	        		"YNNN",
	        		"NYYN"
	        };
	        
	        

	        int totalSalarios = calcularSalarios(relaciones);
	        System.out.println("La suma de los salarios de todos los empleados es: " + totalSalarios);
	    }
	

}
