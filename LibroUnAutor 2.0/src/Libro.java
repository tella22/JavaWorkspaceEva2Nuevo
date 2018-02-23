public class Libro {

	private String titulo;
	private Integer autorPos;
	private double precio;
	private int cantidad = 0;
	private Autor autor;

	Libro(String titulo, Integer autorPos, double precio) {
		this.titulo = titulo;
		this.autorPos = autorPos;
		this.precio = precio;
	}

	Libro() {

	}

	Libro(String titulo, Integer autorPos, double precio, int cantidad) {
		this.titulo = titulo;
		this.autorPos = autorPos;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAutor() {
		return this.autorPos;
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
		return "Libro [titulo = " + titulo + ", autor: " + GestionLibroAutor.vecAutor[autorPos].getNombre()
				+ ", precio = " + precio + " cantidad = " + cantidad + "]";
	}
}
