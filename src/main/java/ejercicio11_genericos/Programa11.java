package ejercicio11_genericos;

import java.util.ArrayList;
import java.util.List;

public class Programa11 {

	public static void main(String[] args) {

		List<Estudiante> estudiantes = new ArrayList<>();		
		estudiantes.add(new Estudiante("Jhovin"));
		estudiantes.add(new Estudiante("Maho"));
		estudiantes.add(new Estudiante("Boni"));
		
		imprimirWaikarSuper(estudiantes);

		List<Persona> personas = new ArrayList<Persona>();		
		personas.add(new Persona("Diego"));
		personas.add(new Persona("Jaime"));
	
		imprimirWaikarSuper(personas);
		
		System.out.println();
		Estudiante e1 = new Estudiante("Andres");
		imprimir(e1);
		Persona p1 = new Persona("Juan");
		imprimir(p1);
		
	}
	
	//T-->método de tipo generico
	private static <T>void imprimir(List<T> lista) {
		for (T elemento : lista) {
			System.out.println(elemento);
		}
	}
	//List<?>-->tipo wilcard //extends Persona-->la clase Padre
	private static void imprimirWaikarExtends(List<? extends Persona> lista) {
		for (Persona elemento : lista) {
			System.out.println(elemento.nombre);
		}
	}
	//List<?>--> tipo wildcard (wailkar)// super Estudiante-->la clase hija
	private static void imprimirWaikarSuper(List<? super Estudiante> lista) {
		for (Object elemento : lista) {
			System.out.println(((Persona)elemento).nombre);
		}
	}
	private static void imprimir(Persona persona) {
		System.out.println(persona.nombre);
	}
}
class Persona{
	String nombre;
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
		
}

class Estudiante extends Persona{
	
	int nota;
	
	public Estudiante(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", nombre=" + nombre + "]";
	}

	

}
class Docente extends Persona{
	
	String curso;
	
	public Docente(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Docente [curso=" + curso + ", nombre=" + nombre + "]";
	}
	
}
