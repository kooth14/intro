package Libreria;
import java.util.Scanner;
public class Compra extends CompraVenta{
	
	public Compra(String nombre, String marca, int cantidad, double precio, double total) {
		super(cantidad, marca, nombre, precio, total);
		
	}
	Scanner leer =new Scanner(System.in);
	
		public void Compra1() {
			System.out.println("***Libreria GoldMax***");
			System.out.println("Diespuestos a ofrecer las mejores atenciones a nuestros clientes");
			
			this.cantidad = -1;
			while (this.cantidad == -1) {
				System.out.print("Ingrese la cantidad de productos que desea comprar: ");
                cantidad=leer.nextInt();
				try {
					this.cantidad = Integer.parseInt(leer.nextLine());
				} catch (NumberFormatException exception) {
					System.out.println("ERROR, el valor d cantidad es incorrecto, favor vuelva a ingresarlo " );
				}
			}
			int P[] = new int[cantidad];
			for (int i = 0; i < P.length; i++) {
			System.out.print("Ingrese el nombre del productos: " );
			this.setNombre(leer.nextLine());
			P[i] = leer.nextInt();
			}	
			for (int i = 0; i < P.length; i++) {
			System.out.print("Ingrese el precio del producto: ");
			P[i] = leer.nextInt();
			setPrecio(Double.parseDouble(leer.nextLine()));
			while (this.getPrecio() < 0) {
		          System.out.println("ERROR, Su precio  no puede ser negativo, favor volver a ingresarlo");
		          System.out.print("Ingrese el precio del producto:  ");
		          this.precio = Double.parseDouble(leer.nextLine());
			}
			}	
		}	
			public void total(int resultado) {
				int rebaja=30;
				total=precio+cantidad;
				resultado=(int) (total-rebaja);
				if(total < 100) {
					
				System.out.println("El total es de: " + total);
				System.out.println("Gracias por su compra");
				
				}else {
					
					System.out.println("debido a que su compra fue mayor o igual de 100 cordobas se le hizo una rebaja de 30 cordobas" + resultado);
					
				return;	
				}
				
				
		}
}

	
		
	




