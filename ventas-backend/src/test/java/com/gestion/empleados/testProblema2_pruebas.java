package com.gestion.empleados;

import java.util.Scanner;

public class testProblema2_pruebas {

	public static void main(String[] args) {
 
        String s = "Gfg 9 + 6 = 12.0";
        
        // create a new scanner
        // with the specified String Object
        Scanner scanner = new Scanner(s);
  
        while (scanner.hasNext()) {
  
            // if the next is a Long,
            // print found and the Long
            if (scanner.hasNextLong()) {
                System.out.println("Found Long value :"
                                   + scanner.nextLong());
            }
  
            // if no Long is found,
            // print "Not Found:" and the token
            else {
                System.out.println("Not found Long value :"
                                   + scanner.next());
            }
        }
        scanner.close();
    }
	
}
