package ejercicio4_modificadores;

public class CuentaBancariaEmpresa extends CuentaBancaria {

	
	public double limitePrestamo;
	
	
	
	public CuentaBancariaEmpresa(String numeroCuenta, String titular,double limitePrestamo) {
		super(numeroCuenta, titular,limitePrestamo);
		 this.limitePrestamo = limitePrestamo;
	}

	public CuentaBancariaEmpresa(String numeroCuenta, String titular, double saldo,double limitePrestamo) {
		super(numeroCuenta, titular, saldo);
		
		this.limitePrestamo = limitePrestamo;
	}

	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}
	 void prestamo(double prestamo) {
		 if (prestamo<=limitePrestamo) {
			 super.deposito(prestamo-10);//Comision por prestamo = 10
		}else{
			System.out.println("Supera el límite de prestamo");
		}
		
	}

	@Override
	public String toString() {
		return "CuentaBancariaEmpresa [limitePrestamo=" + limitePrestamo + ", NumeroCuenta=" + super.numeroCuenta
				+ ",Titular=" + super.numeroCuenta + ", Saldo=" + getSaldo() + "]";
	}
	 
	
}
