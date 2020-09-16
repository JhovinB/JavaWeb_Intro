package ejercicio10_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Programa10_Utils {
	
	public static void main(String [] args) {
		
		String [] colores = {"rojo","azul","celeste","negro"};

		List<String> lista = Arrays.asList(colores);
		System.out.println("Lista original: "+lista);
		
		Collections.sort(lista);
		System.out.println("Lista ordenada: "+lista);
		
		Collections.reverse(lista);
		System.out.println("Lista invertidad: "+lista);
		
		
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(new Persona("Jhovin"));
		personas.add(new Persona("Maho"));
		personas.add(new Persona("Boni"));
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}
		
		System.out.println("================");
		
		// De forma anónima
		
//		Collections.sort(personas,new Comparator<Persona>() {
//
//			@Override
//			public int compare(Persona persona1, Persona persona2) {
//				return persona1.nombre.compareTo(persona2.nombre);
//			}
//			
//		});
		//Instanciando una clase
		Collections.sort(personas,new compararNombrePersona());
		
		
		
		for (Persona persona : personas) {
			System.out.println(persona);
		}

		
	}
	public void imprimirNombres(String ... nombres) {
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
}
	class Persona implements Comparator<Persona>{
		 
		String nombre;
		
		public Persona(String nombre) {
			this.nombre = nombre;
		}

		@Override
		public String toString() {
			return "nombre=" + nombre + "";
		}

		@Override
		public int compare(Persona persona1, Persona persona2) {
			return persona1.nombre.compareTo(persona2.nombre);
		}
		
	}
	
	class compararNombrePersona implements Comparator<Persona>{
	
	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.nombre.compareTo(persona2.nombre);
	}

}

