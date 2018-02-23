public class Empleados {

	String nombre;
	Double sueldo;
	
	Empleados(String nombre, Double sueldo){
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public void visualizar() {
		Leer.mostrarEnPantalla(nombre + ", " +sueldo);
	}
	
}
