package es.studium.Descomponer;

import java.util.Scanner;

public class Descomponer {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		//Variables
		String cad1;
		
		//Inicio
		System.out.println("Escriba una cadena:");
		cad1 = teclado.nextLine();
		String[] cad2 = cad1.split(" "); 
		for(int i=0;i<cad2.length;i++) {
			System.out.println(cad2[i]);
		}
		teclado.close();
	}
}
