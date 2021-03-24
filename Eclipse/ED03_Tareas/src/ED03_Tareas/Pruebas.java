package ED03_Tareas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Pruebas {
	int a= 200;
	
	/**
	 * Ingresa una cantidad y comprueba que se a metido correctamente
	 */
	@Test
	void ingresarTestCorrecto() {
		//resultado esperado = Verde
		CCuenta c = new CCuenta("hola", "miCuenta", 600, 0);
		try {
			c.ingresar(a);
			assertEquals(c.estado(), 800);
		} catch (Exception e) {
			System.out.println("Algo tienes mal");
		}
	}
	
	/**
	 * Ingresa una cantidad y comprueba que no es correcto al 
	 * igualarlo con un estado incorrecto
	 */
	@Test
	void ingresarTestError() {
		//resultado esperado = Rojo
		CCuenta c = new CCuenta("hola", "miCuenta", 600, 0);
		try {
			c.ingresar(a);
			assertEquals(c.estado(), 100);
		} catch (Exception e) {
			System.out.println("Algo tienes mal");
		}
	}
	
	/**
	 * Retira una cantidad y comprueba que se a retirado correctamente
	 */
	@Test
	void retirarTestCorrecto() {
		//resultado esperado = Verde
		CCuenta c = new CCuenta("hola", "miCuenta", 600, 0);
		try {
			c.retirar(a);
			assertEquals(c.estado(), 400);
		} catch (Exception e) {
			System.out.println("Algo tienes mal");
		}
	}
	
	/**
	 * Retira una cantidad y comprueba que no es correcto al 
	 * igualarlo con un estado incorrecto
	 */
	@Test
	void retirarTestError() {
		//resultado esperado = Rojo
		CCuenta c = new CCuenta("hola", "miCuenta", 600, 0);
		try {
			c.retirar(a);
			assertEquals(c.estado(), 800);
		} catch (Exception e) {
			System.out.println("Algo tienes mal");
		}
	}
	
	/**
	 * Ingresa y retira una cantidad y comprueba que se a 
	 * retirado y ingresa correctamente
	 */
	@Test
	void ambosTestCorrecto() {
		//resultado esperado = Verde
		CCuenta c = new CCuenta("hola", "miCuenta", 600, 0);
		try {
			c.retirar(a);
			c.ingresar(a);
			assertEquals(c.estado(), 600);
		} catch (Exception e) {
			System.out.println("Algo tienes mal");
		}
	}
	
	/**
	 * Ingresa y retira una cantidad y comprueba que no es correcto al 
	 * igualarlo con un estado incorrecto
	 */
	@Test
	void ambosTestError() {
		//resultado esperado = Rojo
		CCuenta c = new CCuenta("hola", "miCuenta", 600, 0);
		try {
			c.retirar(a);
			c.ingresar(a);
			assertEquals(c.estado(), 800);
		} catch (Exception e) {
			System.out.println("Algo tienes mal");
		}
	}
	

}
