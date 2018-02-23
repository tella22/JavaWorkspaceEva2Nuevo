import java.util.*;
public class Estaticos {

	public static int pideNumPositivo(String mensaje) {
		int  num;
		System.out.println(mensaje);
		do {
			Scanner teclado = new Scanner(System.in);
			num=teclado.nextInt();
		}while(num<=0);
		return num;
	}

	public static boolean primo(int num) {
		int divisor, contaDiv;
		contaDiv = 0;
		for(divisor = 2; divisor < num && contaDiv == 0; divisor++) {
			if(num % divisor == 0) {
				contaDiv++;
			}
		}
		if(contaDiv == 0) {
			return true;
		}else {
			return false;
		}
	}//primo
	
	public static int divisores(int p, int q) {
		int i, contap=0, contaq=0;
		for (i=1; i<p; i++) {
			if(p%i==0) {
				contap++;
			}
		}
		for (i=1; i<q; i++) {
			if(q%i==0) {
				contaq++;
			}
		}
		if(contap>contaq) {
			return 1;
		}else if(contaq>contap){
			return 2;
		}else {
			return 0;
		}
	}//divisores

	public static int factorial(int num) {
		
		int res=1;
		
		for (int i = 1; i <= num; i++) {
            res *= i;
        }
		return res;
	}
	
}
