package com.jbac.javaweb.intro;

public class Program1_1 {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria("123456","Maho");
	
		
		CuentaBancaria cuenta2 = new CuentaBancaria("987654","Jhovin");
		
		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
	}

}
