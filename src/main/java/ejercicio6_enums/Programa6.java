package ejercicio6_enums;

public class Programa6 {
	public static void main(String[] args) {
		
		CuentaBancaria cuenta = new CuentaBancaria("123456","Jhovin");
		System.out.println("Cuenta: "+cuenta.toString());
		
		System.out.println("Estado abreviado + "+cuenta.estado.getAbreviatura());
		
		if (cuenta.estado==EstadoCuenta.ACTIVA) {
			System.out.println("Cuenta Activa");
		}else if (cuenta.estado==EstadoCuenta.BLOQUEADA) {
			System.out.println("Cuenta Bloqueada");
		}
		
		for (EstadoCuenta estado : EstadoCuenta.values()) {
			System.out.println(estado);
		}
	}
}
