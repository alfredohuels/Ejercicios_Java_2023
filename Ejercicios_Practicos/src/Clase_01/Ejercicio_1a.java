/*
 1. Vamos a practicar operaciones básicas con números
   a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
      y “b”. Su código puede arrancar (por ejemplo):
             int numeroInicio = 5;
             int numeroFin = 14;
   // Se deberían mostrar los números:
         5,6,7,8,9,10,11,12,13,14 
*/

package Clase_01;

public class Ejercicio_1a {

	public static void main(String[] args) {
		int numeroInicio = 5;
        int numeroFin = 14;
        while (numeroInicio <= numeroFin) {
            System.out.println(numeroInicio);
            numeroInicio++;
   	    }
	}
}