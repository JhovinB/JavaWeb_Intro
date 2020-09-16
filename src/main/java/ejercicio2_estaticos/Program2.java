package ejercicio2_estaticos;

public class Program2 {
	public static void main(String[] args) {
		
		//ConvertidorMoneda conv = new ConvertidorMoneda();
		System.out.println("Monto a pagar: "+ConvertidorMoneda.comprarDolar(100, 3.5));
		
		ConvertidorMoneda.imprimirMonedas();
	}
}
