import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSuma() {
		Calculadora calculadora= new Calculadora(2, 2);
		int resultado = calculadora.suma();
		assertEquals("mensaje", 4, resultado);
	}

	@Test
	public void testResta() {
		Calculadora calculadora= new Calculadora(2, 2);
		int resultado = calculadora.resta();
		assertEquals("mensaje", 0, resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora calculadora= new Calculadora(2, 2);
		int resultado = calculadora.multiplica();
		assertEquals("mensaje", 4, resultado);
	}

	@Test
	public void testDivide() {
		Calculadora calculadora= new Calculadora(2, 2);
		int resultado = calculadora.divide2();
		assertEquals("mensaje", 1, resultado);
	}

}
