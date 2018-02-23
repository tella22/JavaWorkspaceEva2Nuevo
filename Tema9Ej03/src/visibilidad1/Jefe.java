package visibilidad1;

public class Jefe extends Empleado{
	
	private static Integer plusSueldo=250;
	private String departamento;
	private static Integer contaJefes=0;
	
	Jefe(){
		
	}
	
	Jefe(String nombre, Integer edad, Integer incrementoSueldo, String departamento){
		
		super(nombre, edad, incrementoSueldo);
		this.departamento = departamento;
		contaJefes++;
		
	}
	
	public void setPlusSueldo(Integer plusSueldo) {
		
		this.plusSueldo = plusSueldo;
		
	}
	
	public void visualizar() {
		Leer.mostrarEnPantalla("nombre: "+getNombre()+ ", edad: "+getEdad()+ ", departamento: "+departamento);
	}
	
}
