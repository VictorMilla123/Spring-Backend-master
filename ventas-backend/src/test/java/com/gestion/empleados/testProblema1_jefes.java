package com.gestion.empleados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class testProblema1_jefes {


	static Map<Integer, List<Integer>> graph;
	
	public static void main(String[] args) {

		
		        // Ejemplo de relaciones entre empleados (representado como un grafo dirigido)
		        int[][] relaciones = {
		            {0, 1}, // Empleado 0 es jefe del Empleado 1
		            {1, 2}, // Empleado 1 es jefe del Empleado 2
		            {2, 3}, // Empleado 2 es jefe del Empleado 3
		            {1, 4}, // Empleado 1 es jefe del Empleado 4
		            {4, 5}  // Empleado 4 es jefe del Empleado 5
		        };

		        // Construir el grafo dirigido
		        graph = new HashMap<>();
		        for (int[] relacion : relaciones) {
		            int jefe = relacion[0];
		            int empleado = relacion[1];
		            graph.putIfAbsent(jefe, new ArrayList<>());
		            graph.get(jefe).add(empleado);
		        }

		        int empleadoX = 1; // Empleado X
		        int empleadoY = 2; // Empleado Y

		        boolean esJefe = esJefeDe(empleadoX, empleadoY);
		        
		        if (esJefe) {
		            System.out.println("El empleado " + empleadoX + " es jefe del empleado " + empleadoY);
		        } else {
		            System.out.println("El empleado " + empleadoX + " NO es jefe del empleado " + empleadoY);
		        }
		    }

		    // Función para determinar si X es jefe de Y
		    static boolean esJefeDe(int empleadoX, int empleadoY) {
		        Set<Integer> visitados = new HashSet<>();
		        return buscaJefe(empleadoX, empleadoY, visitados);
		    }

		    static boolean buscaJefe(int actual, int empleadoY, Set<Integer> visitados) {
		        if (actual == empleadoY) {
		            return true;
		        }
		        if (graph.containsKey(actual)) {
		            for (int subordinado : graph.get(actual)) {
		                if (!visitados.contains(subordinado)) {
		                    visitados.add(subordinado);
		                    if (buscaJefe(subordinado, empleadoY, visitados)) {
		                        return true;
		                    }
		                }
		            }
		        }
		        return false;
		    }
		}


