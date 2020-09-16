package ejercicio10_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ejercicio8_exceptions.CuentaAhorro;

public class Programa10_introl {

	public static void main(String[] args) {
		
//		usodeArrayList();
		//Convertir una arrays en Listas
//		String [] colores = {"rojo","azul","celeste"};
//		List<String> lista = Arrays.asList(colores);
		
//		linkedList();
		int cantidad = 5000;
		List<String> arrayList = new ArrayList<>();
		List<String> linkedList = new LinkedList<>();
		
		long inicio =0;
		long fin = 0;
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <cantidad; i++) {
			arrayList.add("Elemento "+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Agregar ArrayList: "+(fin-inicio)+" ms");
	
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <cantidad; i++) {
			linkedList.add("Elemento "+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Agregar LinkedList: "+(fin-inicio)+" ms");
		
		//obtener
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <cantidad; i++) {
			arrayList.get(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Obtener ArrayList: "+(fin-inicio)+" ms");
	
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <cantidad; i++) {
			linkedList.get(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Obtener LinkedList: "+(fin-inicio)+" ms");
		
		//Modificar 
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <cantidad; i++) {
			arrayList.set(i,"Modificado "+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Modificado ArrayList: "+(fin-inicio)+" ms");
	
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <cantidad; i++) {
			linkedList.set(i,"Modificado "+i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Modificado LinkedList: "+(fin-inicio)+" ms");			
			
		//Eliminar
		
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <arrayList.size(); i++) {
			arrayList.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Eliminar ArrayList: "+(fin-inicio)+" ms");
	
		inicio = System.currentTimeMillis();
		
		for (int i = 0; i <linkedList.size(); i++) {
			linkedList.remove(i);
		}
		fin = System.currentTimeMillis();
		System.out.println("Eliminar LinkedList: "+(fin-inicio)+" ms");	
		
			
		
	}

	private static void linkedList() {
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("rojo");
		lista.add("azul");
		lista.add("celeste");
		
		lista.addFirst("morado");
		
		imprimir(lista);
	}

	private static void imprimir(List<String> lista) {
		for (String color : lista) {
			System.out.println(color);
		}
	}

	private static void usodeArrayList() {
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Jhovin");
		nombres.add("123");
		nombres.add(Boolean.toString(true));
		//Iteracion for each
		for (String nombre : nombres) {
			System.out.println(nombre.toString());
		}
		//Uso de Iterator
		Iterator<String> iterator = nombres.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		List<CuentaAhorro> cuentas = new ArrayList<>();
		cuentas.add(new CuentaAhorro("123456","Jhovin"));
		cuentas.add(new CuentaAhorro("987654","Maho"));
		cuentas.add(new CuentaAhorro("249708","Boni"));
		System.out.println("Cuentas: ");
		
		for (CuentaAhorro cuentaAhorro : cuentas) {
			System.out.println(cuentaAhorro);
		}
	}


}
