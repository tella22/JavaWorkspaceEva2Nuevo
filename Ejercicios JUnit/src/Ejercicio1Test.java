import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Ejercicio1Test {

	@Test
	public void pruebaMetodo() {
		Ejercicio1 ej1 = new Ejercicio1();
		int resultado;
		
		assertEquals("deberia dar 1", 1, ej1.metodo(true, true, true));
		
		assertEquals("deberia dar 2", 2, ej1.metodo(false, true, true));
		
		assertEquals("deberia dar 2", 2, ej1.metodo(false, false, true));
		
		assertEquals("deberia dar 2", 2, ej1.metodo(true, false, true));
		
	}
	
}
