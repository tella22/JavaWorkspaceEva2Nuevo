import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class GestionLibroAutor {
	public static Autor vecAutor[] = new Autor[10];
	private static Integer[] vec = new Integer[4];
	private static Libro vecLibros[] = new Libro[10];

	public static void main(String[] args) {
		vecAutor[0] = new Autor("Jose Antonio", "jantonio@gmail.com", 'm');
//		vecLibros[0] = new Libro("Las sepias de Manolo", 0, 1D, 2);
		
		int librosCreados = 1;
		int opcion, cantidad, i, libroCantidad, lugar, cantidadAutores=0, j=0, k,l;
		Autor autor = new Autor();
		Libro libro = null;
		String autorName, autorEmail, autorGenero, libroTitulo, libroName;
		Double libroPrecio;
		char autorGeneroChar;
		Scanner teclado = new Scanner(System.in);
		// Libro uno = new Libro();

		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("¿Cuantos libros quieres crear? (min=1, max=10)");
				cantidad = teclado.nextInt();
				while (cantidad > 10 || cantidad < 1) {
					System.out.println("¿Cuantos libros quieres crear? (min=1, max=10)");
					cantidad = teclado.nextInt();
				}
				for (i = 0; i < cantidad; i++) {
					System.out.println("¿Cuantos autores va a tener? (min=1, max=4)");
					cantidadAutores = teclado.nextInt();
					while (cantidadAutores > 4 || cantidadAutores < 1) {
						System.out.println("¿Cuantos autores va a tener? (min=1, max=4)");
						cantidadAutores = teclado.nextInt();
					}
					l=cantidadAutores+j;
					j++;
					for (; j<l; j++) {
						establecerAutor(teclado, j);
						
					}
					vecLibros[i] = establecerLibro(vecLibros, i, vecAutor[i], teclado);
					librosCreados++;
				}
				
				break;
			case 2:
				do {
					System.out.println("que posicion de libros quieres modificar");
					lugar = teclado.nextInt();
				} while (lugar < 1 || lugar > 10);
				lugar--;
				teclado.nextLine();
				System.out.println("que nuevo nombre quieres introducir");
				autorName = teclado.nextLine();
				vecAutor[lugar] = new Autor(autorName, vecAutor[lugar].getEmail(), vecAutor[lugar].getGenero());
				// vecLibros[lugar] = new Libro (get)
				break;
			case 3:
				do {
					System.out.println("que posicion de libros quieres modificar");
					lugar = teclado.nextInt();
				} while (lugar < 1 || lugar > 10);
				lugar--;
				teclado.nextLine();
				System.out.println("que nuevo titulo quieres introducir");
				libroName = teclado.nextLine();
//				vecLibros[lugar] = new Libro(libroName, vec, vecLibros[lugar].getPrecio(), vecLibros[lugar].getCantidad());
				vecLibros[lugar] = new Libro(libroName, vec, vecLibros[lugar].getPrecio(), vecLibros[lugar].getCantidad());
				break;
			case 4:
				for (i = 0; i < librosCreados; i++) {
					System.out.println(vecLibros[i].cadenaLibro());
				}
				break;
			case 5:
				for (i = 0; i < librosCreados; i++) {
					System.out.println(vecAutor[i].cadenaAutor());
				}
				break;
			}

		} while (opcion != 0);
	}

	public static Libro establecerLibro(Libro[] vecLibros, int i, Autor autor, Scanner teclado) {
		int libroCantidad;
		String libroTitulo;
		Double libroPrecio;
		do {
			System.out.println("titulo del libro");
			libroTitulo = teclado.nextLine();
		} while (libroTitulo.length() < 1);
		do {
			System.out.println("precio del libro");
			libroPrecio = teclado.nextDouble();
		} while (libroPrecio < 0.0);
		do {
			System.out.println("cantidad del libro");
			libroCantidad = teclado.nextInt();
			System.out.println("libro nº " + (i + 1) + " creado");
			System.out.println("________________________________");
		} while (libroCantidad < 0);
		Libro libro = new Libro(libroTitulo, vec, libroPrecio, libroCantidad);
		return libro;
	}

	public static void establecerAutor(Scanner teclado, Integer posVecAutor) {
		String autorName;
		String autorEmail;
		String autorGenero;
		Integer autorCont=0;
		char autorGeneroChar;
		Libro libro = null;
		do {
			teclado.nextLine();
			System.out.println("introduce el nombre del autor");
			autorName = teclado.nextLine();
		} while (autorName.length() < 1);
		do {
			System.out.println("introduce el email del autor");
			autorEmail = teclado.nextLine();
		} while (autorEmail.length() < 1);
		do {
			System.out.println("introduce el genero del autor");
			autorGenero = teclado.nextLine();
			autorGeneroChar = autorGenero.charAt(0);
		} while (autorGeneroChar != 'f' && autorGeneroChar != 'm');
		Autor autor = new Autor(autorName, autorEmail, autorGeneroChar);
		autorCont++;
		vecAutor[posVecAutor] = autor;
		vec[posVecAutor]=autorCont;
		
		}

	public static void mostrarMenu() {
		System.out.println("1. Crear libros");
		System.out.println("2. Modificar autor");
		System.out.println("3. Modificar libro");
		System.out.println("4. Listado de libros");
		System.out.println("5. Listado de autores");
		System.out.println("0. Salir");
	}

}
