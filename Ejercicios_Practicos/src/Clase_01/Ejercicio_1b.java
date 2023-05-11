/*
 1.  b. A lo anterior, solo muestre los números pares
*/

package Clase_01;

public class Ejercicio_1b {

	public static void main(String[] args) {
		int numeroInicio = 5;
        int numeroFin = 14;
        while (numeroInicio <= numeroFin) {
        	if(numeroInicio % 2 == 0) { // verifico que sea par
                System.out.println(numeroInicio);
        	}    
            numeroInicio++;
   	    }
	}
}