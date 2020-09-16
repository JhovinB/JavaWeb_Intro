package ejercicio9_wrappers;

import java.util.Scanner;

public class Programa9 {

	public static void main(String[] args) {
		
		Integer [] numeros = new Integer[5]; 
		
		numeros[0] = new Integer (7);
		numeros[1] =9;//autoboxing->new Integer(9)
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		int valor =numeros[0];//unboxing->numeros[0].intValue()
		System.out.println(valor);
		
		System.out.println();
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.println("Ingrese el número");
			String dato = sc.next();
			
			double decimal = Double.parseDouble(dato);
			Double decimal2 = Double.valueOf(dato);
		
			System.out.println(decimal);
			System.out.println(decimal2);
			
			int entero = 10;
			int decimal3 = entero;
			System.out.println(decimal3);
			
			Integer enteroW = 10;
			Number numberW = entero;
			System.out.println("numberW: "+numberW.doubleValue());
			
			Double decimalW = (double) enteroW;//Integer->int->double-->Double
			System.out.println("decimalW: "+decimalW);
			
			float flotaPrimitivo = 1000f;
			long longPrimitivo = 100L;
			
			
		} catch (NumberFormatException ne) {
			System.out.println("Ingrese un número válido");
		}
	
	}

}
