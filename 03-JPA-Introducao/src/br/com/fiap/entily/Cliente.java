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
@Table(name= "T_CLIENTE")
@SequenceGenerator(name = "cliente" ,sequenceName="SQ_T_CLIENTE",allocationSize=1)
public class Cliente {

	@Id
	@GeneratedValue(generator="cliente",strategy= GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_cliente",nullable= false,length= 100)	
	private String nome;
	
	@Temporal(value=TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;
	
	@Column(name="nr_cpf",nullable= false,length = 14)
	private String Cpf;
	
	@Enumerated(EnumType.STRING)
	@Column(name="nm_genero")
	private Genero genero;
	
	@Temporal(value= TemporalType.TIMESTAMP)
	@Column(name="dt_cadastro",updatable=false,nullable=false)
	private Calendar dataCadastro;
	
	@Lob
	@Column(name="fl_foto")
	private String imagem;
	
	@Column(name="st_vip")
	private boolean status;
	
	@Transient
	private long numeroCartao;
	

	public Cliente() {
		super();
	}
	

	public Cliente(String nome, Calendar dataNascimento, String cpf, Genero genero, Calendar dataCadastro,
			String imagem, boolean status, long numeroCartao) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		Cpf = cpf;
		this.genero = genero;
		this.dataCadastro = dataCadastro;
		this.imagem = imagem;
		this.status = status;
		this.numeroCartao = numeroCartao;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(long numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	
	
	
	

}
