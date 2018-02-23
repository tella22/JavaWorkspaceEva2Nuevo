
public class Autor {
	
	private String nombre, email;
	private Character genero;
	
	Autor(String nombre, String email, Character genero){
		this.nombre=nombre;
		this.email=email;
		this.genero=genero;
		GestionLibroAutor.vecAutor[GestionLibroAutor.lista] = this;
		GestionLibroAutor.lista++;
	}
	
	Autor(Integer posicion, String nombre, String email, Character genero){
		this.nombre=nombre;
		this.email=email;
		this.genero=genero;
		GestionLibroAutor.vecAutor[posicion] = this;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Character getGenero(){
		return genero;
	}
	
	public String cadenaAutor(){
		return "Autor[nombre = " + nombre + ", email = " + email + ", genero = "+ genero + "]";
	}
	
	public static Integer totalAutores() {
		return GestionLibroAutor.lista;
	}
	
	public static Autor getVecAutor(Integer posicion) {
		return GestionLibroAutor.vecAutor[posicion];
	}

	
}
