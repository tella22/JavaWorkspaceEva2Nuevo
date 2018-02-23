import java.util.Scanner;

public class CuentaCorriente {

	private String numCuenta;
	private double[] saldo = new double[2];
	
	


	CuentaCorriente(String numCuenta, double cantidad){
		for(int i=0;i<2;i++){
			haySaldo[i]=false;
			saldo[i]=0.0;
		}
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public void setSaldo(int i, double d) {
		this.saldo[i] = d;
		haySaldo[i]=true;
	}
	
	public void ingresaEfectivo(int menu, double cantidad){	
		saldo[menu]+=cantidad;
	}

	public void retirarEfectivo(int menu, double cantidad){
		if(haySaldo[menu]==true) {
			saldo[menu]-=cantidad;
		}else {
			System.out.println("no hay saldo para poder retirar");
			System.out.println("saldo restante " + saldo);
		}
	}
	
	public double visualizar(int menu){
		return saldo[menu];
	}

}
