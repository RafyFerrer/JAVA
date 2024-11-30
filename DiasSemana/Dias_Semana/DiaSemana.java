package Dias_Semana;

public class DiaSemana {

	private int NumeroDia;
	private String Dia;

	public DiaSemana (int n){

		this.NumeroDia = n;
		calculaDia();

	}

	public void setNumeroDia (int n){

		this.NumeroDia = n;
		calculaDia();
	}

	public int getNumeroDia (){
		return this.NumeroDia;
	}
	
	public String getDia (){

		return this.Dia;
	}

	private void calculaDia(){

		switch (this.NumeroDia) {

			case 1:
				this.Dia = "Lunes";
				break;
			
 			case 2:
				this.Dia = "Martes";
				break;
	
			case 3:
				this.Dia = "Miercoles";
				break;
			case 4:
				this.Dia = "Jueves";
				break;
			case 5:
				this.Dia = "Viernes";
				break;
			case 6:
				this.Dia = "Sábado";
				break;
			case 7:
				this.Dia = "Domingo";
				break;
			default:
				this.Dia = "No Existe";

		}

	}	

}