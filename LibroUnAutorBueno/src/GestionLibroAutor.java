import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class GestionLibroAutor {
	
	public static Autor[] vecAutor = new Autor[100];
	public static Libro[] vecLibros = new Libro[100];
	public static Integer lista=0;
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Integer opcion, listaAutor, cantidad, listaLibro, setCantidad;
		String nombreAutor, emailMod;
		Integer posicion = 0;
		Double setPrecio;
		
		do {
			mostrarMenu();
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				do {
					cantidad = Leer.pedirEntero("cantidad de libros a crear");

				}while(cantidad<1);
				vecLibros = crearVectorLibros(cantidad);
				vecAutor = crearVectorAutor(cantidad);
				crearLibros(vecLibros, vecAutor);
				break;
			case 2:
				mostrarAutores(vecAutor);
				do {
					listaAutor=Leer.pedirEntero("¿Que autor quieres modificar?");
				}while(listaAutor>Autor.totalAutores());
				listaAutor--;
				Autor autor= vecAutor[listaAutor];
				emailMod=Leer.pedirCadena("Introduce el email modificado");
				autor.setEmail(emailMod);
				break;
			case 3:
				mostrarLibros(vecLibros);
				do {
					listaLibro=Leer.pedirEntero("¿Que libro quieres modificar?");
				}while(listaLibro>Autor.totalAutores());
				listaLibro--;
				Libro libro = vecLibros[listaLibro];
				setPrecio=Leer.pedirDouble("Introduce el precio del libro modificado");
				libro.setPrecio(setPrecio);
				setCantidad=Leer.pedirEntero("Introduce la cantidad del libro modificado");
				libro.setCantidad(setCantidad);
				break;
			case 4:
				for (posicion = 0; posicion < Autor.totalAutores(); posicion++) {
					System.out.println("posicion " + (posicion+1) +": "+ vecLibros[posicion].cadenaLibro());
				}
				break;
			case 5:
				for (posicion = 0; posicion < Autor.totalAutores(); posicion++) {
					System.out.println("posicion " + (posicion+1) +": "+ vecAutor[posicion].cadenaAutor());
				}
				break;
			}

		} while (opcion != 0);
	}

	public static void mostrarMenu() {
		System.out.println("1. Crear libros");
		System.out.println("2. Modificar autor");
		System.out.println("3. Modificar libro");
		System.out.println("4. Listado de libros");
		System.out.println("5. Listado de autores");
		System.out.println("0. Salir");
	}
	
	public static Libro[] crearVectorLibros(Integer vectorLongitud){
		Libro[] vecLibros = null;
		vecLibros = new Libro[vectorLongitud];
		return vecLibros;
	}
	
	public static Autor[] crearVectorAutor(Integer vectorLongitud){
		Autor[] vecAutor = null;
		vecAutor = new Autor[vectorLongitud];
		return vecAutor;
	}
	
	public static void mostrarAutores(Autor[] vecAutor) {
		int i;
		System.out.println("Autores");
		System.out.println("____________");
		for(i=0; i< vecAutor.length && vecAutor[i] != null ; i++) {
			System.out.println((i+1)+ ". " + vecAutor[i].cadenaAutor());
		}
	}
	
	public static void mostrarLibros(Libro[] vecLibro) {
		int i;
		System.out.println("Libros");
		System.out.println("____________");
		for(i=0; i< vecLibro.length && vecLibro[i] != null ; i++) {
			System.out.println((i+1)+ ". " + vecLibro[i].cadenaLibro());
		}
	}
	
	public static void crearLibros(Libro[] vecLibros, Autor[] vecAutor) {
		int indLibro, indTitulo;
		String titulo, nombreAutor, email, genero;
		char generoChar;
		Autor autor;
		Double precio;
		Integer cantidad;
		
		for (indLibro = 0; indLibro < vecLibros.length; indLibro++) {
			titulo = Leer.pedirCadena("Titulo del libro?");
			precio = Leer.pedirDouble("Precio del libro?");
			cantidad = Leer.pedirEntero("Cantidad de libros?");
			nombreAutor = Leer.pedirCadena("Nombre del autor?");
			email = Leer.pedirCadena("email del autor?");
			genero = Leer.pedirCadena("genero del autor?");
			generoChar=genero.charAt(0);
			autor = new Autor(nombreAutor, email, generoChar);
			vecLibros[indLibro] = new Libro(titulo, autor, precio, cantidad);
			}
		} 
}

 	
