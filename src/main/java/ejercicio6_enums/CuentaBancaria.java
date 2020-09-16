package ejercicio6_enums;

public class CuentaBancaria {
	
	//Variables de instancia
	protected String numeroCuenta;
	protected String titular;
	protected double saldo;
	
	protected EstadoCuenta estado;
	
	private static final double COMISION_RETIRO = 5;
	
	

	
	public CuentaBancaria(String numeroCuenta, String titular) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo=0;
		estado = EstadoCuenta.ACTIVA;
	}

	public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
		this.numeroCuenta  = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		estado = EstadoCuenta.ACTIVA;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public double getComision() {
		return COMISION_RETIRO;
	}

	//Método de Instancia
	void deposito(double monto) {
		if (monto<0) {
			System.out.println("Ingrese un numero mayor a cero");
		}else {
			this.saldo += monto;
		}
		
		
	}
	//Método de Instancia
	void retiro(double monto) {
		
		if (monto<0) {
			System.out.println("Ingrese un numero mayor a cero");
		}else {
			this.saldo -= monto;
			this.saldo -= COMISION_RETIRO;
		}
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
				+ ", estado=" + estado +", comision=" + COMISION_RETIRO + "]";
	}

	




	
}
