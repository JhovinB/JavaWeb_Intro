package ejercicio4.packageA;

import ejercicio4_modificadores.CuentaBancaria;

public class ClaseA {
	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("12345","Jhovin");
		//cuenta.numeroCuenta->no se puede acceder por q esta en otro package.
		
	}
}
