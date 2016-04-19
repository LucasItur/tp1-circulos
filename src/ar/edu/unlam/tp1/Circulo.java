package ar.edu.unlam.tp1;

public class Circulo {
	private Double radio;

	
	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

		
	public Circulo(Double radio){
		this.radio = radio;		
	}
	
	
	public Double calcularArea(Double radio){
		return (radio * radio * Math.PI);
	
	}
	
	public Double calcularPerimetro(Double radio){
		return (2 * radio * Math.PI);
 		
	}
}
