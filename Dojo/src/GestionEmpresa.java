import utilidades.*;


public class GestionEmpresa {
	private static Fecha hoy = new Fecha(20,02,2018);
	
	public static void main(String[] args) {
		Empleado empleados [] = new Empleado[20];
		Integer contador = 0;
		Integer opcion;
		
		do{
			if(contador==0) {
				Leer.mostrarEnPantalla("Crea un jefe");
				empleados[contador] = crearResponsable(empleados);
				contador++;
				Leer.mostrarEnPantalla("_____________");
				Leer.mostrarEnPantalla(" jefe creado pe");
				Leer.mostrarEnPantalla("_____________");
			}			
			mostrarMenu();
			opcion=Leer.pedirEntero("introduce la opcion");
		switch(opcion){
		
		case 1:
			empleados[contador] = crearResponsable(empleados);
			contador++;
			Leer.mostrarEnPantalla("jefe creado");
			break;
		case 2:
			empleados[contador] = crearAdmin(empleados,contador);
			contador++;
			break;
		case 3:
			empleados[contador] = crearTecnico(empleados,contador);
			contador++;
			break;
		case 4:
			System.out.println(contador);
			verPlantilla(empleados, contador);

			break;
		case 5:
			calculoNominas(empleados, contador);
			break;
		
		}
		}while(opcion != 0);
		
	}

	private static void mostrarMenu() {
		Leer.mostrarEnPantalla("1. crear responsable");
		Leer.mostrarEnPantalla("2. crear administrativo");
		Leer.mostrarEnPantalla("3. crear tecnico");
		Leer.mostrarEnPantalla("4. ver plantilla");
		Leer.mostrarEnPantalla("5. calcular nominas");
		Leer.mostrarEnPantalla("0. salir");
	}

	private static Administrativo crearAdmin(Empleado empleados[], Integer contador){
		String nombre = null; 
		Fecha fechaNacimiento = null; 
		Fecha fechaIngreso = null; 
		String departamento = null;
		nombre = Leer.pedirCadena("Nombre: ");
		Leer.mostrarEnPantalla("Fecha de nacimiento");
		fechaNacimiento = new Fecha(Leer.pedirEntero("introduce dia: "), Leer.pedirEntero("introduce mes: "), Leer.pedirEntero("introduce a�o: "));
		Leer.mostrarEnPantalla("Fecha de inicio en la empresa");
		fechaIngreso = new Fecha(Leer.pedirEntero("introduce dia: "), Leer.pedirEntero("introduce mes: "), Leer.pedirEntero("introduce a�o: "));
		departamento = Leer.pedirCadena("Introduce el departamento: ");
		
		//Pedir el jefe
		Responsable jefe = buscarJefe(Leer.pedirCadena("Introduce el nombre del jefe: "), empleados, contador);
		Administrativo admin = new Administrativo(nombre, fechaNacimiento, fechaIngreso, departamento, jefe);
		return admin;
		
	}
	private static Tecnico crearTecnico(Empleado empleados [],Integer contador){
		String nombre = null; 
		Fecha fechaNacimiento = null; 
		Fecha fechaIngreso = null; 
		String especialidad = null;
		nombre = Leer.pedirCadena("Nombre: ");
		Leer.mostrarEnPantalla("Fecha de nacimiento");
		fechaNacimiento = new Fecha(Leer.pedirEntero("introduce dia: "), Leer.pedirEntero("introduce mes: "), Leer.pedirEntero("introduce a�o: "));
		Leer.mostrarEnPantalla("Fecha de inicio en la empresa");
		fechaIngreso = new Fecha(Leer.pedirEntero("introduce dia: "), Leer.pedirEntero("introduce mes: "), Leer.pedirEntero("introduce a�o: "));
		especialidad = Leer.pedirCadena("Introduce la especialidad: ");
		
		//Pedir el jefe
		Responsable jefe = buscarJefe(Leer.pedirCadena("Introduce el nombre del jefe: "),empleados ,contador);
		Tecnico tecnico = new Tecnico(nombre, fechaNacimiento, fechaIngreso, especialidad,jefe);
		return tecnico;
		
	}
	private static Responsable crearResponsable(Empleado empleados[]){
		String nombre = null; 
		Fecha fechaNacimiento = null; 
		Fecha fechaIngreso = null; 
		String departamento = null;
		nombre = Leer.pedirCadena("Nombre: ");
		Leer.mostrarEnPantalla("Fecha de nacimiento");
		fechaNacimiento = new Fecha(Leer.pedirEntero("introduce dia: "), Leer.pedirEntero("introduce mes: "), Leer.pedirEntero("introduce a�o: "));
		Leer.mostrarEnPantalla("Fecha de inicio en la empresa");
		fechaIngreso = new Fecha(Leer.pedirEntero("introduce dia: "), Leer.pedirEntero("introduce mes: "), Leer.pedirEntero("introduce a�o: "));
		departamento = Leer.pedirCadena("Introduce el departamento: ");
		
		//Pedir el jefe
		Responsable jefe = new Responsable(nombre, fechaNacimiento, fechaIngreso, departamento);
		return jefe;
		
	}
	
	private static void verPlantilla(Empleado empleados [],Integer contador){
		for(int i = 0; i < contador.intValue(); i++){
			empleados[i].visualizar();
			Leer.mostrarEnPantalla("_____________________________________");
		}
		
	}
	
	private static Responsable buscarJefe(String nombre,Empleado empleados [],Integer contador) {
		Responsable jefe;
		for (int i = 0; i < contador; i++) {
			if (empleados[i] instanceof Responsable) {
				if (empleados[i].getNombre().equals(nombre)) {
					jefe = (Responsable)empleados[i];
					return jefe;
				}
			}
		}
		return null;
	}
	
	private static void calculoNominas(Empleado empleados[], Integer contador){
		float nominaTotal=0;
		for (int i = 0; i < contador; i++) {
			nominaTotal+=empleados[i].calculoNomina();
			Leer.mostrarEnPantalla(empleados[i].getNombre() + " " + empleados[i].calculoNomina());
		}
		Leer.mostrarEnPantalla("nomina total: " + nominaTotal );
	}
	
	public static Fecha getFechaHoy() {
		return hoy;
	}
}


