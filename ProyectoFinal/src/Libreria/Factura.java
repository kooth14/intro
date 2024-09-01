package Libreria;

public class Factura extends Compra{
		
	
     public Factura(String nombre, String marca, int cantidad, double precio, double total) {
		super(nombre, marca, cantidad, precio, total);
	}

	public static void Factura1() {
		
	    System.out.println("Libreria GoldMax");
	    System.out.println("****************");
		System.out.println("se realizo una venta de " + cantidad + "productos");
		System.out.println("*************************************************");
		System.out.println("dinero registrado " + total);
		System.out.println("**************************");
		System.out.println("Gracias por su compra vuelva pronto");
		System.out.println("***********************************");
}


}
