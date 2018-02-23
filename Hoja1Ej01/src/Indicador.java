

public class Indicador {

	private int velocidad;
	private int velocidadMax;
	private int velocidadMin;
	
	Indicador(){
		
	}
	Indicador(int vel, int max, int min){
		velocidad = vel;
		velocidadMax = max;
		velocidadMin = min;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public int getVelocidadMax() {
		return velocidadMax;
	}
	
	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}

	public int getVelocidadMin() {
		return velocidadMin;
	}

	public void setVelocidadMin(int velocidadMin) {
		this.velocidadMin = velocidadMin;
	}

	public int total() {
		return velocidad;
	}
	
	public int velocidadSuma() {
		velocidad++;
		return velocidad;
	}
	
	public int velocidadResta() {
		velocidad--;
		return velocidad;
	}
	
}
