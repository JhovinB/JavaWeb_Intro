package ejercicio8_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa8_3_with_resources {
	
	public static void main(String[] args) {
	
		try( Scanner sc = new Scanner(new File("src/main/resources/alumnos.txt"))){		
			while (sc.hasNext()) {
				 System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException fe) {
			//fe.printStackTrace();
			System.out.println("Archivo no se encontrado");
		}
		
	}
	//forma  anterior
	public static void leerArchivo() {
		Scanner sc = null;
		try {
			 sc = new Scanner(new File("src/main/resources/alumnos.txt"));
			 while (sc.hasNext()) {
				 System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException fe) {
			//fe.printStackTrace();
			System.out.println("Archivo no se encontrado");
		}finally {
			if (sc!=null) {
				sc.close();
			}
			
		}
	}
}
