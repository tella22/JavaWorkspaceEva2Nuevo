import java.util.Scanner;


public class GestionLibroAutor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String titulo, genero, nombre, email;
		Autor autor = new Autor();
		char generoChar;
		double precio;
		int opcion, cantidad, cantidadLibro, i;
		Libro vecLibros[] = new Libro[30];
		
		do {
			mostrarMenu();
			System.out.println("introduce un numero");
			opcion=teclado.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("¿cuantos libros quieres crear?");
				cantidad=teclado.nextInt();
				teclado.nextLine();
				while(cantidad<0 || cantidad>30) {
					System.out.println("¿cuantos libros quieres crear?");
					cantidad=teclado.nextInt();
					teclado.nextLine();
				}
				for(i=0; i<cantidad; i++) {
					do {
						System.out.println("Introduce el autor/a");
						nombre=teclado.nextLine();
					}while(nombre.length()<1);
					
					do {
						System.out.println("Introduce el email del autor/a");
						email=teclado.nextLine();
					}while(email.length()<1);
					
					do {
						System.out.println("Introduce el genero del autor/a");
						genero=teclado.nextLine();
						generoChar=genero.charAt(0);
					}while(generoChar!='f' && generoChar !='m');
					
					do {
						System.out.println("Introduce un titulo");
						titulo=teclado.nextLine();
					}while(titulo.length()<1);
					
					do {
						System.out.println("Introduce un precio");
						precio=teclado.nextDouble();
						teclado.nextLine();
					}while(precio<0.0);
					
					do {
						System.out.println("Introduce la cantidad a vender");
						cantidadLibro=teclado.nextInt();
						teclado.nextLine();
						System.out.println("libro nº " + (i+1) + " creado");
						System.out.println("________________________________");
					}while(cantidadLibro<0);
					
					vecLibros[i]= new Libro(titulo, autor, precio, cantidadLibro);
				}
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				System.out.println();
				break;
			case 5:
				System.out.println();
				break;
			}
			
		}while(opcion!=0);
	
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
