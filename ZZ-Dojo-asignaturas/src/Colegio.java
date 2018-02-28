import utilidades.Fecha;
import utilidades.Leer;

public class Colegio {

	static Alumno vecAlumnos[] = new Alumno[3];
	static Asignatura vecAsignaturas[] = new Asignatura[6];

	public static void main(String[] args) {

		Asignatura asignatura = new Asignatura("", 0, '\0');
		Alumno alumno = new Alumno("", new Fecha(0, 0, 0));
		String nombreAsignatura;
		Integer i, horas, option, nota;
		char nivel;
		String vecNombres[] = { "Eric", "German", "Luis" };
		String vecNombresAsignaturas[] = { "Programacion", "BBDD", "Marcas", "Sistemas", "Entornos", "Inglés", "FOL",
				"EEIE", "Entorno Cliente", "Entorno Servidor", "Despliegue AW", "Diseño Interfaces" };
		Fecha vecFechas[] = { new Fecha(14, 10, 1999), new Fecha(29, 8, 1997), new Fecha(29, 7, 1997) };

		do {
			mostrarMenu();
			option = Leer.pedirEntero("Escoja la opcion:");
			switch (option) {
			case 1:
				crearAlumnos(vecNombres, vecFechas);
				break;
			case 2:
				crearAsignaturas(vecNombresAsignaturas);
				break;
			case 3:
				// matricular(alumno, vecAsignaturas);
				matricular(vecAsignaturas);
				break;
			case 4:
				for (i = 0; i < 3; i++) {
					Leer.mostrarEnPantalla("Notas del alumno "+vecAlumnos[i].getNombre());
					Leer.mostrarEnPantalla("______________________________________");
					for (int j = 0; j < 6; j++) {
						do {
						nota = Leer.pedirEntero("introduce una nota (de 0 a 10) para la asignatura "+vecAsignaturas[j].getNombre() );
						}while(nota < 0 || nota > 10);
						vecAlumnos[i].setNotas(nota, j);
					}
					Leer.mostrarEnPantalla("______________________________________");
				}
				break;
			case 5:
				for (i = 0; i < 3; i++) {
					vecAlumnos[i].boletin();
				}
				break;
			}
		} while (option != 0);
	}

	private static void mostrarMenu() {
		Leer.mostrarEnPantalla("1. crear alumnos");
		Leer.mostrarEnPantalla("2. crear asignaturas");
		Leer.mostrarEnPantalla("3. matricular alumnos");
		Leer.mostrarEnPantalla("4. calificar alumnos");
		Leer.mostrarEnPantalla("5. imprimir boletines");
		Leer.mostrarEnPantalla("0. salir");
	}

	private static void crearAlumnos(String[] vecNombres, Fecha[] vecFechas) {
		Integer i;
		for (i = 0; i < 3; i++) {
			vecAlumnos[i] = new Alumno(vecNombres[i], vecFechas[i]);
		}
	}

	private static void crearAsignaturas(String[] vecNombresAsignaturas) {
		String nombreAsignatura;
		Integer i;
		Integer horas;
		char nivel;
		horas = (int) Math.floor(Math.random() * (19 - 0 + 1) + (0));
		nivel = (char) Math.floor(Math.random() * (2 - 1 + 1) + (1));
		nombreAsignatura = vecNombresAsignaturas[(int) Math.floor(Math.random() * (11 - 0 + 1) + (0))];
		vecAsignaturas[0] = new Asignatura(nombreAsignatura, horas, nivel);
		for (int j = 1; j < vecAsignaturas.length; j++) {
			horas = (int) Math.floor(Math.random() * (19 - 0 + 1) + (0));
			nivel = (char) Math.floor(Math.random() * (2 - 1 + 1) + (1));
			nombreAsignatura = vecNombresAsignaturas[(int) Math.floor(Math.random() * (11 - 0 + 1) + (0))];
			for (int k = j; k>0 ; k--) {
				while (nombreAsignatura.equals(vecAsignaturas[k-1].getNombre())) {
					horas = (int) Math.floor(Math.random() * (19 - 0 + 1) + (0));
					nivel = (char) Math.floor(Math.random() * (2 - 1 + 1) + (1));
					nombreAsignatura = vecNombresAsignaturas[(int) Math.floor(Math.random() * (11 - 0 + 1) + (0))];
				}
			}
			vecAsignaturas[j] = new Asignatura(nombreAsignatura, horas, nivel);
		}
	}

	private static void matricular(Asignatura[] vecAsignaturas) {
		Integer i;
		for (i = 0; i < 3; i++) {
			vecAlumnos[i].matricularse(vecAsignaturas);
		}
	}

}
