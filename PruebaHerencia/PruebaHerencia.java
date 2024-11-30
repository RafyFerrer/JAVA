package org.PruebaHerencia;

public class PruebaHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Policia juan = new Policia (2,2);
		System.out.println ("tiene "+juan.numeroBrazos+" Brazos");
		System.out.println ("tiene "+juan.numeroOjos+" Ojos");
		System.out.println ("tiene "+juan.pistolas+" Pistolas");
		System.out.println ("tiene "+juan.porras+" Porras");
		juan.andar();

	}

}


