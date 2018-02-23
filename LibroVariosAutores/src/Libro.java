public class Libro {

	private String titulo;
	private double precio;
	private int cantidad = 0;
	private Integer[] autoresPos;
	private Integer[] autor;

	Libro(String titulo, Integer[] posAutores, double precio) {
		this.titulo = titulo;
		this.autoresPos = posAutores;
		this.precio = precio;
	}

	Libro(String titulo, Integer[] posAutores, double precio, int cantidad) {
		this.titulo = titulo;
		this.autoresPos = posAutores;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public boolean setAutor(Integer[] posAutores) {
		if (posAutores.length > 0 && posAutores.length <= 4) {
			this.autor = new Integer[posAutores.length];
			for (Integer actualPos = 0; actualPos < posAutores.length; actualPos++) {
				autoresPos[actualPos] = posAutores[actualPos];
			}
			return true;
		} else {
			return false;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAutor() {
		return this.autoresPos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio() {

	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad() {

	}

	public String cadenaLibro() {
		return "Libro [titulo = " + titulo + ", autor: " + GestionLibroAutor.autoresPos[autorPos].getNombre()
				+ ", precio = " + precio + " cantidad = " + cantidad + "]";
	}
}
