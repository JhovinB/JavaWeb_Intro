package ejercicio3_herencia;

public class Programa3 {

	public static void main(String[] args) {
		
		CuentaBancariaEmpresa  cuentaEmpresa = new CuentaBancariaEmpresa("12345","Kenia",100);
		
		System.out.println("Cuenta Empresa: "+cuentaEmpresa.toString());
		
		cuentaEmpresa.prestamo(60);
		System.out.println("Cuenta: "+cuentaEmpresa.toString());
		
		cuentaEmpresa.prestamo(150);
		System.out.println("Cuenta: "+cuentaEmpresa.toString());
		
		CuentaBancaria cuentaEmpresa2 = new CuentaBancariaEmpresa("12345","Diego",100);
		System.out.println("Cuenta 2: "+cuentaEmpresa2.toString());
		
		//Caste de Clase
		CuentaBancariaEmpresa cuenta3 =(CuentaBancariaEmpresa)cuentaEmpresa2;
		cuenta3.prestamo(40);
		System.out.println("Cuenta 3: "+cuenta3.toString());
				
	}

}
