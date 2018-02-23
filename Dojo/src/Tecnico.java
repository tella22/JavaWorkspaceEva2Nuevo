import utilidades.Fecha;
import utilidades.Leer;

public class Tecnico extends Empleado {
	private String especialidad;
	private final Float plusEspecialidad = 75F;
	private Responsable jefe;

	public Tecnico(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
		super(nombre, fechaNacimiento, fechaIngreso);
		// TODO Auto-generated constructor stub
	}

	public Tecnico(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, String especialidad, Responsable jefe) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.especialidad = especialidad;
		this.jefe = jefe;
		jefe.setPersonasACargo(jefe.getPersonasACargo()+1);
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Float getPlusEspecialidad() {
		return plusEspecialidad;
	}

	public Responsable getJefe() {
		return jefe;
	}

	public void setJefe(Responsable jefe) {
		this.jefe = jefe;
	}

	@Override
	public Float calculoNomina() {	
		float salarioBruto = salarioBase + plusEspecialidad;
		return salarioBruto;
	}
	
	public void visualizar(){
		super.visualizar();
		Leer.mostrarEnPantalla("Especialidad:      "+especialidad);
		Leer.mostrarEnPantalla("Jefe:              "+jefe.getNombre());
		//falta a�adir salario 
	}

}
