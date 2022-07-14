package br.com.aula02;

public class Caneta {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	protected boolean tampada;
	
	//M�TODOS
	public void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Est� tampada? "+ this.tampada);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga: "+ this.carga);
	}
	public void rabiscar(){
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar com a caneta tampada.");
		} else {
			System.out.println("Rabiscando...");
		}
		
	}
	protected void tampar() {
		this.tampada = true;
		
	}
	 protected void destampar() {
		this.tampada = false;
		
	}
	

}
