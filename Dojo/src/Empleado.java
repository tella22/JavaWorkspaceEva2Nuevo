import utilidades.Fecha;
import utilidades.Leer;
public class Empleado {
	protected String nombre;
	protected Fecha fechaNacimiento;
	protected static Integer siguiente = 0;
	protected static final Float salarioBase = 1000F;
	protected Fecha fechaIngreso;
	protected Integer numeroEmpleado;
	
	public Integer edadEmpleado(Fecha hoy) {
		Integer anyos = fechaNacimiento.difFechas(hoy) / 365;
		return anyos;
	}
	
	public Float calculoNomina(){
		return null;
	}

	public Empleado(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaIngreso = fechaIngreso;
		numeroEmpleado = siguiente; 
		siguiente ++; 
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static Integer getSiguiente() {
		return siguiente;
	}

	public static void setSiguiente(Integer siguiente) {
		Empleado.siguiente = siguiente;
	}

	public Float getSalarioBase() {
		return salarioBase;
	}


	public Fecha getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Fecha fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	public void visualizar(){
		Leer.mostrarEnPantalla(this.getClass().toString().substring(6));
		Leer.mostrarEnPantalla("Nombre:            " +nombre);
		Leer.mostrarEnPantalla("Fecha Nacimiento:  "+fechaNacimiento.fechaTexto().substring(6));
		Leer.mostrarEnPantalla("N� Empleado:       "+numeroEmpleado.toString());
		Leer.mostrarEnPantalla("Fecha Ingreso:     "+fechaIngreso.fechaTexto().substring(6));
	}
}
