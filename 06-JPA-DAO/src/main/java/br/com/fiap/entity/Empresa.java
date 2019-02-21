package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * T_EMPRESA
 * CD_EMPRESA(NUMBER)(PK) (SQ_T_EMPRESA)
 * NM_FANTASIA (VARCHAR(50)
 * DT_ABERTURA (DATE)
 * DS_STATUS (NUMBER) ENUM
 * NR_CNPJ (VARCHAR(18))
 * 
 */

@Entity
@Table(name = "T_EMPRESA")
@SequenceGenerator(name = "empresa", sequenceName = "SQ_T_EMPRESA", allocationSize = 1)

public class Empresa {
@Id 
@Column
@GeneratedValue(generator = "empresa" , strategy = GenerationType.SEQUENCE)
	private int codigo;
	
@Column(name = "nm_fantasia", length = 50,nullable = false)
	private String nomeFantasia;

@Column(name = "dt_abertura")
@Temporal(TemporalType.DATE)
	private Calendar dataAbertura;

@Enumerated(EnumType.STRING)
@Column (name = "ds_status")
    private Status status; 

@Column(name = "nr_cnpj", length = 18,nullable = false)
    private String cnpj;


public Empresa() {
	super();
}

public Empresa(int codigo, String nomeFantasia, Calendar dataAbertura, Status status, String cnpj) {
	super();
	this.codigo = codigo;
	this.nomeFantasia = nomeFantasia;
	this.dataAbertura = dataAbertura;
	this.status = status;
	this.cnpj = cnpj;
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNomeFantasia() {
	return nomeFantasia;
}

public void setNomeFantasia(String nomeFantasia) {
	this.nomeFantasia = nomeFantasia;
}

public Calendar getDataAbertura() {
	return dataAbertura;
}

public void setDataAbertura(Calendar dataAbertura) {
	this.dataAbertura = dataAbertura;
}

public Status getStatus() {
	return status;
}

public void setStatus(Status status) {
	this.status = status;
}

public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

}


