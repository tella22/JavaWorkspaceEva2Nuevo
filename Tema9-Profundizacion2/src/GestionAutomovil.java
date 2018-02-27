
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
				Automovil.ordenaPorMarca(vecAutomoviles);
				break;
			case 3:
				Automovil.ordenaPorModelo(vecAutomoviles);
				break;
			case 4:
				Automovil.ordenaPorCilindrada(vecAutomoviles);
				break;
			case 5:
				Automovil.ordenaPorPrecio(vecAutomoviles);
				break;
			case 6:
				automovil.visualizar();
				break;
		}
		}while(opcion!=0);
		
	}

	private static void mostrarMenu() {
		Leer.mostrarEnPantalla("1. Introducir automoviles");
		Leer.mostrarEnPantalla("2. Ordenar vector por marca");
		Leer.mostrarEnPantalla("3. Ordenar vector por marca y modelo");
		Leer.mostrarEnPantalla("4. Ordenar vector por cilindrada");
		Leer.mostrarEnPantalla("5. Ordenar vector por precio");
		Leer.mostrarEnPantalla("6. Imprimir datos del vector");
		Leer.mostrarEnPantalla("0. Salir");
	}

}
