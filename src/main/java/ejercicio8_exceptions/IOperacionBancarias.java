package ejercicio8_exceptions;


//interface IOperacionBancaPorInternet{
//	void transferencia();
//	void consultarProducto();
//}

public interface IOperacionBancarias {//->extends IOperacionBancaPorInternet 

	public void deposito(double monto);
	
	public void retiro(double monto) throws FondosInsuficientesException,CuentaBloqueadaException;
	
	default void transferencia() {
		System.out.println("Invoca transeferencia");
	}
}
