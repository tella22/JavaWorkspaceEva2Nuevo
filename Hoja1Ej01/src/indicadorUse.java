import java.util.*;

/**
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador
 * que sea la representación de un indicador de la vida real (indicadores de
 * nivel, de velocidad, tacómetros, etc). Deberá tener los mínimos elementos
 * para representar valores, ajustarlos con un valor de inicio, imprimir el
 * valor, modificarlos a un valor determinado e incrementar y disminuir el valor
 * con el que cuentan.
 * 
 * @author Jose Antonio Tella
 * @see Indicador.java
 */

public class indicadorUse {

	public static void main(String[] args) {
//		Indicador coche;
//		coche = new Indicador();
		int vel, velMax, velMin, num;

		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce la velocidad");
		vel = teclado.nextInt();
		System.out.println("introduce la velocidad máxima");
		velMax = teclado.nextInt();
		System.out.println("introduce la velocidad mínima");
		velMin = teclado.nextInt();

		Indicador coche = new Indicador(vel, velMax, velMin);

		System.out.println("Velocidad actual " + coche.total() + " km/H");

		do {
			System.out.println("1 para incrementar, 2 para disminuir, 0 para salir");
			num = teclado.nextInt();
			if (num == 1) {
				coche.velocidadSuma();
			} else if (num == 2) {
				coche.velocidadResta();
			}
			System.out.println("Velocidad actual " + coche.total() + " km/H");
		} while (num != 0);

		teclado.close();
	}
}
