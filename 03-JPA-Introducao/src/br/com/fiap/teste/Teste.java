package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	
	public static void main ( String[]args) {
		//CRIAR PRIMEIRO GERENCIADOR DE ENTIDADES 
		//PRIMEIRO CRIA A FABRICA
		
		EntityManagerFactory fabrica 
		= Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		
		//DEPOIS, A FABRICACAO CRIA A ENTITY MANAGER
		
		EntityManager em = fabrica.createEntityManager();
		
		em.close();
		fabrica.close();
		
		
		
		
		
	}

}
