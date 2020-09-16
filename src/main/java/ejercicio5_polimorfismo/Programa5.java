package ejercicio5_polimorfismo;
public class Programa5 {

	public static void main(String[] args) {
		
		CuentaBancaria cuentaEmpresa = new CuentaBancariaEmpresa("12345","Diego",1000,100);
		CuentaBancaria cuentaAhorros = new CuentaAhorros("12345","Diego",600);
		
		cuentaEmpresa.retiro(100);
		cuentaAhorros.retiro(100);
		
		System.out.println("Cuenta Empresa: "+cuentaEmpresa.toString());
		System.out.println("Cuenta Ahorro: "+cuentaAhorros.toString());
		
	}

}
