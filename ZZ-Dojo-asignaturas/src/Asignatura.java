
public class Asignatura {

	private String nombre;
	private Integer horasSemanales;
	private Character nivel;
	private Double nota;
	
	Asignatura(String nombre, Integer horasSemanales, Character nivel){
		this.nombre=nombre;
		this.horasSemanales=horasSemanales;
		this.nivel=nivel;
	}
	
	public void setNota(Double nota) {
		this.nota=nota;
	}
	
	public String getNombre() {
		return nombre;
	}
	
}
