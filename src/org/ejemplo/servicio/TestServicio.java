package org.ejemplo.servicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/*
 * 1.- TODOS LOS METODOS DEBEN LLEVAR LA ANOTACIÓN @Test
 * 2.- TODOS LOS NOMBRES DE LOS METODOS DEBEN COMENZAR CON test
 * 
 */
class TestServicio extends TestCase{

	ServicioEmpleado servicioEmpleado = null;
	
	@Test
	void test() {
		servicioEmpleado = new ServicioEmpleado();
	}
	
	@Test
	public  void testSalarioBono() {
		test();
		assertTrue(servicioEmpleado.salarioBono(10000.0, 5000.0) == 15000.0);
	}

	@Test
	public  void testSalarioPrestamo() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamo(10000.0, 5000.0),5000.0);
	}

}







