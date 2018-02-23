import utilidades.Leer;

public class Jefe extends Empleado {
	private String departJefe;

	public Jefe(String nombre,int edad, String departJefe) {
		super(nombre, edad);
		this.departJefe=departJefe;
	}

	public static void indicaTipoPersonal() {
		System.out.println("\tESTE EMPLEADO ES RESPONSABLE DE UN DEPARTAMENTO.");
	}
	
	public void imprimeDepart(){
		System.out.println("\t\tEJERCE LA JEFATURA DE: " + departJefe);
		return;
	}

	public void imprimeTodo(){
		super.imprimeTodo();
		indicaTipoPersonal();
		imprimeDepart();
	}
	
	public void pedirDatos() {
		System.out.println("\nVamos a insertar los datos del empleado: ");
		super.setTodo(Leer.pedirCadena("\n\n\n\tNOMBRE: "), Leer.pedirEntero("\n\n\tEDAD: "));
	}
	
}
