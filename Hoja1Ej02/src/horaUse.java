import java.util.Scanner;
public class horaUse {

	public static void main(String[] args) throws InterruptedException {
		Scanner teclado = new Scanner(System.in);
		int cont, i, pos=0;
		int entrada=0;
		int hora = 0;
		int min = 0;
		int seg=0;
		int mul = 1;
		String cadena;
		hora reloj = new hora();
//		System.out.println("Introduce una hora");
//		int hora = teclado.nextInt();
//		System.out.println("Introduce un minuto");
//		int min = teclado.nextInt();
//		System.out.println("Introduce un segundo");
//		int sec = teclado.nextInt();
//		hora reloj =new hora(hora,min,sec);
		System.out.println("¿Cuanto tiempo quieres recorrer?(xxh xxm xxs)");
//		teclado.nextLine();
		cadena = teclado.nextLine();
		for(i = 0;i<cadena.length();i++) {
			switch(cadena.toLowerCase().charAt(i)){
			case 'h':
				for(int j = i;j>=0;j--) {
					if(cadena.charAt(j)>=48 && cadena.charAt(j)<=57) {
						hora += (cadena.charAt(j)-48)*mul;
						mul*=10;
					}
				}
				entrada = hora*60*60;
//				entrada = (Integer.parseInt(cadena.substring(0, i)))*60*60;
				pos = i+1;
				break;
			case 'm':
				mul=1;
				for(int j = i;j>=pos;j--) {
					if(cadena.charAt(j)>=48 && cadena.charAt(j)<=57) {
						min += (cadena.charAt(j)-48)*mul;
						mul*=10;
					}
				}
				entrada+= (min*60);
//				entrada += (Integer.parseInt(cadena.substring(pos, i)))*60;
				pos = i+1;
				break;
			case 's':
				mul=1;
				for(int j = i;j>=pos;j--) {
					if(cadena.charAt(j)>=48 && cadena.charAt(j)<=57) {
						seg += (cadena.charAt(j)-48)*mul;
						mul*=10;
					}
				}
				entrada+=seg;
//				entrada += Integer.parseInt(cadena.substring(pos,i));
				break;
				
			}
		}
		for(cont=0; cont<(entrada); cont++) {
			reloj.contaSegundos();
		}
		teclado.close();
	}

}