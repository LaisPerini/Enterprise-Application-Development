package br.com.fiap.beans;

import java.util.Calendar;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome = "TAB_CLIENTE")
public class Cliente {
	@Coluna(nome = "nm_cliente",obrigatorio = true)
	private String nome;
	@Coluna(nome = "cd_cliente",obrigatorio = true)
	private int id;
	@Coluna(nome = "dt_nasc",obrigatorio = false)
	private Calendar dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
