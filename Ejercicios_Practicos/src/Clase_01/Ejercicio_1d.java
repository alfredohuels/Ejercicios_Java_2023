/* 1. d. Utilizando la sentencia for, hacer lo
         mismo que en (b) pero invirtiendo el orden 
*/

package Clase_01;

public class Ejercicio_1d{
   public static void main(String[] args){
       int numeroInicio = 5; 
       int numeroFin = 14;

       for (int i = numeroFin; i >= numeroInicio; i--) {
           if(i % 2 == 0) { 
               System.out.println (i);
           }
       } 
   }
}