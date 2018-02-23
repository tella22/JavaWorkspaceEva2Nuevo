package visibilidad1;

public class Principal {

	public static void main(String[] args) {

		Empleado vecEmpleados[] = new Empleado[9999];
		Jefe[] vecJefes = new Jefe[9999];
		Jefe jefe = new Jefe();
		Integer newSueldoBase, cantidadEmpleados, cantidadJefes, i, opcionMenu, incrementoSueldo, edad,
				cantidadEmpleadosRestante;
		String nombre, departamento;

		cantidadEmpleados = Leer.pedirEntero("Cuantos empleados quieres crear");

		do {
			cantidadJefes = Leer.pedirEntero("cuantos jefes va a haber (como máximo sera la mitad que empleados que son: " + cantidadEmpleados + " )");
			if (cantidadJefes <= (cantidadEmpleados / 2)) {
				for (i = 0; i < cantidadJefes; i++) {
					nombre = Leer.pedirCadena("Introduce el nombre del jefe numero " + (i + 1));
					edad = Leer.pedirEntero("introduce la edad del jefe numero " + (i + 1));
					incrementoSueldo = Leer
							.pedirEntero("introduce el porcentaje de incremento de sueldo del jefe numero " + (i + 1));
					departamento = Leer
							.pedirCadena("introduce el departamento del cual es jefe el jefe numero " + (i + 1));
					vecJefes[i] = new Jefe(nombre, edad, incrementoSueldo, departamento);
				}
			} else {
				System.out.println("La cantidad de jefes debe de ser menor que la mitad de empleados");
			}
		} while (cantidadJefes > (cantidadEmpleados / 2));

		cantidadEmpleadosRestante = cantidadEmpleados - cantidadJefes;

		for (i = 0; i < cantidadEmpleadosRestante; i++) {
			nombre = Leer.pedirCadena("Introduce el nombre del empleado numero " + (i + 1));
			edad = Leer.pedirEntero("introduce la edad del empleado numero " + (i + 1));
			incrementoSueldo = Leer.pedirEntero("introduce el porcentaje de incremento de sueldo del empleado numero " + (i + 1));
			vecEmpleados[i] = new Empleado(nombre, edad, incrementoSueldo);
		}

		do {
			mostrarMenu();
			opcionMenu = Leer.pedirEntero("ELIJA UNA OPCIÓN:");

			switch (opcionMenu) {

			case 1:
				newSueldoBase = Leer.pedirEntero("introduce el nuevo sueldo base de todos los empleados");
				jefe.setSueldoBase(newSueldoBase);
				break;
			case 2:
				jefe.setPlusSueldo(Leer.pedirEntero("introduce el nuevo plus de todos los jefes"));
				break;
			case 3:
				
				Leer.mostrarEnPantalla("__________________");
				Leer.mostrarEnPantalla("Empleado/s");
				Leer.mostrarEnPantalla("__________________");
				
				for(i=0; i<cantidadEmpleadosRestante; i++) {
					vecEmpleados[i].visualizar();
				}
				
				Leer.mostrarEnPantalla("__________________");
				Leer.mostrarEnPantalla("Jefe/s");
				Leer.mostrarEnPantalla("__________________");
				
				for(i=0; i<cantidadJefes; i++) {
					vecJefes[i].visualizar();
				}
				
			}

		} while (opcionMenu != 0);

	}

	public static void mostrarMenu() {
		System.out.println("1. Modificar el sueldo base de todos los empleados");
		System.out.println("2. Modificar el plus de todos los jefes");
		System.out.println("3. Visualuzar los datos de todos los empleados");
		System.out.println("0. Salir");
		System.out.println();
	}

}
