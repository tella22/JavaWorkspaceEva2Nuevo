public class Jefes extends Empleados {
	
	String titulo, departamento;
	
	Jefes(String nombre, Double sueldo, String titulo, String departamento) {
		super(nombre, sueldo);
		this.titulo = titulo;
		this.departamento = departamento;
	}
	
	public void visualizar() {
		Leer.mostrarEnPantalla(nombre + ", " + sueldo + ", " + titulo + ", " + departamento);
	}
	
}
