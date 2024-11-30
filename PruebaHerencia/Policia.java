package org.PruebaHerencia;

// Subclase policia que depende de la superclase Persona
public class Policia extends Persona {
	public int pistolas;
	public int porras;
	
	public Policia (int pistolas, int porras) {
		super (2,2); //hace referencia al constructor de la superclase
		this.pistolas=pistolas;
		this.porras = porras;
	}
}
