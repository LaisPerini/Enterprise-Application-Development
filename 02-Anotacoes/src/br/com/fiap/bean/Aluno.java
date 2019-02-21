package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.anotacao.Tabela;

@Tabela(nome="TAB_ALUNO")
public class Aluno {
	
	@Coluna(nome = "nr_matricula", obrigatorio = true)
	private int matricula;
	@Coluna(nome = "nm_aluno", obrigatorio = true)
	private int nome;
	@Coluna(nome = "dt_nasc", obrigatorio = true)
	private Calendar dataNascimento;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
