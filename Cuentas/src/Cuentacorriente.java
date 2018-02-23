/**
 * 
 */

/**
 * @author yo
 *
 */
public class Cuentacorriente {
	private String numero;
	private Double saldo;
	private String cliente;
	private static Integer siguiente=1;
	
	/**
	 * @param numero
	 * @param saldo
	 * @param cliente
	 */
	public Cuentacorriente(Double saldo, String cliente) {
		String num="0000"+siguiente;
		numero = num.substring(num.length()-3);
		this.saldo = saldo;
		this.cliente = cliente;
		siguiente ++;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	public Double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the siguiente
	 */
	public static Integer getSiguiente() {
		return siguiente;
	}

	/**
	 * @param importe the importe a ingresar
	 */
	public void ingresarEfectivo(Double importe) {
		this.saldo = saldo+importe;
	}
	/**
	 * @param importe the importe a retirar
	 */
	public Boolean retirarEfectivo(Double importe) {
		if (importe>this.saldo){
			return false;
		}else{
			this.saldo = saldo-importe;
			return true;
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cuentacorriente [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}
	/**
	 * @param siguiente the siguiente to set
	 */
	public String visualiza() {
		return "Cuentacorriente [numero=" + numero + ", saldo=" + saldo + ", cliente=" + cliente + "]";
	}

}
