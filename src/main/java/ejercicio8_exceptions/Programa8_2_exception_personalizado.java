package ejercicio8_exceptions;

public class Programa8_2_exception_personalizado {

	public static void main(String[] args) {
		
		CuentaAhorro cuenta = new CuentaAhorro("12345","Jhovin",20);
		System.out.println("Antes del retiro "+cuenta.toString());
		try {
			cuenta.setEstado(EstadoCuenta.BLOQUEADA);
			cuenta.retiro(10);
			System.out.println("Luego del retiro: "+cuenta.toString());
		} catch (FondosInsuficientesException | CuentaBloqueadaException e) {
			System.out.println("Error: "+e.getMessage());
			
		}

	}

}
