package Clase_07;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class TestCarrito {
	
    Producto producto1 = new Producto("arroz","12345A",2000.0f);
    Producto producto2 = new Producto("mayonesa","12121M", 500.0f);
    Producto producto3 = new Producto("sal","12334S", 250.0F);
    Carrito miCarrito = new Carrito (producto1, producto2, producto3,
        		                     LocalDateTime.parse("2023-03-24T11:11:00"));		
	
	@Test
	void testCostoFinalDescuentoFijo() {

        Descuento desFijo = new DescuentoFijo(1000);        
        float valorFinal = miCarrito.costoFinal(desFijo); 
        
        assertEquals(valorFinal, 1750);		
	}

	@Test
	void testCostoFinalDescuentoPorcentaje() {
        
        Descuento desPorcentaje = new DescuentoPorcentaje(0.20f);        
        float valorFinal = miCarrito.costoFinal(desPorcentaje);
  
        assertEquals(valorFinal, 2200);		
	}

	@Test
	void testCostoFinalDescuentoPorcentajeConTope() {
        
        Descuento desPorcentajeConTope = new DescuentoPorcentajeConTope(0.30f);  // marco el tope    
        desPorcentajeConTope.setValorDesc(0.35f); // intento setear el % descuento
        float valorFinal = miCarrito.costoFinal(desPorcentajeConTope);
  
        assertEquals(valorFinal, 2750);		//2750 porque no deberia no permitir aplicar % de descuento
	}

}
