package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class PesquisaTeste {
	public static void main(String[] args) {
		//Pesquisar um cliente com código 1
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		EntityManager em = fabrica.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1);
		System.out.println("Dado antigo: " + cliente.getNome());
		
		//Atualizar o dado
		cliente.setNome("Felipe");
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		System.out.println("Dado atualizado: " + cliente.getNome());
		
		em.close();
		fabrica.close();
		
	}

}
