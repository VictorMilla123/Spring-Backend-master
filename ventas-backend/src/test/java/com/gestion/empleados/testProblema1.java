package com.gestion.empleados;


public class testProblema1 {

	/*
		Aqui la función calcularSalariosEmpleados toma dos parámetros: 
		el arreglo de relacionesEmpleados y el arreglo de salariosEmpleados. 
		Itera sobre la matriz relacionesEmpleados, donde 'Y' indica que el empleado i es el jefe directo del empleado j, 
		y suma los salariosEmpleados correspondientes según esten relacionesEmpleados. 
		El método main se ejecuta primero y alli se declaran los valores de los arreglos relacionesEmpleados y 
		se proporciona un ejemplo de relacionesEmpleados y salariosEmpleados para probar la función calcularSalariosEmpleados.
	*/
	
    public static int calcularSalariosEmpleados(String[] relacionesEmpleados, int[] salariosEmpleados) {
        int sumaSalarios = 0;

        for (int i = 0; i < relacionesEmpleados.length; i++) {
            for (int j = 0; j < relacionesEmpleados[i].length(); j++) {
                if (relacionesEmpleados[i].charAt(j) == 'Y') {
                    sumaSalarios += salariosEmpleados[j];
                }
            }
        }

        return sumaSalarios;
    }

    public static void main(String[] args) {
        // Ejemplo de relacionesEmpleados y salariosEmpleados
        String[] relacionesEmpleados = {
		"NNYN",
		"NNYN",
		"YNNN",
		"NYYN"
        };


        int[] salariosEmpleados = {1, 1, 1, 1}; // Salarios de los empleados

        int totalSalarios = calcularSalariosEmpleados(relacionesEmpleados, salariosEmpleados);
        System.out.println("La suma de los salarios de todos los empleados es: " + totalSalarios);
    }
}


