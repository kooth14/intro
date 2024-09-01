package PaqueteDeApps;

public class CarroMain {

	public static void main(String[] args) {
		Carro.Propietario = "Danilo";
		Carro Automovil = new Carro("BMW", 2018,200000,500, "Danilo");
		//Automovil.Tipo = "BMW";
		//Automovil.Modelo = 2018;
		//Automovil.Precio = 200000;
		//Automovil.kmsConducidos = 500;
		System.out.println("Propietarios de vehiculo 1 =  " + Automovil.Propietario);
		System.out.println(" Precio actual del vehiculo =  " + Automovil.calcularprecio());
		
		Carro OtroAutomovil = new Carro();
		 OtroAutomovil.Tipo = "Toyota";
		 OtroAutomovil.Modelo = 2015;
		 OtroAutomovil.Precio = 150000;
		 OtroAutomovil.kmsConducidos = 350;
		 OtroAutomovil.Propietario = "Danilo";
		 System.out.println("Propietarios de vehiculo 2 =  " + Automovil.Propietario);
		 System.out.println("Precio actual del otro vehiculo =  " + OtroAutomovil.calcularprecio());
		 
	}

}
