package org.lessons.java.snackdue;

public class ContoBancario {
	
	private int conto;
	private float saldo;
	public static float deposita;
	public static float preleva;
	public static float saldoCorrente;
	
	
	public ContoBancario (int conto, float deposita, float preleva, float saldoCorrente) {
		this.conto = conto;
		this.saldo = 0;
		this.deposita = deposita;
		this.preleva = preleva;
		this.saldoCorrente = deposita - preleva;
	}
	
	
	public String infoConto() {
		return "Numero conto: " + this.conto + ", " + "Cifra depositata: " + this.deposita + ", " + "Cifra prelevata: " + this.preleva + " " + "Saldo finale: " + this.saldoCorrente;
	}
	

	public static void main(String[] args) {
		
		ContoBancario contoUno = new ContoBancario(1122334455,10500, 250, 0);
		ContoBancario contoDue = new ContoBancario(66778899, 2500, 150, 0);
		System.out.println(contoUno.infoConto());
		System.out.println(contoDue.infoConto());

	}

}
