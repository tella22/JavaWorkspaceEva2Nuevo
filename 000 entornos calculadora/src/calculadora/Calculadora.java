package calculadora;

public class Calculadora {
	private int num1, num2;

	public Calculadora(Integer a, Integer b) {
		num1 = a;
		num2 = b;
	}

	public int suma() {
		int resul = num1 + num2;
		return resul;
	}

	public int resta() {
		int result;
		if (resta2())
			result = num1 - num2;
		else
			result = num2 - num1;
		return result;
	}
	
	public boolean resta2() {
		if (num1 >= num2) {
			return true;
		}else {
			return false;
		}
	}

	public int multiplica() {
		int resul = num1 * num2;
		return resul;
	}

	public int divide() {
		int resul = num1 / num2;
		return resul;
	}
	
	public Integer divide2() {
		if (num2 == 0)
			return null;
		int result = num1 / num2;
		return result;
	}

}
