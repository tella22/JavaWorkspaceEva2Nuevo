import utilidades.Leer;

public class Persona extends Mamifero {

	private String profesion;

	Persona(){
		System.out.print(" y persona");
	}
	
	Persona(int numCrias, int numhuesos, int numextremidades, String profesion) {
		super(numCrias, numhuesos, numextremidades);
		this.profesion = profesion;
	}

	void insertarDatosPers() {

		insertarDatosMamif();
		System.out.print("\t\tProfesi�n de esta persona: ");
		profesion = Leer.pedirCadena();
	}

	public void visualizarDatos() {

		visDatosMamif();
		System.out.println("\n\t profesi�n: " + profesion);
	}
}
