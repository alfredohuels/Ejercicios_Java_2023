/*
 1. Utilizando solo tipos primitivos, String (solo usar método length), vectores,
    iteraciones simples y condicionales, genere una clase por ejercicio que posea los
    siguientes métodos:
    c. dado un vector de números, y un número X, que sume todos los números > X y
       retorne el resultado
*/

package Clase_03;

public class Ejercicio_3_1c {

	public static void main(String[] args) {
	   	int[] vector = new int[] {7,9,3,6,11,22,33};  
	    System.out.println(sumaParcial(vector, 10));	
	}	
	
	public static int sumaParcial(int[] lista, int numero) {
		int resultado = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i] > numero) {
				resultado = resultado+lista[i];
			}
		}		
		return resultado;		
	}
}
