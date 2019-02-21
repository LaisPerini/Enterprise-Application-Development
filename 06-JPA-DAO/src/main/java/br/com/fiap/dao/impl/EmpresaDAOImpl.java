package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.EmpresaDAO;
import br.com.fiap.dao.exception.CommitException;
import br.com.fiap.entity.Empresa;

public class EmpresaDAOImpl implements EmpresaDAO{
	
	private EntityManager em;
	
	public EmpresaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public void cadastrar(Empresa empresa) {
		em.persist(empresa);
	}

	public void atualizar(Empresa empresa) {
		em.persist(empresa);
		
	}

	public void excluir(int codigo) {
		Empresa empresa = em.find(Empresa.class, codigo);
		em.remove(empresa);
		
		
	}

	public Empresa pesquisar(int codigo) {
		return em.find(Empresa.class, codigo);
	}

	
	public void commit() throws CommitException {
		try {
			
		em.getTransaction().begin();
		em.getTransaction().commit();
	}catch(Exception e) {
		e.printStackTrace();
		em.getTransaction().rollback();
		throw new CommitException();
		
	}
	
	
}

}