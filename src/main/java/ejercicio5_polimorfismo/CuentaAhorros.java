package ejercicio5_polimorfismo;

public class CuentaAhorros extends CuentaBancaria{

	public CuentaAhorros(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	
	}

	public CuentaAhorros(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
		
	}

	@Override
	public String toString() {
		return "CuentaAhorros [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", Saldo=" + getSaldo()
				+ "]";
	}
	
	@Override
	public void retiro(double monto) {
		if (monto<0) {
			System.out.println("Ingrese un numero mayor a cero");
		}else {
			super.saldo -=monto;
		}
	
	}
	
	
}
