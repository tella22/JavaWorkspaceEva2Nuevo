public class Principal {
	public static void main(String[] args) {
		Persona p[] = new Persona[3];
		int pos;
		for (pos = 0; pos < 3; pos++) {
			p[pos] = new Persona();
		}

		Mamifero ma[] = new Mamifero[2];
		for (pos = 0; pos < 2; pos++) {
			ma[pos] = new Mamifero();
		}

		Animal a = new Animal();
		System.out
				.print("\n\tINSERCI�N DE LOS DATOS DE LAS DIFERENTES PERSONAS:");
		for (pos = 0; pos < 3; pos++) {
			System.out.print("\n\t\tINSERTE LOS DATOS DE LA PERSONA "
					+ (pos + 1));
			p[pos].insertarDatosPers();
		}
		System.out
				.print("\n\tINSERCI�N DE LOS DATOS DE LOS DIFERENTES MAM�FEROS:");
		for (pos = 0; pos < 2; pos++) {
			System.out
					.print("\n\t\tINSERTE LOS DATOS DEL MAM�FERO" + (pos + 1));
			ma[pos].insertarDatosMamif();
		}
		pos = 0;
		System.out
				.println("\n\tINSERCI�N DE LOS DATOS DEL RESTO DE LOS ANIMALES: ");
		System.out.println("\n\t\tINSERTE LOS DATOS DEL ANIMAL " + (pos + 1));
		a.insertarDatos();
		System.out
				.println("\nVISUALIZACI�N DE LOS DATOS DE LAS DIFERENTES PERSONAS: ");
		for (pos = 0; pos < 3; pos++) {
			System.out.println("\nPERSONA" + (pos + 1));
			p[pos].visualizarDatos();
		}
		System.out
				.println("\nVISUALIZACI�N DE LOS DATOS DE LOS DIFERENTES MAM�FEROS: ");
		for (pos = 0; pos < 2; pos++) {
			System.out.println("\nMAM�FERO" + (pos + 1));
			ma[pos].visDatosMamif();
		}
		System.out
				.println("\nVISUALIZACI�N DE LOS DATOS DEL RESTO DE LOS ANIMALES: ");
		a.vis_datosanim();
		System.out
				.println("\n\tSE VA A PROCEDER A DAR DE COMER A TODAS LAS PERSONAS: ");
		for (pos = 0; pos < 3; pos++) {
			System.out.println("\n\t\tPERSONA" + (pos + 1));
			p[pos].alimentarse();
		}
		System.out
				.println("\n\tTerminado de comer todas las personas, pasamos a que coman los mam�feros: ");
		System.out
				.println("\n\tSE VA A PROCEDER A DAR DE COMER A TODOS LOS MAM�FEROS: ");
		for (pos = 0; pos < 2; pos++) {
			System.out.println("\n\t\t MAM�FERO" + (pos + 1));
			ma[pos].alimentarse();
		}
		pos = 0;
		System.out
				.println("\n\tTerminado de comer todas los mam�feros, pasamos a que coma el �nico animal: ");
		System.out
				.println("\n\tSE VA A PROCEDER A DAR DE COMER AL RESTO DE LOS ANIMALES: ");
		System.out.println("\n\t\t ANIMAL " + (pos + 1));
		a.alimentarse();
		System.out.println("\nFINALIZACI�N DE TODO EL PROCESO. ");

	}
}
