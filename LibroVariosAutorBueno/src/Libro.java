
public class Libro {
	
	private String titulo;
	private Double precio;
	private Integer cantidad;
	private Integer autores[];
	
	public Libro(String titulo, Integer[] autores, Double precio) {
		this.titulo=titulo;
		this.autores=autores;
		this.precio=precio;
		GestionLibroAutor.listaLibros++;
	}

	public Libro(String titulo, Integer autores[], Double precio, Integer cantidad) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.cantidad = cantidad;
		GestionLibroAutor.listaLibros++;
	}
	
//	public Libro(String titulo, Autor autor, Double precio, Integer cantidad, Autor[] posicionAutor) {
//		this.titulo = titulo;
//		this.autor = autor;
//		this.precio = precio;
//		this.cantidad = cantidad;
//	}

	public String cadenaLibro() {
		String cadena = "\tLibro [titulo = " + titulo + ", \n\t\tAutores:[\n";
		for(int i=0; i<autores.length; i++) {
			cadena+="\t\t\t"+GestionLibroAutor.vecAutor[autores[i].intValue()].cadenaAutor();
			cadena+="\n";
		}
		cadena+="\t\tprecio = " + precio + " cantidad = " + cantidad + "]";
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
