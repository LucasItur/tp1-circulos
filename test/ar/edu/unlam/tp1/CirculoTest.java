package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

		
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo Circulo1 = new Circulo(2.0);		
		assertEquals(2.0, Circulo1.getRadio(),0.01);		
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo Circulo2 = new Circulo(3.7);
		assertEquals(3.7, Circulo2.getRadio(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo Circulo3 = new Circulo(5.0);
		assertEquals(5.0, Circulo3.getRadio(),0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo Circulo4 = new Circulo(10.9);
		assertEquals(10.9, Circulo4.getRadio(),0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		Circulo Circulo5 = new Circulo(9.8);				
		assertEquals(301.71, Circulo5.calcularArea(9.8), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo Circulo6 = new Circulo(16.6);		
		assertEquals(865.69, Circulo6.calcularArea(16.6),0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}
	
}
