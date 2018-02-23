import java.util.Scanner;

public class CuentaCorrienteUse {

	public static void main(String[] args) {
		//CuentaCorriente cuenta = new cuentaCorriente(null, 0);
		
		CuentaCorriente vecCuentas[] = new CuentaCorriente[2];
		llenarVectorCuentas(vecCuentas);
		Scanner teclado = new Scanner(System.in);
		int menu;
		double cantidad=0.0, cuentaUno, cuentaDos;

		cuenta.setNumCuenta("001");
		cuenta.setNumCuenta("002");

		cuenta.setSaldo(0, 0.0);
		cuenta.setSaldo(1, 0.0);

		cuentaUno=0.0;
		cuentaDos=0.0;

		do {
			System.out.println("1: Ingresar en la cuenta 001");
			System.out.println("2: Ingresar en la cuenta 002");
			System.out.println("3: Retirar en la cuenta 001");
			System.out.println("4: Retirar en la cuenta 002");
			System.out.println("5: Visualizar ambas cuentas");
			System.out.println("0: Salir");
			menu=teclado.nextInt();
			switch(menu) {
			case 1:
				System.out.println("cuanto deseas introducir en la cuenta 001");
				cantidad=teclado.nextDouble();
				cuenta.ingresaEfectivo(0, cantidad);
				System.out.println("La cuenta 1 tiene "+cuenta.visualizar(0)+"€ de saldo");
				System.out.println("______________________________________________________");
				break;
			case 2:
				System.out.println("cuanto deseas introducir en la cuenta 002");
				cantidad=teclado.nextDouble();
				cuenta.ingresaEfectivo(1, cantidad);
				System.out.println("La cuenta 2 tiene "+cuenta.visualizar(1)+"€ de saldo");
				System.out.println("______________________________________________________");
				break;
			case 3:
				System.out.println("cuanto deseas retirar de la cuenta 001");
				cantidad=teclado.nextDouble();
				cuenta.retirarEfectivo(1, cantidad);
				System.out.println("La cuenta 1 tiene "+cuenta.visualizar(0)+"€ de saldo");
				System.out.println("______________________________________________________");
				break;
			case 4:
				System.out.println("cuanto deseas retirar de la cuenta 002");
				cantidad=teclado.nextDouble();
				cuenta.retirarEfectivo(2, cantidad);
				System.out.println("La cuenta 2 tiene "+cuenta.visualizar(1)+"€ de saldo");
				System.out.println("______________________________________________________");
				break;
			case 5:
				System.out.println("La cuenta 1 tiene "+cuenta.visualizar(0)+"€ de saldo");
				System.out.println("______________________________________________________");
				System.out.println("La cuenta 2 tiene "+cuenta.visualizar(1)+"€ de saldo");
				System.out.println("______________________________________________________");
				break;
			case 0:
				break;
			}
		} while (menu != 0);
	}//main
	
	public static void llenarVectorCuentas(CuentaCorriente vector[]) {
		String nombres[] = {"pepe", "luis", "maria", "pedro"};
		int i;
		String codigo;
		for(i=0;i<vector.length;i++) {
			
			vector[i]= new CuentaCorriente;
		}
	}

}
