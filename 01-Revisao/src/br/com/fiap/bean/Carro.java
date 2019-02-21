package br.com.fiap.bean;

import java.util.Calendar;

public class Carro {
	
	//Constante
	public static final String EXEMPLO_TESTE = "teste";
	
	//public, private
	//protected -> no mesmo pacote e na herança.
	//default/package -> no mesmo pacote.
	
	private String cor;
	private Transmissao cambio;
	private Calendar dataLancamento;
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public Transmissao getCambio() {
		return cambio;
	}

	public void setCambio(Transmissao cambio) {
		this.cambio = cambio;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

}
