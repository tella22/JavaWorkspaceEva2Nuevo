
public class Libro {

	private String titulo;
	private Autor autor;
	private double precio;
	private int cantidad=0;
	
	Libro(String titulo, Autor autor, double precio){
		this.titulo=titulo;
		this.autor=autor;
		this.precio=precio;
	}
	
	Libro(String titulo, Autor autor, double precio, int cantidad){
		this.titulo=titulo;
		this.autor=autor;
		this.precio=precio;
		this.cantidad=cantidad;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public Autor getAutor() {
		return autor;
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
		return "Libro [titulo = " + titulo + autor.cadenaAutor() + ",precio = 18,90 cantidad = 3]";
	}
}
