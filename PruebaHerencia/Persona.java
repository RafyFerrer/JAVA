package org.PruebaHerencia;

// Superclase Persona.

public class Persona {
	protected int numeroBrazos;
	protected int numeroOjos;
	
	public Persona (int numeroBrazos, int numeroOjos) {
		this.numeroBrazos = numeroBrazos;
		this.numeroOjos = numeroOjos;
	}
	
	protected void andar () {
		System.out.println ("He andado");
	}
}
