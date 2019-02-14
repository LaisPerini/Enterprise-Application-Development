package br.com.fiap.entily;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="T_PRODUTO")
@SequenceGenerator(name="produto",sequenceName="sq_t_produto",allocationSize= )
public class Produto {
	
	@Id
	@GeneratedValue(generator="produto",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_produto")
	private String nome;
	@Column(name="qt_produto")
	private int quantidade;
	@Column(name="nm_estado")
	private  Estado estado;
	@Column(name="dt_validade")
	private Calendar dataValidade;
	@Column(name="dt_fabricacao")
	private Calendar dataFabricacao;
	private double preco;
	
	
	
	

}
