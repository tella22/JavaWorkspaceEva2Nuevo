import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Assert.*;

public class Ejercicio2Test {
	
	@Test
	public void pruebaMetodo() {
	
		Ejercicio2 ej2 = new Ejercicio2();
		int resultado;
		
		assertEquals("deberia dar 3", 3, ej2.contar_letra("palabra", 'a'));
		assertEquals("deberia dar 0", 0, ej2.contar_letra("pelebre", 'a'));
		assertEquals("deberia dar 0", 0, ej2.contar_letra("", 'a'));
	}
}
