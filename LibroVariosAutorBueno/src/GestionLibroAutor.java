import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class GestionLibroAutor {

	public static Autor[] vecAutor = new Autor[100];
	public static Libro[] vecLibros = new Libro[100];
	public static Integer listaAutores = 0, listaLibros = 0;

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer opcion, listaAutor, cantidad, listaLibro, setCantidad, cantidadAutores;
		String emailMod;
		Integer posicion = 0;
		Double setPrecio;

		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			if (listaLibros == 0) {
				if (opcion == 1) {
					do {
						cantidad = Leer.pedirEntero("cantidad de libros a crear");
					} while (cantidad < 1);
					for (int i = 0; i < cantidad; i++) {
						do {
							cantidadAutores = Leer.pedirEntero("cantidad de autores a tener");
						} while (cantidadAutores < 1);
						crearLibros(crearAutor(cantidadAutores));
					}

				}
			} else {
				switch (opcion) { //switch en el cual, segun la opcion, elegimos a que parte del menu entrar
				case 1: // creamos un libro llamando a crearAutor y a crearLibro
					do {
						cantidad = Leer.pedirEntero("cantidad de libros a crear");
					} while (cantidad < 1);
					do {
						cantidadAutores = Leer.pedirEntero("cantidad de autores a tener");
					} while (cantidadAutores < 1);
					crearLibros(crearAutor(cantidadAutores));
					break;
				case 2:
					mostrarAutores(vecAutor);
					do {
						listaAutor = Leer.pedirEntero("¿Que autor quieres modificar?");
					} while (listaAutor > Autor.totalAutores());
					listaAutor--;
					Autor autor = vecAutor[listaAutor];
					emailMod = Leer.pedirCadena("Introduce el email modificado");
					autor.setEmail(emailMod);
					break;
				case 3:
					mostrarLibros(vecLibros);
					do {
						listaLibro = Leer.pedirEntero("¿Que libro quieres modificar?");
					} while (listaLibro > Autor.totalAutores());
					listaLibro--;
					Libro libro = vecLibros[listaLibro];
					setPrecio = Leer.pedirDouble("Introduce el precio del libro modificado");
					libro.setPrecio(setPrecio);
					setCantidad = Leer.pedirEntero("Introduce la cantidad del libro modificado");
					libro.setCantidad(setCantidad);
					break;
				case 4:
					for (posicion = 0; posicion < listaLibros; posicion++) {
						System.out.println("posicion " + (posicion + 1) + ": " + vecLibros[posicion].cadenaLibro());
					}
					break;
				case 5:
					for (posicion = 0; posicion < Autor.totalAutores(); posicion++) {
						System.out.println("posicion " + (posicion + 1) + ": " + vecAutor[posicion].cadenaAutor());
					}
					break;
				}
			}
		} while (opcion != 0);
	}

	public static void mostrarMenu() { // con este metodo mostramos el menu
		System.out.println("1. Crear libros");
		System.out.println("2. Modificar autor");
		System.out.println("3. Modificar libro");
		System.out.println("4. Listado de libros");
		System.out.println("5. Listado de autores");
		System.out.println("0. Salir");
	}

	public static void mostrarAutores(Autor[] vecAutor) { //con este metodo mostramos los autores
		int i;
		System.out.println("Autores");
		System.out.println("____________");
		for (i = 0; i < vecAutor.length && vecAutor[i] != null; i++) {
			System.out.println((i + 1) + ". " + vecAutor[i].cadenaAutor());
		}
	}

	public static void mostrarLibros(Libro[] vecLibro) { //con este metodo mostramos los libros
		int i;
		System.out.println("Libros");
		System.out.println("____________");
		for (i = 0; i < vecLibro.length && vecLibro[i] != null; i++) {
			System.out.println((i + 1) + ". " + vecLibro[i].cadenaLibro());
		}
	}

	public static void crearLibros(Integer[] vecIndAutor) { //con este metodo creamos el libro
		int indLibro;
		String titulo;
		Double precio;
		Integer cantidad;


			titulo = Leer.pedirCadena("Titulo del libro?");
			precio = Leer.pedirDouble("Precio del libro?");
			cantidad = Leer.pedirEntero("Cantidad de libros?");
			vecLibros[listaLibros] = new Libro(titulo, vecIndAutor, precio, cantidad);

	}

	public static Integer[] crearAutor(Integer cantidadAutores) { //con este metodo creamos los autores para cada libro
		int indVector;
		String nombreAutor, email, genero;
		char generoChar;
		Autor autor;
		Integer[] vecIndAutor = new Integer[cantidadAutores.intValue()];

		for (indVector = 0; indVector < vecIndAutor.length; indVector++) {
			nombreAutor = Leer.pedirCadena("Nombre del autor?");
			email = Leer.pedirCadena("email del autor?");
			do {
				genero = Leer.pedirCadena("genero del autor?");
				generoChar = genero.charAt(0);
			} while (generoChar != 'm' && generoChar != 'f');
			autor = new Autor(nombreAutor, email, generoChar);
			vecAutor[listaAutores - 1] = autor;
			vecIndAutor[indVector] = listaAutores - 1;
		}
		return vecIndAutor;
	}

}
