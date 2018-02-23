import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TragaBolasEntornosTest {
		
		final String COLOR = "verde";
		final Integer BOLASCOMIDAS = 1;
		final Integer MAXBOLAS = 2;
		
		String color;
		Integer bolasComidas;
		Integer maxComidas;
		
		TragaBolasEntornos tbe = new TragaBolasEntornos(COLOR, BOLASCOMIDAS, MAXBOLAS);
		
	@Test
	public void testComida() {
		color = "verde";
		bolasComidas = 2;
		maxComidas = 2;
		
		tbe.comer();
		String cadena = tbe.visualizar();
		assertEquals("\n Datos:\n" + " Color: " + color + "\n" + " Bolas: " + maxComidas + "\n" + " bolas comidas " + bolasComidas, cadena);
	}
	
	@Test
	public void testTrotar() {
		color = "verde";
		bolasComidas = 0;
		maxComidas = 2;
		
		tbe.trotar();
		String cadena = tbe.visualizar();
		assertEquals("\n Datos:\n" + " Color: " + color + "\n" + " Bolas: " + maxComidas + "\n" + " bolas comidas " + bolasComidas, cadena);
	}
	
	@Test
	public void testDormir() {
		color = "verde";
		bolasComidas = 2;
		maxComidas = 2;
		
		tbe.dormir();
		String cadena = tbe.visualizar();
		assertEquals("\n Datos:\n" + " Color: " + color + "\n" + " Bolas: " + maxComidas + "\n" + " bolas comidas " + bolasComidas, cadena);
	}
	
}