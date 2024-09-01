package Tarea;

public class Cuenta {
	private int numerodecuenta;
	private double balance;
	private String Nombredelcliente;
	private String email;
	private int numerodetelefono;
	
	public void depositar(double montoDepositado) {
		this.balance += montoDepositado;
		System.out.println("El deposito es de: " + montoDepositado);
		System.out.println("En la cuenta tiene: " + this.balance);
	}
	
	public void retirar(double montoRetirado) {
		if(this.balance - montoRetirado < 0) {
			System.out.println("La cuenta no tiene suficientes fondos para la cantidad solicitada");
		}else {
			this.balance += montoRetirado;
			System.out.println("El retiro fue de: " + montoRetirado);
			System.out.println("En la cuenta tiene: " + this.balance);
		}
				
		
	}
	
	public int getNumerodecuenta() {
		return this.numerodecuenta;
	}



	public void setNumerodecuenta(int numerodecuenta) {
		this.numerodecuenta = numerodecuenta;
	}



	public double getBalance() {
		return this.balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public String getNombredelcliente() {
		return this.Nombredelcliente;
	}



	public void setNombredelcliente(String nombredelcliente) {
		this.Nombredelcliente = nombredelcliente;
	}



	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public int getNumerodetelefono() {
		return this.numerodetelefono;
	}



	public void setNumerodetelefono(int numerodetelefono) {
		this.numerodetelefono = numerodetelefono;
	}



	

		
	}


