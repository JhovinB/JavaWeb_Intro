package ejercicio7_interfaces;

public class CuentaNegocio extends CuentaBancaria implements IOperacionBancarias{

	
	private double limitePrestamo;
	
	public CuentaNegocio(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
		
		
	}
	

	public CuentaNegocio(String numeroCuenta, String titular, double saldo,double limitePrestamo) {
		super(numeroCuenta, titular, saldo);
		this.limitePrestamo= limitePrestamo;
	}


	public double getLimitePrestamo() {
		return limitePrestamo;
	}


	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}


	@Override
	public void deposito(double monto) {
//		super.saldo +=monto; 
		
		if (monto<0) {
			System.out.println("Ingrese un numero mayor a cero");
		}else {
			this.saldo += monto;
		}
	}


	@Override
	public void retiro(double monto) {
		if (monto<0) {
			System.out.println("Ingrese un numero mayor a cero");
		}else {
			this.saldo -= monto;
			this.saldo -= COMISION_RETIRO;
		}
	}
	
	 void prestamo(double prestamo) {
		 if (prestamo<=limitePrestamo) {
			deposito(prestamo-10);//Comision por prestamo = 10
		}else{
			System.out.println("Supera el límite de prestamo");
		}
		
	}


	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo=" + limitePrestamo + ", numeroCuenta=" + numeroCuenta + ", titular="
				+ titular + ", saldo=" + saldo + ", estado=" + estado + "]";
	}
	
	
	
}
