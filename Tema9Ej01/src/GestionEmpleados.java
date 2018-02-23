public class GestionEmpleados {

	public static void main(String[] args) {
		
		Integer empleados, i, jefes, contVector=0;
		String nombre, titulo, departamento;
		Double sueldo;
		Empleados[] empleado = new Empleados[100];
		Jefes jefe;
		
		empleados = Leer.pedirEntero("¿Cuantos empleados quieres crear?");
		
		for(i=0; i<empleados; i++){
			nombre = Leer.pedirCadena("Introduce el nombre del empleado " + (i+1));
			sueldo = Leer.pedirDouble("intorduce el sueldo del empleado " + (i+1));
			empleado[contVector] = new Empleados(nombre, sueldo);
			Leer.mostrarEnPantalla("------ Empleado "+(i+1)+" creado ------");
			contVector++;
		}

		jefes = Leer.pedirEntero("¿Cuantos jefes quieres crear?");
		
		for(i=0; i<jefes; i++){
			nombre = Leer.pedirCadena("Introduce el nombre del jefe " + (i+1));
			sueldo = Leer.pedirDouble("intorduce el sueldo del jefe " + (i+1));
			titulo = Leer.pedirCadena("Introduce el titulo");
			departamento = Leer.pedirCadena("Introduce el departamento del cual es jefe");
			empleado[contVector] = new Jefes(nombre, sueldo, titulo, departamento);
			Leer.mostrarEnPantalla("------ Jefe "+(i+1)+" creado ------");
			contVector++;
		}
		
		for (i=0; i < contVector; i++ ) {
			empleado[i].visualizar();
		}
		
	}

}
