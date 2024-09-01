package Lamparas;

public class Lamp {
	//Atributos
	private String Marca;
	private String Modelo;
	private String Color;
	private String Tamaño;
	private double precio;
	private String Gama_De_Potencia;
	private double Duracion;
	private String Tipo;
	//Incandescentes.
	//Halógenas.
	//Fluorescentes.
	//Led.
	//Bajo consumo.
	//De filamentos.
	//Metodos
	//funcionalidad- que es lo que hace la app
	//getters y setters-son para manipular los atributos
	public String getMarca() {
		return this.Marca;
	}
	public void setMarca(String marca) {
		this.Marca = marca;
	}
	public String getModelo() {
		return this.Modelo;
	}
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	public String getColor() {
		return this.Color;
	}
	public void setColor(String color) {
		this.Color = color;
	}
	public String getTamaño() {
		return this.Tamaño;
	}
	public void setTamaño(String tamaño) {
		this.Tamaño = tamaño;
	}
	public double getPrecio() {
		return this.precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getGama_De_Potencia() {
		return this.Gama_De_Potencia;
	}
	public void setGama_De_Potencia(String gama_De_Potencia) {
		this.Gama_De_Potencia = gama_De_Potencia;
	}
	public double getDuracion() {
		return this.Duracion;
	}
	public void setDuracion(double duracion) {
		this.Duracion = duracion;
	}
	public String getTipo() {
		return this.Tipo;
	}
	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}
	
	//constructores-son para incializar objetos
}
