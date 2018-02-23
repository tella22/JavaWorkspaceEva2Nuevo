import java.util.*;
public class TragaBolasUse {

	public static void main(String[] args) {
		TragaBolas hipo = new TragaBolas();
		int menu;
		Scanner teclado=new Scanner(System.in);
		
		do {
			System.out.println("\n 1: Crear tragaBolas.\n 2: Darle de comer.\n 3: Hacerle dormir.\n 4: Trotar.\n 5: Ver Estado. \n 0: Fin.");
			menu = teclado.nextInt();
			switch(menu) {
				case 1:
					System.out.println("\nIntroduce el color (verde, rojo, amarillo, azul)");
					hipo.setColor();
					System.out.println("\nIntroduce el maximo de bolas");
					hipo.setmaxBolas();
					break;
				case 2:
					hipo.comer();
					break;
				case 3:
					hipo.dormir();
					break;
				case 4:
					hipo.trotar();
					break;
				case 5:
					System.out.println(hipo.visualizar());
					break;
				case 0: 
					System.out.println("__________");
					System.out.println("Has salido");
					System.out.println("__________");
					break;
			}
		}while(menu!=0);
	}
}
