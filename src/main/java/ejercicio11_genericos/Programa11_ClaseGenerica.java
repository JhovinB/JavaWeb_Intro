package ejercicio11_genericos;

public class Programa11_ClaseGenerica {

	public static void main(String[] args) {
		
		ClaseGenerica<String> clase1 = new ClaseGenerica<String>("Java Web Developer");
		System.out.println(clase1.getVariableInstancia());
		
		ClaseGenerica<Integer> clase2 = new ClaseGenerica<Integer>(20);
		System.out.println(clase2.getVariableInstancia());
		
		
		GenericoMultiple<Integer, Integer> clase3 = new GenericoMultiple<>();
		System.out.println(clase3.suma(15,15));
		
		GenericoMultiple<Double, Double> clase4 = new GenericoMultiple<>();
		System.out.println(clase4.suma(40.0,15.0));
	
	
	}

}
