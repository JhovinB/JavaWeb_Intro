package ejercicio7_interfaces;


//interface IOperacionBancaPorInternet{
//	void transferencia();
//	void consultarProducto();
//}

public interface IOperacionBancarias {//->extends IOperacionBancaPorInternet 

	public void deposito(double monto);
	
	public void retiro(double monto);
	
	default void transferencia() {
		System.out.println("Invoca transeferencia");
	}
}
