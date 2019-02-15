package br.com.fiap.entily;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table (name="T_PRODUTO")
@SequenceGenerator(name="produto",sequenceName="sq_t_produto",allocationSize=1 )
public class Produto {
	
	@Id
	@GeneratedValue(generator="produto",strategy=GenerationType.SEQUENCE)
	private int codigo;
	//NULLABLE = FALSO DEIXA O CAMPO OBRIGATORIO , SEM NULOS. 
	@Column(name="nm_produto", nullable= false, length = 255)
	private String nome;
	@Column(name="qt_produto",nullable= false)
	private int quantidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name="nm_estado")
	private  Estado estado;
	
	@Temporal(value=TemporalType.DATE) //SOMENTE A DATA
	@Column(name="dt_validade")
	private Calendar dataValidade;
	
	@Temporal(value=TemporalType.TIMESTAMP) //DATA E HORA
	@Column(name="dt_fabricacao")
	private Calendar dataFabricacao;
	//@creationTimeStamp // cria automaticamente a data no cadastro
	@Temporal(value=TemporalType.DATE)
	@Column(updatable=false)
	private Calendar dataCadastro;
	@Column(name="vl_preco", nullable= false)
	private double preco;
	
	@Transient //NÃO SERÁ COLUNA NA BASE DE DADOS
	private int idade;
	
	@Lob //GRAVA IMAGEM 
	private byte[] imagem;
	

	public Produto(String nome, int quantidade, Estado estado, Calendar dataValidade, Calendar dataFabricacao,
			double preco, byte[] imagem) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.estado = estado;
		this.dataValidade = dataValidade;
		this.dataFabricacao = dataFabricacao;
		this.preco = preco;
		this.imagem = imagem;
	}



	public Produto() {
		super();
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Calendar getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Calendar dataValidade) {
		this.dataValidade = dataValidade;
	}

	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}
	
	
	
	
	
	
	

}
