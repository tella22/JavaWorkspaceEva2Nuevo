import java.util.concurrent.TimeUnit;

public class hora {

	private int hora;
	private int minuto;
	private int segundo;
	
	hora(){
		hora = 0;
		minuto = 0;
		segundo = 0;
	}
	hora(int HORA, int MINUTO,int SEGUNDO){
		hora=HORA;
		minuto=MINUTO;
		segundo=SEGUNDO;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void contaSegundos() throws InterruptedException {
		if (segundo==59) {
			minuto+=1;
		}
		if (minuto==60) {
			minuto=0;
			hora+=1;
		}
		if (hora==24) {
			hora=0;
		}
		segundo = (segundo + 1)%60;
		TimeUnit.SECONDS.sleep(1);
		System.out.printf("%02d:%02d:%02d %n", hora, minuto, segundo);
		if(segundo==0) {
			System.out.println("un minuto menos");
		}
	}
	
}
