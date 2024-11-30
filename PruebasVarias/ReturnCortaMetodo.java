// Efectivamente comprobamos que un return corta la ejecución del metodo

class ReturnCortaMetodo {

	public static void main (String[] args){
		
		Clase c = new Clase(1);
		
		System.out.println (c.metodo());
	}
	
}

class Clase {
	int a;
	
	public Clase (int a) {
		this.a=a;
	}
	
	public String metodo() {
		if (this.a==1)
			return "Hemos terminado";
		a=2;
		return "esto es un 2";
	}
	
}
		