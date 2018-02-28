
import java.io.*;

import java.util.*;
public class Ejemplo02_b {
	public static void main(String args[]) throws IOException{
		int dividendo, divisor, cociente;
		String cadDividendo, cadDivisor;
		InputStreamReader via = new InputStreamReader(System.in);
		BufferedReader teclado = new BufferedReader(via);
		boolean correcto = false;
		int contaletras=0;
		while(!correcto && contaletras <5){
			try{

				System.out.println("\nDividendo?");
				cadDividendo=teclado.readLine();
				dividendo=Integer.parseInt(cadDividendo);

				System.out.println("\nDivisor?");
				cadDivisor=teclado.readLine();
				divisor=Integer.parseInt(cadDivisor);

				cociente=dividendo/divisor;

				System.out.println("\n" + dividendo + " / " + divisor + " = " + cociente);
				correcto=true;//si se produce un error no pasa por aqui
			}
			catch(NumberFormatException e){
				contaletras++; // si no se dan numeros correctos permitimos hasta 5 fallos
				System.out.println("\nSe han introducido caracteres no num�ricos por " + contaletras + "� vez");
				if(contaletras==5){
					System.out.println("\nEl programa se cierra por insistir en los errores");
				}
			}
			catch(ArithmeticException ex){
				System.out.println("\nDivisi�n entre cero");
				correcto=true;//si divide por cero ya no vuelve a pedir datos
			}
		}//while
	}//main
}//class
