package Clase_07;

public class DescuentoPorcentajeConTope extends DescuentoPorcentaje{

	private float tope;
	 
	public DescuentoPorcentajeConTope(float tope) {
		super(0);
		this.tope = tope;		
	}

	public float getTope() {
		return this.tope;
	}
	
	public void setTope(float nuevoValor) {
		this.tope = nuevoValor;
	}
	
	@Override
	public void setValorDesc (float valor) {
		if (valor > this.tope) {
			super.setValorDesc(0);
			System.out.println("El porcentaje de descuento no es valido..."
				     	      + "\nSupera el valor maximo permitido.");
		} else {
			super.setValorDesc(valor);
		}
	}
	
}