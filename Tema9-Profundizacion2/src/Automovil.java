import java.util.Arrays;
import java.util.Collections;

public class Automovil {

	private String marca;
	private String modelo;
	private Integer cilindrada;
	private Integer precio;
	private String vecMarcas[] = { "Skoda", "Nissan", "Toyota", "Mercedes", "Audi", "Volkswagen", "Opel", "Citroën",
			"Ford", "Tata", "Mini", "Chevrolet", "Kia", "Peugeot" };

	Automovil(String marca, String modelo, Integer cilindrada, Integer precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
	}

	public void importarAutomovil(Automovil[] automovil, Integer cantidad) {

		int i;

		for (i = 0; i < cantidad; i++) {

			String marca = vecMarcas[(int) Math.floor(Math.random() * 14)];
			String modelo = "";
			int cilindrada = (int) Math.floor(Math.random() * (2500 - 1000 + 1) + (1000));
			int precio = (int) Math.floor(Math.random() * (30000 - 10000 + 1) + (10000));

			switch (marca) {

			case "Skoda":
				String modeloSkoda[] = { "Octavia", "Fabia", "Superb" };
				modelo = modeloSkoda[(int) Math.floor(Math.random() * 3)];
				break;
			case "Nissan":
				String modeloNissan[] = { "Qashqai", "Micra", "Juke" };
				modelo = modeloNissan[(int) Math.floor(Math.random() * 3)];
				break;
			case "Toyota":
				String modeloToyota[] = { "Yaris", "Auris", "Rav4" };
				modelo = modeloToyota[(int) Math.floor(Math.random() * 3)];
				break;
			case "Mercedes":
				String modeloMercedes[] = { "Clase A", "CLA Shooting Brake", "CLA Coupé" };
				modelo = modeloMercedes[(int) Math.floor(Math.random() * 3)];
				break;
			case "Audi":
				String modeloAudi[] = { "A4", "A5", "A6" };
				modelo = modeloAudi[(int) Math.floor(Math.random() * 3)];
				break;
			case "Volkswagen":
				String modeloVolkswagen[] = { "Passat", "Polo", "Golf" };
				modelo = modeloVolkswagen[(int) Math.floor(Math.random() * 3)];
				break;
			case "Opel":
				String modeloOpel[] = { "Astra", "Corsa", "Combo" };
				modelo = modeloOpel[(int) Math.floor(Math.random() * 3)];
				break;
			case "Citroën":
				String modeloCitroen[] = { "C5", "C4 Picasso", "C4 Cactus" };
				modelo = modeloCitroen[(int) Math.floor(Math.random() * 3)];
				break;
			case "Ford":
				String modeloFord[] = { "Mondeo", "Mustang", "Kuga" };
				modelo = modeloFord[(int) Math.floor(Math.random() * 3)];
				break;
			case "Tata":
				String modeloTata[] = { "Aria", "Vista", "Xenom" };
				modelo = modeloTata[(int) Math.floor(Math.random() * 3)];
				break;
			case "Mini":
				String modeloMini[] = { "Cabrio", "Clubman", "Countryman" };
				modelo = modeloMini[(int) Math.floor(Math.random() * 3)];
				break;
			case "Chevrolet":
				String modeloChevrolet[] = { "Camaro", "Cruze", "Cobalt" };
				modelo = modeloChevrolet[(int) Math.floor(Math.random() * 3)];
				break;
			case "Kia":
				String modeloKia[] = { "Ceed", "Picanto", "Soul" };
				modelo = modeloKia[(int) Math.floor(Math.random() * 3)];
				break;
			case "Peugeot":
				String modeloPeugeot[] = { "308", "3008", "Boxer" };
				modelo = modeloPeugeot[(int) Math.floor(Math.random() * 3)];
				break;
			}

			GestionAutomovil.vecAutomoviles[i] = new Automovil(marca, modelo, cilindrada, precio);
		}
	}

	public void visualizar() {

		int i;

		for (i = 0; i < GestionAutomovil.vecAutomoviles.length && GestionAutomovil.vecAutomoviles[i] != null; i++) {
			Leer.mostrarEnPantalla(
					"__________________________________________________________________________________________");
			Leer.mostrarEnPantalla("\tMarca: " + GestionAutomovil.vecAutomoviles[i].getMarca());
			Leer.mostrarEnPantalla("\tModelo: " + GestionAutomovil.vecAutomoviles[i].getModelo());
			Leer.mostrarEnPantalla(
					"\tCilindrada: " + GestionAutomovil.vecAutomoviles[i].getCilindrada().toString() + " CC");
			Leer.mostrarEnPantalla("\tPrecio: " + GestionAutomovil.vecAutomoviles[i].getPrecio().toString() + " €");
			Leer.mostrarEnPantalla(
					"__________________________________________________________________________________________");
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getCilindrada() {
		return cilindrada;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public static void ordenaCadenas(Automovil[] vecAutomoviles) { //he de mirar esto muy duro
		int posMin, comparison;
		Automovil aux;

		for (int i = 0; i < vecAutomoviles.length && vecAutomoviles[i] != null; i++){
			posMin = i;
			for (int j = i + 1; j < vecAutomoviles.length && vecAutomoviles[j] != null; j++) {
				comparison = vecAutomoviles[posMin].getMarca().compareTo(vecAutomoviles[j].getMarca());
			if ( comparison > 0) {
				posMin = j;
				
			}
			if (posMin != i) {
				aux = new Automovil(vecAutomoviles[i].getMarca(), vecAutomoviles[i].getModelo(), vecAutomoviles[i].getCilindrada(), vecAutomoviles[i].getPrecio());
				vecAutomoviles[i] = new Automovil(vecAutomoviles[posMin].getMarca(),vecAutomoviles[posMin].getModelo(), vecAutomoviles[posMin].getCilindrada(), vecAutomoviles[posMin].getPrecio());
				vecAutomoviles[j].setMarca(aux.getMarca());
				vecAutomoviles[j].setModelo(aux.getModelo());
				vecAutomoviles[j].setCilindrada(aux.getCilindrada());
				vecAutomoviles[j].setPrecio(aux.getPrecio());
			}
		}
	}

	}
}
