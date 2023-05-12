/*
2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
   de un string, dado un número de desplazamiento.
    ● Por ejemplo, con desplazo de 1:
       “hola que tal” -> “ipmbarvfaubm”
        h -> i
        o -> p
    ● con desplazo de 2
       “hola que tal” -> “jqncbswgbvcn”
        h -> j
        o -> q
En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por
ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde
arr es un char[]. Tenga a mano los javadocs del mismo
Si tiene alguna duda de alguna parte que no vimos en clase, esta referencia es muy útil
https://www.w3schools.com/java/default.asp

*/

package Clase_03;

public class Ejercicio_3_2 {

public static void main(String[] args) {
	
	String cadena = "hola a todos";
	String cadenaCodif = codificar(cadena, 2);
	String cadenaDecodif = decodificar (cadenaCodif,-2);
			
	System.out.println("Frase original------: "+cadena);
	System.out.println("Frase codificada----: "+cadenaCodif);
	System.out.println("Frase decodificada--: "+cadenaDecodif);	
}

public static String codificar (String cadena, int nroDesplazamiento) {
	String nueva = "";
	for (int i = 0; i < cadena.length(); i++) {
		nueva = nueva + siguienteCaracter (cadena.charAt(i), nroDesplazamiento);			
	}
	return nueva;
}

public static String decodificar (String cadena, int nroDesplazamiento) {
	String nueva = "";
	for (int i = 0; i < cadena.length(); i++) {
		nueva = nueva + siguienteCaracter (cadena.charAt(i), nroDesplazamiento);			
	}
	return nueva;
}

public static char siguienteCaracter(char letra, int nroDesplazamiento) {
	String abc = "abcdefghijklmnñopqrstuvwxyz -";
	char letraSiguiente = '-';
	for (int i = 0; i < abc.length(); i++) {
		if(abc.charAt(i)==letra) {
			int pos = i + nroDesplazamiento;
			if(pos >= abc.length()) {
				pos = pos - abc.length();
			}
			else if(pos < 0) {
				pos = abc.length() + pos;
			}
			letraSiguiente = abc.charAt(pos);
		}			
	}
	return letraSiguiente;
}	

}
