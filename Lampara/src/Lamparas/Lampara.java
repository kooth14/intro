package Lamparas;

import java.util.Scanner;
public class Lampara {
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		//instancia (objeto) de la clase Lamp
		Lamp lampG = new Lamp();
		lampG.setPrecio(1500);
		lampG.setTamaño("Normal");
		lampG.setTipo("Led");
		lampG.setModelo("Colgante");
		lampG.setMarca("Artemide");
		lampG.setGama_De_Potencia("GB");
		lampG.setDuracion(1000);
		lampG.setColor("Amarilla");
		System.out.println(("Precio:  ") + lampG.getPrecio());
		System.out.println(("Tamaño: ") + lampG.getTamaño());
		System.out.println(("Tipo:  ") + lampG.getTipo());
		System.out.println(("Modelo:  ")+ lampG.getModelo());
		System.out.println(("Marca:  ")+ lampG.getMarca());
		System.out.println(("Gama de potencia:  ")+ lampG.getGama_De_Potencia());
		System.out.println(("Duracion:  ")+ lampG.getDuracion());
		System.out.println(("Color:  ")+ lampG.getColor());
	}

}
