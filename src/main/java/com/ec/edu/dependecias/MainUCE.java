package com.ec.edu.dependecias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		
		System.out.println("Ingrese Nombre");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese Apellido");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese Calle");
		String calle = scanner.nextLine();
		
		
		System.out.println("Ingrese Numeracion");
		String num = scanner.nextLine();
		
		System.out.println("Escoga facultad");
		System.out.println("1. Odontologia");
		System.out.println("2. Sistemas");
		
		int tipo = scannerInt.nextInt();
		

		Matricula matricula = new Matricula();
		matricula.setAnho(2015);
		matricula.setSemestre("Sexto");
		
		matricula.matricular(nombre, apellido, calle, num,tipo);
	}

}
