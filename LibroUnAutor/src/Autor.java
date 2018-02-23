
public class Autor {

	private String nombre, email;
	private char genero;
	Autor(){
		
	}
	Autor(String nombre, String email, char genero){
		this.nombre=nombre;
		this.email=email;
		this.genero=genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public char getGenero() {
		return genero;
	}
	
	public String cadenaAutor() {
		return "Autor[nombre = " + nombre + ", email = " + email + ", genero = " + genero + "]";
	}
	
}
