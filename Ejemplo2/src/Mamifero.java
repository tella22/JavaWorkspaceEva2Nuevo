import utilidades.Leer;

public class Mamifero extends Animal {
	private int numhuesos;
	private int numextremidades;

	Mamifero(){		
		System.out.print(", mam�fero");
	}
	
	Mamifero(int numCrias, int numhuesos, int numextremidades) {
		super(numCrias);
		this.numextremidades = numextremidades;
		this.numhuesos = numhuesos;
	}

	public void insertarDatosMamif() {
		insertarDatos();
		System.out.print("\t\tN�mero de huesos (como mam�fero que es)");
		numhuesos = Leer.pedirEnteroValidar();
		System.out.print("\t\tN�mero de extremidades (como mam�fero que es): ");
		numextremidades = Leer.pedirEnteroValidar();
	}

	public void visDatosMamif() {
		vis_datosanim();
		System.out.println("\n\t Huesos: " + numhuesos);
		System.out.println("\n\t Extremidades: " + numextremidades);
	}
}
