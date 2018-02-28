import utilidades.Fecha;
import utilidades.Leer;;

public class Alumno {

	private String nombre;
	private Fecha fechaNacimiento;
	private Asignatura vecAsignaturas[] = new Asignatura[6];
	private Integer vecNotas[] = new Integer[6];
	
	Alumno(String nombre, Fecha fechaNacimiento){
		this.nombre=nombre;
		this.fechaNacimiento=fechaNacimiento;
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

	public Integer edad() {
		Fecha fechaActual = new Fecha(28, 02, 2018);
		Integer edad = fechaNacimiento.difFechas(fechaActual)/365;
		return edad;
	}
	
	public void matricularse(Asignatura[] asignatura) {
		this.vecAsignaturas=asignatura;
	}
	
	public void boletin() {
		Integer notaTotal=0;
		Integer notaMedia=0;
		Leer.mostrarEnPantalla("\tNombre: "+nombre);
		Leer.mostrarEnPantalla("\tEdad: "+edad().toString());
		for(int i = 0; i<6; i++) {
			Leer.mostrarEnPantalla("\tAsignatura: "+vecAsignaturas[i].getNombre());
			Leer.mostrarEnPantalla("\t\t    Nota: "+vecNotas[i].intValue());
			notaTotal+=vecNotas[i];
		}
		notaMedia=notaTotal/6;
		Leer.mostrarEnPantalla("\tNota Media: "+notaMedia.toString());
		Leer.mostrarEnPantalla("______________________________________");
	}

	public void setNotas(Integer nota, Integer indice) {
		vecNotas[indice] = nota;
	}
	
	public Integer[] getNotas() {
		return vecNotas;
		
	}
	
}
