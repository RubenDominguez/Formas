package ar.edu.unlam.tallerweb;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuadradoTest {

	@Test
	public void testCalcularArea() {
		Cuadrado cuadrado = new Cuadrado();
		
		assertTrue(cuadrado.area(4)==16);
	}
	
	@Test
	public void testCalcularPerimetro() {
		Cuadrado cuadrado = new Cuadrado();
		
		assertTrue(cuadrado.perimetro(5)==20);
	}

}
