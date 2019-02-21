package br.com.fiap.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;

public class RefreshTeste {
	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		//Atualizar o objeto com os valores do Banco
		//Pesquisar um cliente
		Cliente cliente = em.find(Cliente.class, 1);
		System.out.println("Valor do banco: " + cliente.getNome());
		
		//Alterar o valor do nome no Java
		cliente.setNome("Nilson");
		System.out.println("Nome modificado no java: " + cliente.getNome());
		//Realizar o refresh
		em.refresh(cliente);
		//Exibir o nome
		System.out.println("Nome após o refresh: " + cliente.getNome());
	}

}
