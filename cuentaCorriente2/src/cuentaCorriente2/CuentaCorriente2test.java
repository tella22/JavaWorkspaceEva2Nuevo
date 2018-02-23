package cuentaCorriente2;
import java.util.Scanner;

public class CuentaCorriente2test {

	public static void main(String[] args) {
		
		CuentaCorriente2 vecCuentas[] = new CuentaCorriente2[2];
		int i, opcion, aleatorio;
		double ingreso;
		Scanner teclado = new Scanner(System.in);
		String cuenta;
		String nombres[] = new String[]{"Juan", "German", "Maria", "Eric"};
		
		for (i=0; i<2; i++) {
			aleatorio=(int)Math.floor(Math.random()*(3-1+1)+(1));
			cuenta="00"+Integer.toString(i+1);
			vecCuentas[i]= new CuentaCorriente2(cuenta, 50.0, nombres[aleatorio]);
		}
		
		do {
			mostrarMenu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				ingreso=teclado.nextDouble();
				ingreso(vecCuentas, ingreso);
				break;
			case 2:
				System.out.println("Saldo a introducir");
				ingreso=teclado.nextDouble();
				vecCuentas[1].ingresaEfectivo(ingreso);
				break;
			case 3:
				System.out.println("Saldo a retirar");
				ingreso=teclado.nextDouble();
				if(vecCuentas[0].retiraEfectivo(ingreso)) {
					System.out.println("se ha retirado la cantidad");
				}else {
					System.out.println("no se ha retirado");
				}
				break;
			case 4:
				System.out.println("Saldo a retirar");
				ingreso=teclado.nextDouble();
				if(vecCuentas[1].retiraEfectivo(ingreso)) {
					System.out.println("se ha retirado la cantidad");
				}else {
					System.out.println("no se ha retirado");
				}
				break;
			case 5:
				for(i=0; i<vecCuentas.length; i++) {
					vecCuentas[i].visualiza();
				}
			case 0:
				break;
			}
		} while (opcion != 0);
		
	}

	public static void ingreso(CuentaCorriente2[] vecCuentas, double ingreso) {
		System.out.println("Cantidad a introducir");				
		vecCuentas[0].ingresaEfectivo(ingreso);
	}

	public static void mostrarMenu() {
		System.out.println("1: Ingresar en la cuenta 001");
		System.out.println("2: Ingresar en la cuenta 002");
		System.out.println("3: Retirar en la cuenta 001");
		System.out.println("4: Retirar en la cuenta 002");
		System.out.println("5: Visualizar ambas cuentas");
		System.out.println("0: Salir");
		
	}	
}
