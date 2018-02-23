import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TragaBolas {

	private static String color;
	private static int bolasComidas, maxBolas, comer, menu;
	private boolean num;
	Scanner teclado=new Scanner(System.in);

	TragaBolas() {
		color = "";
		bolasComidas=0;
		maxBolas=0;
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

	public void comer() {	
		if(bolasComidas<maxBolas) {
			bolasComidas++;
			System.out.println("__________________");
			System.out.println("\nHe comido una bola");
			System.out.println("__________________");
		}else {
			System.out.println("_______________________________________________");
			System.out.println("\nlimite de bolas alcanzado, no puede comer más");
			System.out.println("_______________________________________________");
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
