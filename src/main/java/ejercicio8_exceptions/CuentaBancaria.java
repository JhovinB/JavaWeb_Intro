package ejercicio8_exceptions;

public class CuentaBancaria {
	
	//Variables de instancia
	protected String numeroCuenta;
	protected String titular;
	protected double saldo;
	
	protected EstadoCuenta estado;
	
	public static final double COMISION_RETIRO = 5;
	
	

	
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
	

	public EstadoCuenta getEstado() {
		return estado;
	}

	public void setEstado(EstadoCuenta estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
				+ ", estado=" + estado +", comision=" + COMISION_RETIRO + "]";
	}

	




	
}
