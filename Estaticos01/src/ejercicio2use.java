
public class ejercicio2use {

	public static void main(String[] args) {

		int p, q;
		p=Estaticos.pideNumPositivo("dame un numero positivo");
		q=Estaticos.pideNumPositivo("dame un otro positivo");
		
		if(Estaticos.divisores(p, q)==1) {
			System.out.println(p+" tiene mas divisores que "+q);
		}else if(Estaticos.divisores(p, q)==2) {
			System.out.println(q+" tiene mas divisores que "+p);
		}else if(Estaticos.divisores(p, q)==0) {
			System.out.println(q+" tiene los mismos divisores que "+p);
		}
	}

}
