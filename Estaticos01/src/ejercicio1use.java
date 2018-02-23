
public class ejercicio1use {

	public static void main(String[] args) {

		int num;
		num=Estaticos.pideNumPositivo("dame un numero positivo");
		if(Estaticos.primo(num)) {
			System.out.println("es primo");
		}else {
			System.out.println("no es primo");
		}

	}

}
