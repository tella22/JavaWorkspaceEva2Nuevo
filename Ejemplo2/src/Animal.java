import utilidades.Leer;

public class Animal {

	private int numCrias;

	Animal(){
		System.out.print("\n\tHa nacido un animal ");
	}
	
	Animal( int numCrias) {
		this.numCrias = numCrias;
	}

	public void alimentarse() {
		/*
		 * Uso esta funci�n con el fin de ver que es una funci�n de la clase
		 * Animal y la puede usar cualquier clase, como si fuera suya, que
		 * herede de dicha clase.
		 */
		System.out.println("\t\t\tHora de comer");
	}

	public void insertarDatos() {
		System.out.print("\n\t\tN�mero de cr�as(como animal que es): ");
		numCrias = Leer.pedirEnteroValidar();
	}

	public void vis_datosanim() {
		System.out.println("\n\t Cr�as: " + numCrias);
	}
}