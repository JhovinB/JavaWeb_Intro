package ejercicio11_genericos;

public class GenericoMultiple <N1 extends Number, N2 extends Number> {
	
	public double suma(N1 num1,N2 num2) {
		
	
		if (num1 instanceof Integer) {//instanceof --> si es de la clase
			return Double.sum((int)num1, (int)num2);
		}
		return Double.sum((double)num1, (double)num2);
	}
	
}
