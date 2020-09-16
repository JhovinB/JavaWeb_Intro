package com.jbac.javaweb.intro;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	CuentaBancaria cuenta = null;
	boolean salir = false;
	double monto = 0;
	
	do {
			System.out.println("#######################");
			System.out.println("Elige una opcion del menú");
			System.out.println("1.Crear Cuenta");
			System.out.println("2.Hacer Depósito");
			System.out.println("3.Hacer un retiro");
			System.out.println("4.Consultar Saldo");
			System.out.println("5.Salir");	
		
			int opcion = sc.nextInt();
			
			
			switch (opcion) {
			case 1:
				//Crear cuenta
				System.out.println("Ingresa el numero de cuenta");
				String numeroCuenta = sc.next();
				
				System.out.println("Ingresa el titular de la cuenta");
				String titular = sc.next();
				
				System.out.println("¿Desea realizar un depósito inicial?");
				boolean isDeposito = sc.nextBoolean();
				
				if (isDeposito) {
					System.out.println("Ingresa el monto inicial");	
					 monto = sc.nextDouble();
					 cuenta= new CuentaBancaria(numeroCuenta,titular,monto);
				}else {
					 cuenta= new CuentaBancaria(numeroCuenta,titular);
					
				}
				break;
			case 2:
				//Deposito		
				System.out.println("Ingresa el monto a Depositar");
				 monto  = sc.nextDouble();
				cuenta.deposito(monto);
				break;
				
			case 3:
				//Retiro
				System.out.println("Ingresa el monto a Retirar");
				 monto  = sc.nextDouble();
				cuenta.retiro(monto);
				break;
			case 4:
				//Consultar Saldo
				System.out.println("El saldo es: "+cuenta.getSaldo());
			
				break;
			default:
				System.out.println("Gracias te esperamos pronto");
				salir = true;
				break;
			}
				System.out.println("Cuenta creada: "+cuenta.toString());
	
		}while(!salir);
	
	}

}
