
public class GestionAutomovil {

	static Automovil[] vecAutomoviles = new Automovil[5000];

	public static void main(String[] args) {

		int opcion;
		Automovil automovil = new Automovil("", "", 0, 0);
		
		do {
		mostrarMenu();
		opcion=Leer.pedirEntero("Introduce la opcion");
		
		switch(opcion) {
			case 1:
				automovil.importarAutomovil(vecAutomoviles, Leer.pedirEntero("¿Cuantos automoviles quieres crear (mínimo 1 - máximo 5000)?"));
				break;
			case 2:
				Automovil.ordenaCadenas(vecAutomoviles);
				break;
			case 3:
				automovil.visualizar();
				break;
		}
		}while(opcion!=0);
		
	}

	private static void mostrarMenu() {
		Leer.mostrarEnPantalla("1. Introducir automoviles");
		Leer.mostrarEnPantalla("2. Ordenar vector por atributo");
		Leer.mostrarEnPantalla("3. Imprimir datos del vector");
		Leer.mostrarEnPantalla("0. Salir");
	}

}
