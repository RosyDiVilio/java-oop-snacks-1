package org.lessons.java.snacktre;

public class RegistroStudenti {
	
	private String nome;
	private String cognome;
	private int eta;
	private String classe;
	
	private Studenti [] studente;
	
	public RegistroStudenti() {
		this.studente = new Studenti[0];
	}
	
	public RegistroStudenti (String nome, String cognome, int eta, String classe) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.classe = classe;
	}
	
	public void nuovoStudente(RegistroStudenti nuovoStudente) {
		//nuovo array più lungo di un elemento
		RegistroStudenti[] nuoviStudenti = new RegistroStudenti[this.studente.length + 1];
		//copio array vecchio registro nel nuovo (
		for (int i = 0; i < this.studente.length; i++); {
			//per ogni elemento del vecchio array
			//lo aggiungo al nuovo array, nello stesso posto
			nuoviStudenti[i] = this.studente[i];
		}
		//il posto vuoto vuoto viene riempito con un nuovo studente
		nuoviStudenti[nuoviStudenti.length - 1] = nuovoStudente;
		//sostituisco l'indirizo del vecchio registro con il nuovo
		this.studente = nuoviStudenti;
	}
	
	public String infoStudente() {
		return this.nome + " " + this.cognome + ", " + this.eta + " anni" + ", " + this.classe;
	}

	public static void main(String[] args) {
		
		RegistroStudenti registro = new RegistroStudenti();
		
		RegistroStudenti studenteUno = new RegistroStudenti("Pinco", "Pallo", 20, "3F");
		RegistroStudenti studenteDue = new RegistroStudenti("Tizio", "Caio", 19, "2A");
		System.out.println(registro.infoStudente());

	}

}
