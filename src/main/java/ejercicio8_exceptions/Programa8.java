package ejercicio8_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese el numerador");
			int numerador = sc.nextInt();
			System.out.println("Ingrese el denominador");
			int denominador = sc.nextInt();
			
			int resultado = division2(numerador, denominador);
			System.out.println("Resultado: "+resultado);
	
		} catch (InputMismatchException ie) {
			System.out.println("Ingrese un numero válido");
		}
		 catch (ArithmeticException ae) {
				System.out.println("Error aritmético en main");
			}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("Ocurrio un error ");
//		}
		finally {
			System.out.println("Finally main");
			sc.close();
		}
		
		
	}

	private static int division(int numerador, int denominador) {
		try {
			return numerador/ denominador;
		}catch (ArithmeticException ae) {
			System.out.println("Error aritmético");
			return -1;
		}finally {
			System.out.println("Finally division");
		}
	}
	private static int division2(int numerador, int denominador)throws ArithmeticException {
		try {
			return numerador/ denominador;
		}catch (ArithmeticException ae) {
			throw ae;		
		}finally {
			System.out.println("Finally division2");
		}
	}

}
