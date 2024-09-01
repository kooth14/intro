package PaqueteDeApps;

public class Carro {
	
		String Tipo;
		int Modelo;
		double Precio;
		double kmsConducidos;
		static String Propietario;
		
		public Carro (String Tipo, int Modelo, double Precio, double kmsConducidos, String Propietario)  {
			this.Tipo = Tipo;
			this.Modelo = Modelo;
			this.Precio = Precio;
			this.kmsConducidos = kmsConducidos; 
			this.Propietario = Propietario;
			System.out.println("Clase creada!");
		}
		public Carro() {
			System.out.println("Clase 2 creada!");
		}
		double calcularprecio() {
			double  NuevoPrecio = Precio - (kmsConducidos * 100);
			return NuevoPrecio;
		}

	}


