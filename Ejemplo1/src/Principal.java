import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		Empleado emple;
		Jefe jefe;
		String nombre;
		float sueldo;
		String departJefe;
		String titulUniv;
		
		System.out.println("\n\tVamos a insertar los datos del empleado: ");		
		System.out.print("\n\t\tNOMBRE ");
		nombre=Leer.pedirCadena();		
		System.out.print("\n\t\tSUELDO ");
		sueldo=Leer.pedirFloat();		
		emple = new Empleado(nombre, sueldo);
		
		System.out.println("\n\tVamos a insertar los datos del jefe: ");
		System.out.print("\n\t\tNOMBRE ");
		nombre=Leer.pedirCadena();		
		System.out.print("\n\t\tSUELDO ");
		sueldo=Leer.pedirFloat();				
		System.out.print("\n\t\tDEPARTAMENTO DEL QUE ES JEFE? ");
		departJefe=Leer.pedirCadena();
		System.out.print("\n\t\tTITULO UNIVERSITARIO? ");
		titulUniv=Leer.pedirCadena();
		jefe =new Jefe(nombre, sueldo, departJefe, titulUniv);
		
		System.out.println("\n\tVamos a mostrar los datos del empleado: ");
		emple.imprimeTodo();
		System.out.println("\n\tVamos a mostrar los datos del jefe: ");
		jefe.imprimeTodo();
	}
}
