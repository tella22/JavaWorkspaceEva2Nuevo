
public class Principal {

	static Integer contadorVector=0;
	public static void main(String[] args) {
		
		Integer cuantosEmpleados, cuantosAdministrativos, cuantosMaquinistas, cuantosEmpleadosAdministrativos, cuantosEmpleadosTotal;
		Empleado [] empleados;
		Administrativo [] administrativos;
		Maquinista [] maquinistas;
		String nombres[]={"Luis","Jesus","Jaime","Carlos","Rafa","Jose","Pilar","Maria","Paola","Lolo"};
		String estudios[]={"Informatica","Administracion","Peluqueria","Marketing","Derecho","Torcido"};
		
		cuantosEmpleados = Leer.pedirEntero("Cuantos empleados hay en la empresa?"); // pedimos los empleados normales
		cuantosAdministrativos = Leer.pedirEntero("Cuantos administrativos hay en la empresa?"); // pedimos los empleados administrativos
		cuantosMaquinistas = Leer.pedirEntero("Cuantos maquinistas hay en la empresa?"); // pedimos los empleados maquinistas
		cuantosEmpleadosAdministrativos=cuantosEmpleados+cuantosAdministrativos; // calculamos los empleados normales junto a los administrativos
		cuantosEmpleadosTotal=cuantosEmpleadosAdministrativos+cuantosMaquinistas; // calculamos los empleados totales (normales, administrativos y maquinistas)
		empleados = new Empleado[cuantosEmpleadosTotal]; // cremos el vector con la longitud calculada a raiz de todos los empleados
		
		crearEmpleados(empleados,nombres, cuantosEmpleados); // llama al metodo crearEmpleados pasandole el vector de empleadosm el nombre y la cantidad de empleados
		crearAdministrativos(empleados,nombres,estudios,cuantosEmpleadosAdministrativos); // llama al metodo crearAdministrativos pasandole el vector de empleadosm el nombre y la cantidad de administrativos
		crearMaquinistas(empleados,nombres, cuantosMaquinistas, cuantosEmpleadosTotal); // llama al metodo crearMaquinistas pasandole el vector de empleadosm el nombre y la cantidad de maquinistas
		
		mostrarDatos(empleados);Leer.mostrarEnPantalla(" "); // Llama a mostrarDatos pasandole el vector de empleados
		
		calcularEdad(empleados); // llama a calcularEdad pasandole el vector de empleados
		
	}//main
	
	public static void crearEmpleados(Empleado [] empleados, String[] nombres, Integer cuantosEmpleados){ // Crea empleados normales y los almacena en el vector hasta la posicion calculada con la
																										  // cantidad de empleados establecida arriba
		for (; contadorVector < cuantosEmpleados; contadorVector++) {
			empleados[contadorVector]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20));			
		}
	}
	
	public static void crearAdministrativos(Empleado [] empleados, String[] nombres, String[] estudios, Integer cuantosEmpleadosAdministrativos) { 
		// Crea empleados administrativos y los almacena en el vector desde la ultima posicion usada por empleados hasta la posicion calculada con la cantidad de empleados establecida arriba
		for ( ;contadorVector < cuantosEmpleadosAdministrativos; contadorVector++) {
			empleados[contadorVector]=new Administrativo(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}
	}
	
	public static void crearMaquinistas(Empleado [] empleados, String[] nombres, Integer cuantosMaquinistas, Integer cuantosEmpleadosTotal){
		// Crea empleados administrativos y los almacena en el vector desde la ultima posicion usada por administrativos hasta la posicion calculada con la cantidad de empleados establecida arriba
		for (; contadorVector < cuantosEmpleadosTotal; contadorVector++) {
			empleados[contadorVector]=new Maquinista(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}
	
	public static void mostrarDatos(Empleado [] v){ // muestra los datos de todos los empleados
		for (int i = 0; i < v.length; i++) {
			v[i].visualizarTodosDatos();
			Leer.mostrarEnPantalla("______________________________________");
		}
	}
	
	public static void calcularEdad(Empleado [] v) { // calcula la edad de todos los empleados normales, administrativos y maquinistas por separado
		Integer i, empleadosEdadTotal=0, empleadosContador=0, administrativosEdadTotal=0, administrativosContador=0, maquinistaEdadTotal=0, maquinistaContador=0;
		for(i=0; i<v.length; i++) {
			if(v[i] instanceof Administrativo) {
				administrativosEdadTotal += v[i].getEdad();
				administrativosContador++;
			}else if(v[i] instanceof Maquinista) {
				maquinistaEdadTotal += v[i].getEdad();
				maquinistaContador++;
			}else if (v[i] instanceof Empleado) {
				empleadosEdadTotal += v[i].getEdad();
				empleadosContador++;
			}
		}
		
		Leer.mostrarEnPantalla("Edad media de administrativos: " + Integer.toString(administrativosEdadTotal/administrativosContador)+" años");
		Leer.mostrarEnPantalla("Edad media de maquinistas: " + Integer.toString(maquinistaEdadTotal/maquinistaContador)+" años");
		Leer.mostrarEnPantalla("Edad media de empleados: " + Integer.toString(empleadosEdadTotal/empleadosContador)+" años");
		
		
	}
	
}//Principal
