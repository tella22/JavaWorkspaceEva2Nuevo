import utilidades.*;

public class Administrativo extends Empleado {
	private static final Float plusAntiguedad=100F;

	public Administrativo(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, String departamento, Responsable jefe) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.departamento = departamento;
		this.jefe = jefe;
		jefe.setPersonasACargo(jefe.getPersonasACargo()+1);
	}

	private String departamento;
	private Responsable jefe;
	
	public Float calculoNomina() {
		Fecha hoy = GestionEmpresa.getFechaHoy();
		int a�osAntiguedad = fechaIngreso.difFechas(hoy)/365;
		float salarioBruto = salarioBase + (a�osAntiguedad*plusAntiguedad);
		return salarioBruto;
	}

	public static Float getPlusAntiguedad() {
		return plusAntiguedad;
	}


	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Responsable getJefe() {
		return jefe;
	}

	public void setJefe(Responsable jefe) {
		this.jefe = jefe;
	}
	public void visualizar(){
		super.visualizar();
		Leer.mostrarEnPantalla("Departamento:      "+departamento);
		Leer.mostrarEnPantalla("Jefe:              "+jefe.getNombre());
		//falta a�adir salario 
	}

}
