import utilidades.Fecha;
import utilidades.Leer;

public class Responsable extends Empleado {

	private final float bono = 10F;
	private String departamento;
	private Integer personasACargo = 0;
	static final Float plusResponsabilidad = 50F;

	public Responsable(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso, String departamento) {
		super(nombre, fechaNacimiento, fechaIngreso);
		this.departamento = departamento;
	}

	public float getBono() {
		return bono;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getPersonasACargo() {
		return personasACargo;
	}

	public void setPersonasACargo(Integer personasACargo) {
		this.personasACargo = personasACargo;
	}

	public static Float getPlusResponsabilidad() {
		return plusResponsabilidad;
	}

	public Responsable(String nombre, Fecha fechaNacimiento, Fecha fechaIngreso) {
		super(nombre, fechaNacimiento, fechaIngreso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Float calculoNomina() {
		float salarioBruto = salarioBase + bono * personasACargo;
		return salarioBruto;
	}
	
	public void visualizar(){
		super.visualizar();
		Leer.mostrarEnPantalla("Departamento:      "+departamento);
		Leer.mostrarEnPantalla("Empleados a Cargo: "+personasACargo.toString());
//		Leer.mostrarEnPantalla(personasACargo.toString());
		//falta a�adir salario 
	}


}
