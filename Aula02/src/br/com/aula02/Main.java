package br.com.aula02;

public class Main {
	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		System.out.println("CANETA 01");
		c1.modelo = "BIC Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.destampar();
		c1.status();
		c1.rabiscar();
		System.out.println("");
		
		Caneta c2 = new Caneta();
		System.out.println("CANETA 02");
		c2.modelo = "FaberCastel";
		c2.cor = "Rosa";
		c2.carga = 90;
		
		c2.tampar();
		c2.status();
		c2.rabiscar();
				
	}

}
