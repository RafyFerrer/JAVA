import Dias_Semana.*;

import java.util.*;

public class SacarDiaSemana{

	public static void main (String[] args){

		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Introduce Número de día de la Semana: ");
		int DiaDeLaSemana = sc.nextInt ();
		DiaSemana ds = new DiaSemana (DiaDeLaSemana);
		System.out.println ("El día de la semana es " + ds.getDia());
		
		}

	}	
