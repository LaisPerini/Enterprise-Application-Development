package br.com.fiap.dao;

import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.entity.Empresa;

public interface EmpresaDAO {
	
	void cadastrar(Empresa empresa);
	
	void atualizar(Empresa empresa);
	
	void excluir(int codigo);
	
	void commit() throws CommitException;
	
	Empresa pesquisar(int codigo);
	
	
	
	

}
