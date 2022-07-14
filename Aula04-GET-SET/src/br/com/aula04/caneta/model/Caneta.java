package br.com.aula04.caneta.model;

public class Caneta {
	
	//ATRIBUTOS
	public String modelo;
	private float ponta;
	
	//MÉTODOS
	public String getModelo() {
		return this.modelo;
	}
	public void setModelo(String m) {
		this.modelo = m;
	}
	public float getPonta() {
		return ponta;
	}
	public void setPonta(float p) {
		this.ponta = p;
	}
	
	public void status() {
		System.out.println("SOBRE A CANETA: ");
		System.out.println("MODELO: " + this.modelo);
		System.out.println("PONTA: " + this.ponta);
	}

}
