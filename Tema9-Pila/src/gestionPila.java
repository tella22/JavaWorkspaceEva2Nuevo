public class gestionPila {
	public static void main(String[] args) {
		Pila pila1 = new Pila();
		Pila pila2 = new Pila();
		int opcion;

		// for(int i=0; i<500; i++) {
		// pila2.addPila((int) Math.floor(Math.random() * (99999999 - 0 +1)));
		// pila1.addPila((int) Math.floor(Math.random() * (99999999 - 0 +1)));
		// }

		do {
			mostrarMenu();
			opcion = Leer.pedirEntero("Elige una opción");
			while(opcion < 0 &&  opcion > 8) {
				Leer.mostrarEnPantalla("\tDebes introducir un numero entre 0 y 8 (incluidos)");
				opcion = Leer.pedirEntero("Elige una opción otra vez");
			}
			switch (opcion) {
			case 1:
				pila1.popPila();
				break;
			case 2:
				pila1.addPila(Leer.pedirEntero("\tintroduce un numero para añadir a la pila"));
				Leer.mostrarEnPantalla("\t_____________________________");
				pila1.visualizar();
				break;
			case 3:
				pila2 = pila1.copyPila();
				Leer.mostrarEnPantalla("\tPila copiada");
				break;
			case 4:
				Leer.mostrarEnPantalla(" ");
				Leer.mostrarEnPantalla("\tpila ordenada ");
				Leer.mostrarEnPantalla("\t_____________________________");
				pila1.visualizar();
				pila1.invPila();
				Leer.mostrarEnPantalla(" ");
				Leer.mostrarEnPantalla("pila invertida");
				Leer.mostrarEnPantalla("\t_____________________________");
				pila1.visualizar();
				break;
			case 5:
				pila1.borrarPila();
				Leer.mostrarEnPantalla(" ");
				Leer.mostrarEnPantalla("\tPila borrada");
				Leer.mostrarEnPantalla("\t_____________________________");
				break;
			case 6:
				if (pila1.pilaVacia() == true) {
					Leer.mostrarEnPantalla(" ");
					Leer.mostrarEnPantalla("\tLa pila esta vacia");
					Leer.mostrarEnPantalla("\t_____________________________");
				} else {
					Leer.mostrarEnPantalla(" ");
					Leer.mostrarEnPantalla("\tLa pila no esta vacia");
					Leer.mostrarEnPantalla("\t_____________________________");
				}
				break;
			case 7:
				if (pila1.pilaVacia() == true) {
					Leer.mostrarEnPantalla(" ");
					Leer.mostrarEnPantalla("\tLa pila esta vacia");
					Leer.mostrarEnPantalla("\t_____________________________");
				} else {
					Leer.mostrarEnPantalla("\t_____________________________");
					pila1.visualizar();
				}
				break;
			case 8:
				if (pila2.pilaVacia() == true) {
					Leer.mostrarEnPantalla(" ");
					Leer.mostrarEnPantalla("\tLa pila esta vacia");
					Leer.mostrarEnPantalla("\t_____________________________");
				} else {
					Leer.mostrarEnPantalla("\t_____________________________");
					pila2.visualizar();
				}
				break;
			}
		} while (opcion != 0);
	}

	private static void mostrarMenu() {
		Leer.mostrarEnPantalla("1. Eliminar la cima de la pila");
		Leer.mostrarEnPantalla("2. Añadir numero a la pila");
		Leer.mostrarEnPantalla("3. Copiar una pila en otra");
		Leer.mostrarEnPantalla("4. Invertir pila");
		Leer.mostrarEnPantalla("5. Borrar toda la pila");
		Leer.mostrarEnPantalla("6. Comprobar si pila esta vacía");
		Leer.mostrarEnPantalla("7. Visualizar pila");
		Leer.mostrarEnPantalla("8. Visualizar pila copiada");
		Leer.mostrarEnPantalla("0. Salir");
	}
}
