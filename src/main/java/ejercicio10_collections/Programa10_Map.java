package ejercicio10_collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Programa10_Map {

	public static void main(String[] args) {
		
		Map<String, String> mapa = new HashMap<>();
		mapa.put("CO","Colombia");
		mapa.put("PE","Perú");
		mapa.put("CH","Chile");
		mapa.put("US","Estados Unido");
//		mapa.put("EC","Ecuador");
		
		//Impresion por llave
		for (String llave : mapa.keySet()) {
			System.out.println(llave);
		}
		//Impresion por valores
		for (String valor : mapa.values()) {
			System.out.println(valor);
		}
		//Agregalo si es q esta ausente->putIfAbsent
				mapa.putIfAbsent("EC", "Quito");
			
		//Impresion por entrySet
		for (Entry<String, String> entry : mapa.entrySet()) {
			System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
		}
		
		System.out.println(mapa.get("PE"));
		
	}

}
