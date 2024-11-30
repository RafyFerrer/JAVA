package org.MiPrimeraAPP;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MiPrimeraAPP {

	public static void main(String[] args) {
		
		// Salida estandard por consola. Simplemente usando método de clase de la clase out perteneciente a System.
		
		System.out.println("Hola Mundo o lo que mayormente viene siendo Hellow World");
		
		/* Entrada por teclado donde he de usar un objeto de la clase Scanner que se instancia
		 * pasando como parámetros al constructor la case in de System.
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		String a = entrada.nextLine();
		
		System.out.println(a + " es el número que has introducido por teclado");
		
		String b=JOptionPane.showInputDialog("Mete un dato y pulsa un bótón");
		
		System.out.println(b + " Es el dato que has introducido");

	}

}
