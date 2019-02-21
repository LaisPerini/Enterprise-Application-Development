package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Genero;

public class Exercicio {
	public static void main(String[] args) {
		//Realizar o CRUD para o produto
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("CLIENTE_ORACLE");
		EntityManager em = fabrica.createEntityManager();
		
		
		//Cadastrar
		Cliente c = new Cliente("Thiago Yama", new GregorianCalendar(1985, Calendar.FEBRUARY, 22), "123.123.123-99", Genero.MASCULINO, null, true);
		em.persist(c);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		//Pesquisar
		c = em.find(Cliente.class, 2);
		System.out.println("Dado Antigo: " + c.getNome());
		
		
		//Atualizar
		c = new Cliente(2, "Lais", new GregorianCalendar(1996, Calendar.SEPTEMBER , 16), "123.123.123-99", Genero.FEMININO, null, true);
		em.merge(c);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		
		//Remover
		c = em.find(Cliente.class, 2);
		em.remove(c);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
	}

}
