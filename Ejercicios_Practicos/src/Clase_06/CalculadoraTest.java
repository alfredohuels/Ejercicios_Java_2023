package Clase_06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;

class CalculadoraTest {

	int n;
		
	@BeforeEach     // Se realiza antes de cada metodo
	void beforeEach() {
		n = 7;		
		System.out.println("beforeEach valor de n es : "+n);
	}

	@AfterEach      // Se realiza despues de cada metodo
	void AfterEach() {
		n = 0;		
		System.out.println("AfterEach valor de n es : "+n);
	}

	
	@Test
	void sumarTest() {
		System.out.println("Ingreso al metodo suma(), valor de n es : "+n);		
		assertEquals(Calculadora.sumar(1, 6), n);
	}
	
	@Test
	void restarTest() {
		n = n - 2;
		System.out.println("Ingreso al metodo resta(), valor de n es : "+n);		
		assertEquals(Calculadora.restar(6, 1), n);
	}
	
	@Test
	void dividirTest() {
		n = n - 5;
		System.out.println("Ingreso al metodo dividir(), valor de n es : "+n);	
		assertEquals(Calculadora.dividir(4, 2), n);
	}
	
	@Test
	void multiplicarTest() {
		n = n + 1;
		System.out.println("Ingreso al metodo multipicar(), valor de n es : "+n);		
		assertEquals(Calculadora.multiplicar(4, 2), n);
	}

}
