package Tarea;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		
		Cuenta ej=new Cuenta();
		
		ej.setNumerodecuenta(123-590);
		System.out.println("Numero de cuenta: " + ej.getNumerodecuenta() );
		ej.setNombredelcliente("allyson");
		System.out.println("Nombre del cliente: " + ej.getNombredelcliente());
		ej.setEmail("Allyson@gmail.com");
		System.out.println("Email: " + ej.getEmail());
		ej.setNumerodetelefono(81462933);
		System.out.println("Numero de telefono: " + ej.getNumerodetelefono());
	    ej.setBalance(1500);
	    ej.retirar(1200);
	    ej.depositar(3000);
	    ej.retirar(8000);
	  
	}



		
	}



