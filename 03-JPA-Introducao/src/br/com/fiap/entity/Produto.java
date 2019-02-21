package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity; //Implementação do JPA e não do Hibernate
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

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "T_PRODUTO")
@SequenceGenerator(name = "produto", sequenceName = "SQ_T_PRODUTO", allocationSize = 1)
// name = nome que será usado no java, sequenceName será usado na base de dados
public class Produto {

	@Id
	@Column(name = "cd_produto")
	@GeneratedValue(generator = "produto", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "nm_produto", nullable = false, length = 50)
	private String nome;

	@Column(name = "qt_produto", nullable = false)
	private int quantidade;

	@Column(name = "ds_estado")
	@Enumerated(EnumType.STRING)
	private Estado estado;

	@Column(name = "dt_validade")
	@Temporal(TemporalType.DATE) // Somente a data
	private Calendar dataValidade;

	@Column(name = "dt_fabricacao", nullable = false)
	@Temporal(TemporalType.DATE) // Somente a data
	private Calendar dataFabricacao;

	@Column(name = "dt_cadastro", nullable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP) // Data e hora *Padrão
	@CreationTimestamp // cria automaticamente a data do cadastro
	private Calendar dataCadastro;

	@Column(name = "vl_produto", nullable = false)
	private float preco;

	@Transient // Não será coluna na base dados
	private int idade;

	@Lob
	private byte[] imagem;

	// Inserir Registro no Banco
	public Produto(String nome, int quantidade, Estado estado, Calendar dataValidade, Calendar dataFabricacao,
			float preco, byte[] imagem) {
		super();
		setNome(nome);
		setQuantidade(quantidade);
		setEstado(estado);
		setDataValidade(dataValidade);
		setDataFabricacao(dataFabricacao);
		setPreco(preco);
		setImagem(imagem);
	}

	// Atualizar Registros no Banco
	public Produto(int codigo, String nome, int quantidade, Estado estado, Calendar dataValidade,
			Calendar dataFabricacao, float preco, byte[] imagem) {
		super();
		setCodigo(codigo);
		setNome(nome);
		setQuantidade(quantidade);
		setEstado(estado);
		setDataValidade(dataValidade);
		setDataFabricacao(dataFabricacao);
		setPreco(preco);
		setImagem(imagem);
	}

	public Produto() {
		super();
	}

	// Getters & Setters

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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
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
