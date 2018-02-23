import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TragaBolasEntornos {

	private static String color;
	private static int bolasComidas, maxBolas, comer, menu;
	private boolean num;
	Scanner teclado=new Scanner(System.in);

	TragaBolasEntornos() {
		color = "";
		bolasComidas=0;
		maxBolas=0;
	}
	
	TragaBolasEntornos(String color, Integer bolasComidas, Integer maxBolas) {
		this.color = color;
		this.bolasComidas=bolasComidas;
		this.maxBolas=maxBolas;
	}

	public void setColor() {
		
		color = teclado.nextLine();
		while(!color.equalsIgnoreCase("verde") && !color.equalsIgnoreCase("rojo") && !color.equalsIgnoreCase("amarillo") && !color.equalsIgnoreCase("azul")) {
			System.out.println("el color debe ser verde, rojo, amarillo, azul");
			color = teclado.nextLine();
		}
	}

	public void setmaxBolas() {
		maxBolas = teclado.nextInt();
	}

	public String visualizar() {
		return "\n Datos:\n" + " Color: " + color + "\n" + " Bolas: " + maxBolas + "\n" + " bolas comidas " + bolasComidas;
	}

	public String comer() {	
		if(bolasComidas<maxBolas) {
			bolasComidas++;
			return "__________________\nHe comido una bola\n__________________";
		}else {
			return "_______________________________________________\nlimite de bolas alcanzado, no puede comer más\n_______________________________________________";
		}
	}
	
	public void dormir() {
		if(bolasComidas==maxBolas){
			System.out.println("______________________");
			System.out.println("\nTripa llena. ZZZZZZ");
			System.out.println("______________________");
			bolasComidas/=2;
		}else {
			System.out.println("______________________");
			System.out.println("\nNo quiero dormir");
			System.out.println("______________________");
		}
	}
		
	public void trotar() {
		if(bolasComidas>=1) {
			bolasComidas--;
			System.out.println("______________________");
			System.out.println("\nEstoy trotando");
			System.out.println("______________________");

		}else {
			System.out.println("_______________________");
			System.out.println("\nNo puedo trotar, tripa vacia");
			System.out.println("_______________________");
		}
	}
}
