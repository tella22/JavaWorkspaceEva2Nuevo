
public class ejercicio04use {

	public static void main(String[] args) {
		
		int num, i;
		num=Estaticos.pideNumPositivo("dame un numero positivo");
		
		for (i=0; i<=num; i++) {
			if(Estaticos.primo(i)) {
				System.out.println(i +" es primo");
			}else {
				System.out.println(i + " no es primo");
			}
		}

	}

}
