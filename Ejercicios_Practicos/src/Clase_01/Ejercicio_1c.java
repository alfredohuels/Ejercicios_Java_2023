/*
   1. c. A lo anterior, con una variable extra, elija si se deben mostrar 
         los números pares o impares
*/

package Clase_01;

public class Ejercicio_1c {

	public static void main(String[] args) {
		int numeroInicio = 5; 
		int numeroFin = 14; 
		int par = 0; // poner 0 para par o poner 1 para impar
		   while (numeroInicio < numeroFin) {
		      if(numeroInicio % 2 == par) { 
		    	  System.out.println(numeroInicio);}
		      numeroInicio ++ ;
		      
		   } 
	}

}
