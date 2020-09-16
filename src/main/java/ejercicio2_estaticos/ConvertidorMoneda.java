package ejercicio2_estaticos;

import java.util.ArrayList;
import java.util.List;

public class ConvertidorMoneda {

	static double COMISION = 0.06;
	
	static List<String>monedas = new ArrayList<String>();
	
	//Método de clase
	public static double comprarDolar(double dolaresAComprar,double tipoCambio) {
		return dolaresAComprar*tipoCambio*(1+COMISION);
	}
	
	public static void imprimirMonedas() {
		monedas.add("dolares");
		monedas.add("soles");
		
		System.out.println(monedas);
	}
}
