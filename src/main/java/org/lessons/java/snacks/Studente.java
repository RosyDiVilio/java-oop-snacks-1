package org.lessons.java.snacks;

public class Studente {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Studente (String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String infoStudente() {
		return this.nome + " " + this.cognome + ", " + this.eta + " anni";
	}

	public static void main(String[] args) {
		Studente studenteUno = new Studente("Pinco", "Pallino", 25);
		System.out.println(studenteUno.infoStudente());

	}

}
