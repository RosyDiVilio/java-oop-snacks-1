package org.lessons.java.snackdue;

public class ContoBancario {
	
	private int conto;
	private float saldo;
	public static float deposita;
	public static float preleva;
	
	
	public ContoBancario (int conto) {
		this.conto = conto;
		this.saldo = 0;
	}
	
	public float getsaldo() {
		return this.saldo;
	}
	
	public void deposita (float cifraDepositata){
		this.saldo += cifraDepositata;
	}
	
	public void preleva (float cifraPrelevata) {
		this.saldo -= cifraPrelevata;
	}
	
	
	public static void main(String[] args) {
		
	}

}
