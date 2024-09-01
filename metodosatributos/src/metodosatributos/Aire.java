package metodosatributos;

public class Aire {

	public static void main(String[] args) {
		Aireacondicionado ejecucion= new Aireacondicionado ();

	ejecucion.setGarantia(5);
		System.out.println("garanatia: " + ejecucion.getGarantia() + " años");
	ejecucion.setMarca("Carrier");
	    System.out.println("marca: " + ejecucion.getMarca());
	ejecucion.setModelo("Split");
	    System.out.println("modelo: " + ejecucion.getModelo());
	ejecucion.setPrecio(12500.45);
	    System.out.println("precio:" + ejecucion.getPrecio());
	ejecucion.setVelocidadenfriamento(10);
	    System.out.println("velocidad de enfriamento: " + ejecucion.getVelocidadenfriamento() + " minutos");
		
	}

}
