package cuentaCorriente2;

public class CuentaCorriente2 {

	private String numCuenta;
	private Double saldo;
	private String nombreCliente;

	CuentaCorriente2(String cuenta, Double cantidad, String cliente) {
		numCuenta = cuenta;
		saldo = cantidad;
		nombreCliente = cliente;
	}

	public void ingresaEfectivo(Double cantidad) {
		saldo+=cantidad;
	}

	public boolean retiraEfectivo(Double cantidad) {
		if (cantidad>saldo) {
			return false;
		}else {
			saldo-=cantidad;
			return true;
		}
	}

	public void visualiza(){
		System.out.println(numCuenta);
		System.out.println(saldo + "€");
		System.out.println(nombreCliente);
		System.out.println("_____________");
	}
	
}
