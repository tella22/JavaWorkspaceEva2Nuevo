
public class Libro {
	private static Autor[] vecAutoresLibros = new Autor[100];
	
	private String titulo;
	private Autor autor;
	private Double precio;
	private Integer cantidad;

	public Libro(String titulo, Autor autor, Double precio) {
		this.titulo=titulo;
		this.autor=autor;
		this.precio=precio;
		GestionLibroAutor.vecLibros[GestionLibroAutor.lista] = this;
		GestionLibroAutor.lista++;
	}

	public Libro(String titulo, Autor autor, Double precio, Integer cantidad) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public String cadenaLibro() {
		String cadena = "Libro [titulo = " + titulo + ", " + "Autor [nombre = " + autor.getNombre() + ", email = "
				+ autor.getEmail() + ", genero = " + autor.getGenero() + "] " + "precio = " + precio + " cantidad = "
				+ cantidad + "]";
		return cadena;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor(Integer posicion) {
		return GestionLibroAutor.vecAutor[posicion];
	}

}// Libro
