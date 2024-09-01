package Libreria;

public class CompraVenta {
	
	protected double precio;
	private String nombre;
	protected static int cantidad;
	private String marca;
	protected static double total;
	
	public CompraVenta(int cantidad, String marca, String nombre, double precio, double total) {
		this.cantidad=cantidad;
		this.marca=marca;
		this.nombre=nombre;
		this.precio=precio;
		this.total=total;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double gettotal() {
		return total;
	}
	public void settotal(double total) {
		this.total=total;
	}
	
	
}
